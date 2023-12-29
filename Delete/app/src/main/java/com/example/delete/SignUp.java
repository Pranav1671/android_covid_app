package com.example.delete;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SignUp extends AppCompatActivity {

    private EditText editTextName;
    private EditText editTextEmail;
    private EditText editTextPassword;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        Button buttonSignUp = findViewById(R.id.buttonSignUp);
        editTextName = findViewById(R.id.editTextName);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!isEditTextEmpty(editTextName) && !isEditTextEmpty(editTextEmail) && !isEditTextEmpty(editTextPassword) && editTextEmail.getText().toString().endsWith("@gmail.com")) {
                    // Perform registration or other actions
                    Toast.makeText(SignUp.this, "Registration successful", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(SignUp.this, MainActivity.class);
                    startActivity(intent);
                } else {
                    // Show an error message if EditText is empty
                    Toast.makeText(SignUp.this, "Please enter a valid value", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private boolean isEditTextEmpty(EditText editText) {
        return editText.getText().toString().trim().isEmpty();
    }

}
