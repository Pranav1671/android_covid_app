package com.example.delete;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SlotCreate extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_new_slot);

        Button dataFilled = findViewById(R.id.dataFilled);
        dataFilled.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SlotCreate.this, AdminInterface.class);
                startActivity(intent);
                Toast.makeText(SlotCreate.this, "Slot Created Successfully", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
