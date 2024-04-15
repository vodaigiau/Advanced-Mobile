package com.example.testandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.ViewFlipper;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity implements ProductAdapter.OnDeleteButtonClickListener {

    private Retrofit retrofit;
    private ProductService productService;
    private ListView productListView;
    private ProductAdapter adapter;
    ViewFlipper viewFlipper;
    private static final int ADD_PRODUCT_REQUEST = 1;
    private static final int EDIT_PRODUCT_REQUEST = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        productListView = findViewById(R.id.product_list);
        viewFlipper = findViewById(R.id.viewflipper); // Khởi tạo viewFlipper
        ActionViewFlipper(); // Gọi phương thức ActionViewFlipper để thiết lập quảng cáo

        retrofit = new Retrofit.Builder()
                .baseUrl("http://10.0.2.2:8080/heii/rest/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        productService = retrofit.create(ProductService.class);
        ActionViewFlipper();
        getProductList();

        Button addButton = findViewById(R.id.add_button);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AddProduct.class);
                startActivityForResult(intent, ADD_PRODUCT_REQUEST);
            }
        });

        Button editButton = findViewById(R.id.edit_button);
        editButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Product selectedProduct = adapter.getSelectedProduct();
                if (selectedProduct != null) {
                    Intent intent = new Intent(MainActivity.this, EditProduct.class);
                    intent.putExtra("product", selectedProduct);
                    startActivityForResult(intent, EDIT_PRODUCT_REQUEST);
                } else {
                    Toast.makeText(MainActivity.this, "Vui lòng chọn sản phẩm để sửa", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void ActionViewFlipper() {
        List<String> mangquangcao=new ArrayList<>();
        mangquangcao.add("https://tse4.mm.bing.net/th?id=OIP.i4W82_vbaPDBWuOF4A6EWAHaD3&pid=Api&P=0&h=220");
        mangquangcao.add("https://hoanghamobile.com/tin-tuc/wp-content/uploads/2019/04/dien-thoai-va-phu-kien-gia-re-0.jpg");
        mangquangcao.add("https://samcenter.vn/images/thumbs/0003212_Web%20-%20793x448-7_1900.png");
        for (int i=0;i<mangquangcao.size();i++){
            ImageView imageView=new ImageView(getApplicationContext());
            Glide.with(getApplicationContext()).load(mangquangcao.get(i)).into(imageView);
            viewFlipper.addView(imageView);
        }
        viewFlipper.setFlipInterval(3000);
        viewFlipper.setAutoStart(true);
//        Animation slide_in= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_in_right);
//        Animation slide_out= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_out_right);
//        viewFlipper.setInAnimation(slide_in);
//        viewFlipper.setOutAnimation(slide_out);
    }

    private void getProductList() {
        Call<List<Product>> call = productService.getProductFromRestAPI();
        call.enqueue(new Callback<List<Product>>() {
            @Override
            public void onResponse(Call<List<Product>> call, Response<List<Product>> response) {
                if (response.isSuccessful()) {
                    List<Product> productList = response.body();
                    if (productList != null && !productList.isEmpty()) {
                        adapter = new ProductAdapter(MainActivity.this, productList, MainActivity.this);
                        productListView.setAdapter(adapter);
                    }
                }
            }

            @Override
            public void onFailure(Call<List<Product>> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Không thể tải danh sách sản phẩm", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onDeleteButtonClicked(int productId) {
        deleteProduct(productId);
    }

    private void deleteProduct(int productId) {
        Call<Void> call = productService.deleteProduct(productId);
        call.enqueue(new Callback<Void>() {
            @Override
            public void onResponse(Call<Void> call, Response<Void> response) {
                if (response.isSuccessful()) {
                    getProductList();
                    Toast.makeText(MainActivity.this, "Xóa sản phẩm thành công", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Xóa sản phẩm thất bại", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<Void> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Lỗi khi xóa sản phẩm", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            if (requestCode == ADD_PRODUCT_REQUEST || requestCode == EDIT_PRODUCT_REQUEST) {
                // Refresh the product list
                getProductList();
            }
        }
    }
}
