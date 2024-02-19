package com.muss.pamoja_prep;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.FirebaseException;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;

import java.util.concurrent.TimeUnit;


public class sendOTPActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_o_t_p);

        Button buttonGetOTP = findViewById(R.id.buttonGetOTP);
        final EditText otpMobile = findViewById(R.id.otpMobile);
        final TextView otpEmail = findViewById(R.id.otpEmail);

        final ProgressBar progressBar = findViewById(R.id.progressBar);


        //getting Mobile from Register activity through intent
        final String getMobile = getIntent().getStringExtra("mobile");
        final String getEmail = getIntent().getStringExtra("email");


        //setting Mobile to TextView
        otpMobile.setText(getMobile);
        otpEmail.setText(getEmail);

        buttonGetOTP.setOnClickListener(v
                -> {
            if (otpMobile.getText().toString().trim().isEmpty()) {
                Toast.makeText(sendOTPActivity.this,"Enter mobile", Toast.LENGTH_SHORT).show();
                return;
            }
            progressBar.setVisibility(View.VISIBLE);
            buttonGetOTP.setVisibility(View.INVISIBLE);

            PhoneAuthProvider.getInstance().verifyPhoneNumber(
                    "+254" + getIntent().getStringExtra("mobile"),
                    60,
                    TimeUnit.SECONDS,
                    sendOTPActivity.this,
                    new PhoneAuthProvider.OnVerificationStateChangedCallbacks(){

                        @Override
                        public void onVerificationCompleted(@NonNull PhoneAuthCredential phoneAuthCredential) {
                            progressBar.setVisibility(View.GONE);
                            buttonGetOTP.setVisibility(View.VISIBLE);

                        }

                        @Override
                        public void onVerificationFailed(@NonNull FirebaseException e) {
                            progressBar.setVisibility(View.GONE);
                            buttonGetOTP.setVisibility(View.VISIBLE);
                            Toast.makeText(sendOTPActivity.this,e.getMessage(),Toast.LENGTH_SHORT).show();

                        }

                        @Override
                        public void onCodeSent(@NonNull String verificationId, @NonNull PhoneAuthProvider.ForceResendingToken forceResendingToken) {
                            progressBar.setVisibility(View.GONE);
                            buttonGetOTP.setVisibility(View.VISIBLE);
                            Intent intent = new Intent(sendOTPActivity.this, VerifyOTPActivity.class);
                            intent.putExtra("mobile", getIntent().getStringExtra("mobile"));
                            intent.putExtra("verificationId", verificationId);
                            startActivity(intent);


                        }
                    }
            );

        });
    }
}