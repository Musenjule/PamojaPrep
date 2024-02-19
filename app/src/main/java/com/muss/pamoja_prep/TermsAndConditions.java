package com.muss.pamoja_prep;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class TermsAndConditions extends AppCompatActivity {
    ImageButton btnClose,btnDownload;
    Button accept,decline;
    CheckBox checkOver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms_and_conditions);

        final ImageButton btnDownload = findViewById(R.id.btnDownload);
        final ImageButton btnClose = findViewById(R.id.btnClose);
        final Button btnAccept = findViewById(R.id.btnAccept);
        final Button btnDecline = findViewById(R.id.btnDecline);
        final CheckBox checkOver = findViewById(R.id.checkOver);



        btnDownload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Intent intent = new Intent(TermsAndConditions.this, Login.class);
            }
        });

        checkOver.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                btnAccept.setVisibility(View.VISIBLE);
            }
        });

        accept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TermsAndConditions.this, Register.class));
                finish();
            }
        });

        decline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               startActivity(new Intent(TermsAndConditions.this, Login.class));
               finish();

            }
        });
    }
}