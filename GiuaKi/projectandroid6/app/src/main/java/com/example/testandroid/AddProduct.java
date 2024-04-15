package com.example.testandroid;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class AddProduct extends AppCompatActivity {

    private EditText productNameEditText;
    private EditText productPriceEditText;
    private EditText imageLinkEditText; // Thêm EditText cho URL hình ảnh
    private Button saveButton;
    private Button backToHomeButton;

    private Retrofit retrofit;
    private ProductService productService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_layout);

        productNameEditText = findViewById(R.id.product_name_edittext);
        productPriceEditText = findViewById(R.id.product_price_edittext);
        imageLinkEditText = findViewById(R.id.image_link_edittext); // Khởi tạo EditText cho URL hình ảnh
        saveButton = findViewById(R.id.save_button);
        backToHomeButton = findViewById(R.id.back_to_home_button);

        retrofit = new Retrofit.Builder()
                .baseUrl("http://10.0.2.2:8080/heii/rest/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        productService = retrofit.create(ProductService.class);

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addProduct();
            }
        });

        backToHomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void addProduct() {
        String productName = productNameEditText.getText().toString().trim();
        String productPriceString = productPriceEditText.getText().toString().trim();
        String imageLink = imageLinkEditText.getText().toString().trim(); // Lấy URL hình ảnh từ EditText

        if (productName.isEmpty() || productPriceString.isEmpty() || imageLink.isEmpty()) {
            Toast.makeText(AddProduct.this, "Vui lòng nhập đủ thông tin", Toast.LENGTH_SHORT).show();
            return;
        }

        double productPrice = Double.parseDouble(productPriceString);

        Product newProduct = new Product(0, productName, productPrice, imageLink); // Tạo đối tượng Product với thông tin đã nhập

        Call<Void> call = productService.addProduct(newProduct);
        call.enqueue(new Callback<Void>() {
            @Override
            public void onResponse(Call<Void> call, Response<Void> response) {
                if (response.isSuccessful()) {
                    Toast.makeText(AddProduct.this, "Thêm sản phẩm thành công", Toast.LENGTH_SHORT).show();
                    setResult(RESULT_OK); // Gửi kết quả thành công trở lại MainActivity
                    finish();
                } else {
                    Toast.makeText(AddProduct.this, "Thêm sản phẩm thất bại", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<Void> call, Throwable t) {
                Toast.makeText(AddProduct.this, "Lỗi: " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
