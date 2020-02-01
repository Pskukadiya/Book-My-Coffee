package com.example.bookmycoffee;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class CoffeeShopProfile extends AppCompatActivity {

    private ImageView image;
    private TextView name;
    RecyclerView menuRecycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffee_shop_profile);

        image = findViewById(R.id.shopImage);
        name = findViewById(R.id.shopName);
        menuRecycler = findViewById(R.id.menuRecyView);

    }
}
