package com.example.delete;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class SlotDelete extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.delete_slot);

        CardView card1 = findViewById(R.id.card1);
        CardView card2 = findViewById(R.id.card2);
        CardView card3 = findViewById(R.id.card3);
        CardView card4 = findViewById(R.id.card4);

        // Set OnClickListener for each CardView
        setCardOnClickListener(card1);
        setCardOnClickListener(card2);
        setCardOnClickListener(card3);
        setCardOnClickListener(card4);

        Button saveDetails = findViewById(R.id.saveDetails);
        saveDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SlotDelete.this, AdminInterface.class);
                startActivity(intent);
                Toast.makeText(SlotDelete.this, "Save Successful", Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void setCardOnClickListener(final CardView cardView) {
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Remove the clicked CardView from its parent
                ViewGroup parentLayout = (ViewGroup) cardView.getParent();
                parentLayout.removeView(cardView);
                Toast.makeText(SlotDelete.this, "Slot Deleted Successfully", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
