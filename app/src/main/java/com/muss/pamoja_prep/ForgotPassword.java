package com.muss.pamoja_prep;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;

public class ForgotPassword extends AppCompatActivity {

    //Declaration
    Button resetPassword, back;
    EditText txtEmail;
    ProgressBar progressBar;
    FirebaseAuth mAuth;

    String strEmail;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        //Initialization
        Button back = findViewById(R.id.backBtn);
        Button resetPassword = findViewById(R.id.resetBtn);
        EditText txtEmail = findViewById(R.id.txtEmail);
        ProgressBar progressBar = findViewById(R.id.progressBar);
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
        FirebaseAuth mAuth = FirebaseAuth.getInstance();





        //Reset button listener
        resetPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth firebaseAuth1 = FirebaseAuth.getInstance();

                strEmail = txtEmail.getText().toString().trim();

                if (TextUtils.isEmpty(strEmail)) {
                    txtEmail.setError("Email can't be empty!!!");
                    return;
                }
                progressBar.setVisibility(View.VISIBLE);
                resetPassword.setVisibility(View.INVISIBLE);


                mAuth.sendPasswordResetEmail(strEmail).addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void unused) {
                        Toast.makeText(ForgotPassword.this, "Reset Password Link has been sent to the registered Email", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(ForgotPassword.this, Login.class);
                        startActivity(intent);
                        finish();
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(ForgotPassword.this, "Error :- " +e.getMessage(), Toast.LENGTH_SHORT).show();
                        progressBar.setVisibility(View.VISIBLE);
                        resetPassword.setVisibility(View.INVISIBLE);
                    }
                });

            }

        });

        //Back button code
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
                Intent intent = new Intent(ForgotPassword.this, Login.class);
                startActivity(intent);
                finish();
            }
        });

    }
    private void resetPassword() {

    }

}
