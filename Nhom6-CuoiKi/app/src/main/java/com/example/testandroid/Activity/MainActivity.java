package com.example.testandroid.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.ViewFlipper;

import com.bumptech.glide.Glide;
import com.example.testandroid.Entities.Cart;
import com.example.testandroid.Entities.Product;
import com.example.testandroid.Adapter.ProductAdapter;
import com.example.testandroid.Service.ProductService;
import com.example.testandroid.R;
import com.nex3z.notificationbadge.NotificationBadge;

import java.util.ArrayList;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity implements ProductAdapter.OnDeleteButtonClickListener, ProductAdapter.OnAddToCartButtonClickListener, ProductAdapter.OnDetailButtonClickListener {

    private Retrofit retrofit;
    private ProductService productService;
    private ListView productListView;
    private ProductAdapter adapter;
    private Cart mCart;
    ViewFlipper viewFlipper;
    private static final int ADD_PRODUCT_REQUEST = 1;
    private static final int EDIT_PRODUCT_REQUEST = 2;
    private List<Product> mOriginalProductList; // to keep a copy of the original product list

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewFlipper=findViewById(R.id.viewflipper);
        productListView = findViewById(R.id.product_list);
        mCart = ((MyApplication) getApplication()).getCart(); // Get Cart from Application

        retrofit = new Retrofit.Builder()
                .baseUrl("http://10.0.2.2:8080/heii/rest/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        productService = retrofit.create(ProductService.class);
        ActionViewFlipper();
        getProductList();

        ImageView viewCartImageView = findViewById(R.id.cart);
        viewCartImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CartActivity.class);
                startActivity(intent);
            }
        });

        ImageView loginAdmin = findViewById(R.id.loginadmin);
        loginAdmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DangNhapActivity.class);
                startActivity(intent);
            }
        });

        androidx.appcompat.widget.SearchView searchView = findViewById(R.id.search_view);
        searchView.setOnQueryTextListener(new androidx.appcompat.widget.SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                filter(newText);
                return false;
            }
        });
    }

    private void ActionViewFlipper() {
        List<String> mangquangcao=new ArrayList<>();
        mangquangcao.add("https://mauweb.monamedia.net/thegioididong/wp-content/uploads/2017/12/banner-big-ky-nguyen-800-300.jpg?fbclid=IwAR3O8JPvbO4Y95iT04_flVcKDaBMZGaOzDnMOs8cgGUlxtHkkloHd8l8o5E");
        mangquangcao.add("https://mauweb.monamedia.net/thegioididong/wp-content/uploads/2017/12/banner-HC-Tra-Gop-800-300.png?fbclid=IwAR0MPdQSP8dDbEf56H-AngTFXjVxFtSwb-Qz0Eh4hJSfcP8JwwKnf3VtE_s");
        mangquangcao.add("https://mauweb.monamedia.net/thegioididong/wp-content/uploads/2017/12/banner-Le-hoi-phu-kien-800-300.png?fbclid=IwAR0qHpOqAks5GqGMmgj-JCIWyFl1zajKlOLmNobIzg45OIszpBoCDYI4au4");
        for (int i=0;i<mangquangcao.size();i++){
            ImageView imageView=new ImageView(getApplicationContext());
            Glide.with(getApplicationContext()).load(mangquangcao.get(i)).into(imageView);
            viewFlipper.addView(imageView);
        }
        viewFlipper.setFlipInterval(3000);
        viewFlipper.setAutoStart(true);
        Animation slide_in= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_in_right);
        Animation slide_out= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_out_right);
        viewFlipper.setInAnimation(slide_in);
        viewFlipper.setOutAnimation(slide_out);

    }

    private void getProductList() {
        Call<List<Product>> call = productService.getProductFromRestAPI();
        call.enqueue(new Callback<List<Product>>() {
            @Override
            public void onResponse(Call<List<Product>> call, Response<List<Product>> response) {
                if (response.isSuccessful()) {
                    List<Product> productList = response.body();
                    if (productList != null && !productList.isEmpty()) {
                        mOriginalProductList = new ArrayList<>(productList); // keep a copy of the original product list
                        adapter = new ProductAdapter(MainActivity.this, productList, MainActivity.this, MainActivity.this, MainActivity.this);
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

    private void filter(String text) {
        List<Product> filteredList = new ArrayList<>();
        for (Product item : mOriginalProductList) {
            if (item.getName().toLowerCase().contains(text.toLowerCase())) {
                filteredList.add(item);
            }
        }
        adapter = new ProductAdapter(MainActivity.this, filteredList, MainActivity.this, MainActivity.this, MainActivity.this);
        productListView.setAdapter(adapter);
    }
///no care
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

    @Override
    public void onAddToCartButtonClicked(Product product) {
        mCart.addProduct(product);
        Toast.makeText(MainActivity.this, "Đã thêm sản phẩm vào giỏ hàng", Toast.LENGTH_SHORT).show();
        updateCartBadge(); // Update the cart badge number
    }

    private void updateCartBadge() {
        NotificationBadge badge = findViewById(R.id.menu_SL);
        badge.setNumber(mCart.getProducts().size());
        int totalQuantity = 0;
        for (Product product : ((MyApplication) getApplication()).getCart().getProducts()) {
            totalQuantity += product.getQuantity();
        }
        badge.setNumber(totalQuantity);
    }

    @Override
    public void onDetailButtonClicked(Product product) {
        Intent intent = new Intent(MainActivity.this, DetailActivity.class);
        intent.putExtra("product", product);
        startActivity(intent);
    }
}