package com.muss.pamoja_prep;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.muss.pamoja_prep.databinding.ActivityMainBinding;
import com.muss.pamoja_prep.databinding.ActivityMathematicsBinding;

public class Mathematics extends AppCompatActivity {

    LinearLayout grade4,grade5,topics1,topics2;
    private TextView textView;
    FrameLayout frameLayout;
    DatabaseReference reference;
    ActivityMathematicsBinding binding;
    private int openDrawer;
    BottomNavigationView bottomNavigationView;

    TextView algebra,data,finding,geometry,measurement,numbers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mathematics);
        grade4 = findViewById(R.id.grade4);
        grade5 = findViewById(R.id.grade5);
        topics1 = findViewById(R.id.topics1);
        topics2 = findViewById(R.id.topics2);

        binding = ActivityMathematicsBinding.inflate(getLayoutInflater());

        DrawerLayout drawerLayout;

        bottomNavigationView = findViewById(R.id.bottom_nav);

        FrameLayout frameLayout = findViewById(R.id.fragment);


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

            if (item.getItemId() == R.id.menu) {
                Intent intent = new Intent(Mathematics.this, NavigationDrawer.class);
                startActivity(intent);
                finish();
            }

            return true;
        });
        grade4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Mathematics.this, Questions.class);
                startActivity(intent);
                finish();
               // if (grade4.isClickable()){
                   // topics1.setVisibility(View.VISIBLE);
                   // topics2.setVisibility(View.GONE);
               // }else {
                   /// topics1.setVisibility(View.INVISIBLE);
                }

            //}
        });
        grade5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (grade5.isClickable()){
                    topics2.setVisibility(View.VISIBLE);
                    topics1.setVisibility(View.GONE);
                }else {
                    topics2.setVisibility(View.INVISIBLE);
                }

            }
        });



    }

    private void openNavigationDrawer() {
    }

}