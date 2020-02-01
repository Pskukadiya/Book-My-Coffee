package com.example.bookmycoffee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Selected_coffee_shop extends AppCompatActivity {
    public Button Rating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selected_coffee_shop);

        Rating = findViewById(R.id.btnRating);

        Rating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Rate();
            }
        });


    }

    public void Rate(){
        Intent intent = new Intent(Selected_coffee_shop.this,Rating.class);
        startActivity(intent);
    }
}
