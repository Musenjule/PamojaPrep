package com.muss.pamoja_prep;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

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
import com.muss.pamoja_prep.databinding.ActivityMathematicsBinding;

public class Mathematics extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
    LinearLayout grade4,grade5,topics1,topics2;
    private TextView textView;
    FrameLayout frameLayout;
    DatabaseReference reference;
    ActivityMathematicsBinding binding;
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

        FrameLayout frameLayout = findViewById(R.id.fragment);


        bottomNavigationView = findViewById(R.id.bottom_nav);

        bottomNavigationView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mathematics.this, NavigationDrawer.class);
                startActivity(intent);
                finish();
            }
        });

        grade4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Mathematics.this, Grade4Mathematics.class);
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

    @Override
    public boolean onNavigationItemSelected( MenuItem item) {
        int item_id = item.getItemId();
        if (item_id == R.id.menu);
        Intent intent = new Intent(Mathematics.this, NavigationDrawer.class);
        return false;
    }
}