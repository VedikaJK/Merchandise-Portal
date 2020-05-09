package com.example.merchandiseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ProductPurchase extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_purchase);
    }

    public void buyGPay(View view) {
       // startActivity(new Intent(add_apparels.this, merchant_landing_page.class));
        //finish();

    }
}
