package com.example.bookmycoffee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ShopRegistration extends AppCompatActivity {

    private Button Register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_registration);

        Register = findViewById(R.id.btnRegister);

        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShopRegistration.this,ShopLogin.class);
                startActivity(intent);

                Toast.makeText(ShopRegistration.this,"Successfully Register",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
