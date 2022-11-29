package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.helloworld.adapter.ProductAdapter;
import com.example.helloworld.model.Product;

import java.util.ArrayList;

public class ProductActivity extends AppCompatActivity {
    private RecyclerView rvProduct;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);
        rvProduct = findViewById(R.id.rvProduct);
        initData();
    }

    private void initData() {
        Product product = new Product();
        product.setId(1);
        product.setName("Mac Book 14 Inch");
        product.setCategory("Laptop");
        product.setPrice(20000.0);

        Product product2 = new Product();
        product2.setId(2);
        product2.setName("Mac Book 13 Inch");
        product2.setCategory("Laptop");
        product2.setPrice(15000.0);

        Product product3 = new Product();
        product3.setId(3);
        product3.setName("Mac Book 12 Inch");
        product3.setCategory("Laptop");
        product3.setPrice(10000.0);

        Product product4 = new Product();
        product4.setId(4);
        product4.setName("Mac Book 11 Inch");
        product4.setCategory("Laptop");
        product4.setPrice(8000.0);

        Product product5 = new Product();
        product5.setId(5);
        product5.setName("Mac Book 10 Inch");
        product5.setCategory("Laptop");
        product5.setPrice(6000.0);
        ArrayList<Product> productArrayList = new ArrayList<>();
        productArrayList.add(product);
        productArrayList.add(product2);
        productArrayList.add(product3);
        productArrayList.add(product4);
        productArrayList.add(product5);

        ProductAdapter adapter = new ProductAdapter(ProductActivity.this,productArrayList);
        rvProduct.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        rvProduct.setAdapter(adapter);

    }


}