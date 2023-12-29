package com.example.delete;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;


//DEVELOPED ONLY FOR PORTRAIT MODE


public class MainActivity extends AppCompatActivity{

    private EditText editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editTextEmail = findViewById(R.id.editTextEmail);

        Button Login = findViewById(R.id.loginButton);
        Login.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editTextEmail.getText().toString();
                Intent intent;
                if (name.equalsIgnoreCase("Admin")) {
                    intent = new Intent(MainActivity.this, AdminInterface.class);
                } else {
                    intent = new Intent(MainActivity.this, HomeActivity.class);
                }
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();

            }
        });

        TextView registerButton = findViewById(R.id.registerButton);
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SignUp.class);
                startActivity(intent);
            }
        });

        editTextPassword = findViewById(R.id.editTextPassword);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!isEditTextEmpty(editTextEmail) && !isEditTextEmpty(editTextPassword) && editTextEmail.getText().toString().endsWith("@gmail.com")) {
                    // Perform registration or other actions
                    Toast.makeText(MainActivity.this, "Login successful", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                    startActivity(intent);
                } else if ((editTextEmail.getText().toString().equalsIgnoreCase("Admin") || editTextEmail.getText().toString().equalsIgnoreCase("admin")) && !isEditTextEmpty(editTextPassword)) {
                    Toast.makeText(MainActivity.this, "Login successful", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, AdminInterface.class);
                    startActivity(intent);
                } else {
                    // Show an error message if EditText is empty
                    Toast.makeText(MainActivity.this, "Please enter a valid value", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private boolean isEditTextEmpty(EditText editText) {
        return editText.getText().toString().trim().isEmpty();
    }

}