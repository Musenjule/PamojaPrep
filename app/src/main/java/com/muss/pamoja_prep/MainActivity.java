package com.muss.pamoja_prep;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.muss.pamoja_prep.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    TextView Mathematics,Biology,Physics,Chemistry,Geography,History,English;
    private static final int home = 1;
    private static final int menu = 2;
    private static final int settings = 3;
    private int openDrawer;
    private BottomNavigationView bottomNavigationView;
    private DrawerLayout drawerLayout;


    @SuppressLint("NonConstantResourceId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_main);
        
        DrawerLayout drawerLayout;

        bottomNavigationView = findViewById(R.id.bottom_nav);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                //open navigation drawer when bottom item is selected
                if (item.getItemId() == R.id.menu){
                    openNavigationDrawer();
                    return true;
                }
                //handle other bottom navigation items here
                return false;
            }
        });

        bottomNavigationView.setOnNavigationItemSelectedListener(item -> {

            switch (item.getItemId()){

                case R.id.home:
                    replaceFragment(new HomeFragment2());
                    break;
                case R.id.menu:
                    Intent intent = new Intent(MainActivity.this, NavigationDrawer.class);
                    startActivity(intent);
                    finish();
                    break;
                case R.id.settings:
                    replaceFragment(new SettingsFragment2());
                    break;
            }

            return true;
        });

        LinearLayout Mathematics = findViewById(R.id.Mathematics);
        LinearLayout Biology= findViewById(R.id.Biology);
        LinearLayout Physics = findViewById(R.id.Physics);
        LinearLayout Chemistry = findViewById(R.id.Chemistry);
        LinearLayout Geography = findViewById(R.id.Geography);
        LinearLayout History = findViewById(R.id.History);
        LinearLayout English = findViewById(R.id.English);





        Mathematics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Mathematics.class);
                startActivity(intent);
                finish();
            }
        });
        Biology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Coming soon", Toast.LENGTH_SHORT).show();
            }
        });
        Physics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Coming soon", Toast.LENGTH_SHORT).show();
            }
        });
        Chemistry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Coming soon", Toast.LENGTH_SHORT).show();
            }
        });
        Geography.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Coming soon", Toast.LENGTH_SHORT).show();
            }
        });
        History.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Coming soon", Toast.LENGTH_SHORT).show();
            }
        });
        English.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Coming soon", Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void openNavigationDrawer() {
        drawerLayout.openDrawer(GravityCompat.START);
    }

    private void replaceFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout,fragment);
        fragmentTransaction.commit();
    }


}