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

public class EditProduct extends AppCompatActivity {

    private EditText productNameEditText;
    private EditText productPriceEditText;
    private EditText imageLinkEditText; // New EditText for image link
    private Button saveButton;
    private Button backToHomeButton;

    private Retrofit retrofit;
    private ProductService productService;

    private Product product;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_layout);

        // Initialize views
        productNameEditText = findViewById(R.id.product_name_edittext);
        productPriceEditText = findViewById(R.id.product_price_edittext);
        imageLinkEditText = findViewById(R.id.image_link_edittext); // Initialize EditText for image link
        saveButton = findViewById(R.id.save_button);
        backToHomeButton = findViewById(R.id.back_to_home_button);

        // Get the Product object passed from the previous activity
        product = (Product) getIntent().getSerializableExtra("product");

        // Set the values of the EditText fields to the current product details
        productNameEditText.setText(product.getName());
        productPriceEditText.setText(String.valueOf(product.getPrice()));
        imageLinkEditText.setText(product.getImage()); // Set image link EditText

        // Initialize Retrofit
        retrofit = new Retrofit.Builder()
                .baseUrl("http://10.0.2.2:8080/heii/rest/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        productService = retrofit.create(ProductService.class);

        // Set click listener for the save button
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateProduct(); // Call method to update the product
            }
        });

        // Set click listener for the back button
        backToHomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Finish this activity and go back to the previous one
            }
        });
    }

    private void updateProduct() {
        // Get the updated name, price, and image link from EditText fields
        String productName = productNameEditText.getText().toString().trim();
        String productPriceString = productPriceEditText.getText().toString().trim();
        String imageLink = imageLinkEditText.getText().toString().trim(); // Get image link

        // Validate if any of the fields are empty
        if (productName.isEmpty() || productPriceString.isEmpty() || imageLink.isEmpty()) {
            Toast.makeText(EditProduct.this, "Vui lòng nhập đủ thông tin", Toast.LENGTH_SHORT).show();
            return;
        }

        // Convert price String to double
        double productPrice = Double.parseDouble(productPriceString);

        // Update the product object with the new values
        product.setName(productName);
        product.setPrice(productPrice);
        product.setImage(imageLink); // Set new image link

        // Make the API call to update the product
        Call<Void> call = productService.updateProduct(product.getId(), product);
        call.enqueue(new Callback<Void>() {
            @Override
            public void onResponse(Call<Void> call, Response<Void> response) {
                if (response.isSuccessful()) {
                    // Show success message
                    Toast.makeText(EditProduct.this, "Cập nhật sản phẩm thành công", Toast.LENGTH_SHORT).show();
                    // Return success result to MainActivity
                    setResult(RESULT_OK);
                    // Finish EditProductActivity
                    finish();
                } else {
                    // Show failure message if unsuccessful
                    Toast.makeText(EditProduct.this, "Cập nhật sản phẩm thất bại", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<Void> call, Throwable t) {
                // Show error message if request fails
                Toast.makeText(EditProduct.this, "Lỗi: " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
