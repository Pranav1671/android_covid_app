package com.example.delete;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class HomeActivity extends AppCompatActivity {

    private DrawerLayout drawer_layout;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        CardView book = findViewById(R.id.book);
        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, bookingSlot.class);
                startActivity(intent);
                Toast.makeText(HomeActivity.this, "Fill the Details", Toast.LENGTH_SHORT).show();
            }

        });


        NavigationView navView = findViewById(R.id.navView);
        MenuItem menuItem = navView.getMenu().findItem(R.id.back);

        LinearLayout linear1 = findViewById(R.id.linear1);
        LinearLayout linear2 = findViewById(R.id.linear2);
        LinearLayout linear3 = findViewById(R.id.linear3);
        LinearLayout linear4 = findViewById(R.id.linear4);
        ConstraintLayout linearMain = findViewById(R.id.linearMain);
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
                linearMain.bringToFront();
                linear1.bringToFront();
                linear2.bringToFront();
                linear3.bringToFront();
                linear4.bringToFront();
            }
        });


}}
