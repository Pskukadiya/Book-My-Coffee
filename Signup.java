package com.example.bookmycoffee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Signup extends AppCompatActivity {
    public Button Reg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        Reg = findViewById(R.id.btnSignup);

        Reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SignSuccess();
            }
        });
    }


    private void SignSuccess(){
        Intent intent = new Intent(Signup.this,Login.class);
        startActivity(intent);

        Toast.makeText(Signup.this,"Successfully Registered",Toast.LENGTH_SHORT).show();
    }
}
