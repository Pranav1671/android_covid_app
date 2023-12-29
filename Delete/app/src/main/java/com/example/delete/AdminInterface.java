package com.example.delete;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class AdminInterface extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        CardView card1 = findViewById(R.id.card1);
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminInterface.this, SlotDetails1.class);
                startActivity(intent);
            }
        });

        CardView card2 = findViewById(R.id.card2);
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminInterface.this, SlotDetails2.class);
                startActivity(intent);
            }
        });

        CardView card3 = findViewById(R.id.card3);
        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminInterface.this, SlotDetails3.class);
                startActivity(intent);
            }
        });

        CardView card4 = findViewById(R.id.card4);
        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminInterface.this, SlotDetails4.class);
                startActivity(intent);
            }
        });

        CardView createSlot = findViewById(R.id.createSlot);
        createSlot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminInterface.this, SlotCreate.class);
                startActivity(intent);
            }
        });

        CardView deleteSlot = findViewById(R.id.deleteSlot);
        deleteSlot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminInterface.this, SlotDelete.class);
                startActivity(intent);
            }
        });

        ConstraintLayout parentMain = findViewById(R.id.parentMain);
        NavigationView navView = findViewById(R.id.navView);
        MenuItem menuItem = navView.getMenu().findItem(R.id.back);

        LinearLayout linear1 = findViewById(R.id.linear1);
        LinearLayout linear2 = findViewById(R.id.linear2);
        ConstraintLayout layTop = findViewById(R.id.layTop);
        ImageView menuImage = findViewById(R.id.menuImage);
        DrawerLayout drawerLayout = findViewById(R.id.drawerLayout);
        menuImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.bringToFront();
                if (drawerLayout.isDrawerOpen(Gravity.RIGHT)) {
                    drawerLayout.closeDrawer(Gravity.RIGHT);

                } else {
                    drawerLayout.openDrawer(Gravity.RIGHT);
                    drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_OPEN);
                }
            }
        });

        View headerView = navView.getHeaderView(0);
        TextView backTextView = headerView.findViewById(R.id.back);

        backTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.closeDrawer(Gravity.RIGHT);
                layTop.bringToFront();
                linear1.bringToFront();
                linear2.bringToFront();
            }
        });

    }
}
