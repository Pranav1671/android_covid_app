package com.example.delete;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class bookingSlot extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book_main);

        Button dataFilled = findViewById(R.id.dataFilled);
        dataFilled.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(bookingSlot.this, HomeActivity.class);
                startActivity(intent);
                Toast.makeText(bookingSlot.this, "Slot Booked Successfully", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
