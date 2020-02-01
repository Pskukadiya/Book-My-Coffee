package com.example.bookmycoffee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
//import android.widget.EditText;

public class Login extends AppCompatActivity {
   //private EditText Name;
   //private EditText Password;
   public Button Login;
   public Button Registration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

     //   Name = findViewById(R.id.etUsename);
     //   Password = findViewById(R.id.etCpass);
        Login = findViewById(R.id.btnLogin);
        Registration = findViewById(R.id.btnRegistration);

        Registration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                register();
            }
        });

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate();
            }
        });


    }


    private void register(){
        Intent intent = new Intent(Login.this,Signup.class);
        startActivity(intent);
    }

    private void validate()
    {
            Intent intent = new Intent(Login.this,shop_list.class);
            startActivity(intent);
    }
}
