package com.example.bookmycoffee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class type_of_user extends AppCompatActivity {

    public Button user;
    public Button shop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type_of_user);

        user = findViewById(R.id.btnUser);
        shop = findViewById(R.id.btnShop);

        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(type_of_user.this,Login.class);
                startActivity(intent);
            }
        });

        shop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(type_of_user.this,ShopLogin.class);
                startActivity(intent);

            }
        });
    }
}
