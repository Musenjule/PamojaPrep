package com.muss.pamoja_prep;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;


public class VerifyOTPActivity extends AppCompatActivity {

    final TextWatcher textWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {

            if (s.length() > 0) {

                if (selectedETPosition == 0) {

                    selectedETPosition = 1;
                    showKeyboard(otpEt2);
                } else if (selectedETPosition == 1) {
                    selectedETPosition = 2;
                    showKeyboard(otpEt3);
                } else if (selectedETPosition == 2) {
                    selectedETPosition = 3;
                    showKeyboard(otpEt4);

                } else if (selectedETPosition == 3) {
                    selectedETPosition = 4;
                    showKeyboard(otpEt5);

                } else if (selectedETPosition == 4) {
                    selectedETPosition = 5;
                    showKeyboard(otpEt6);

                }
            }
        }
    };

    private EditText otpEt1, otpEt2,otpEt3, otpEt4, otpEt5, otpEt6;
    private TextView resendBtn;
    private String verificationId;

    //true after every 180 seconds
    private boolean resendEnabled = false;

    //resend time in seconds
    private final int resendTime = 60;

    private int selectedETPosition = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_o_t_p_verification);


        otpEt1 = findViewById(R.id.otpET1);
        otpEt2 = findViewById(R.id.otpET2);
        otpEt3 = findViewById(R.id.otpET3);
        otpEt4 = findViewById(R.id.otpET4);
        otpEt5 = findViewById(R.id.otpET5);
        otpEt6 = findViewById(R.id.otpET6);

        setupOTPInputs();




        resendBtn = findViewById(R.id.resendBtn);
        final Button verifyBtn = findViewById(R.id.verifyBtn);

        final TextView otpEmail = findViewById(R.id.otpEmail);
        final  TextView otpMobile = findViewById(R.id.otpMobile);

        //getting Email and Mobile from Register activity through intent
        final String getEmail = getIntent().getStringExtra("email");
        final String getMobile = getIntent().getStringExtra("mobile");

        //setting Email and Mobile to TextView
        otpEmail.setText(getEmail);
        otpMobile.setText(getMobile);



        otpEt1.addTextChangedListener(textWatcher);
        otpEt2.addTextChangedListener(textWatcher);
        otpEt3.addTextChangedListener(textWatcher);
        otpEt4.addTextChangedListener(textWatcher);
        otpEt5.addTextChangedListener(textWatcher);
        otpEt6.addTextChangedListener(textWatcher);

        //by default open keyboard at oypEt1
        showKeyboard(otpEt1);

        //start resend count down timer
        startCountDownTimer();

        resendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(resendEnabled){

                    //handle your resend code here

                    //start new resend count down timer
                    startCountDownTimer();
                }
            }
        });

        verifyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final String generateOtp = otpEt1.getText().toString()+otpEt2.getText().toString()+otpEt3.getText().toString()+otpEt4.getText().toString()+otpEt5.getText().toString()+otpEt6.getText().toString();

                if(generateOtp.length() == 6){

                    Toast.makeText(VerifyOTPActivity.this,"Verify...", Toast.LENGTH_SHORT).show();

                    //handle your otp verification here
                }else {
                    Toast.makeText(VerifyOTPActivity.this,"please check the code!!!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        setupOTPInputs();

        final ProgressBar progressBar = findViewById(R.id.progressBar);
        final  Button buttonVerify = findViewById(R.id.verifyBtn);

        verificationId = getIntent().getStringExtra("verificationId");

        buttonVerify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(otpEt1.getText().toString().trim().isEmpty()
                || otpEt2.getText().toString().trim().isEmpty()
                || otpEt3.getText().toString().trim().isEmpty()
                || otpEt4.getText().toString().trim().isEmpty()
                || otpEt5.getText().toString().trim().isEmpty()
                || otpEt6.getText().toString().trim().isEmpty()) {
                    Toast.makeText(VerifyOTPActivity.this,"please enter valid code", Toast.LENGTH_SHORT).show();
                    return;
                }

                String code =
                        otpEt1.getText().toString() +
                                otpEt2.getText().toString() +
                                otpEt3.getText().toString() +
                                otpEt4.getText().toString() +
                                otpEt5.getText().toString() +
                                otpEt6.getText().toString();

                if(verificationId != null) {
                    progressBar.setVisibility(View.VISIBLE);
                    buttonVerify.setVisibility(View.INVISIBLE);
                    PhoneAuthCredential phoneAuthCredential = PhoneAuthProvider.getCredential(
                            verificationId,
                            code
                    );
                    FirebaseAuth.getInstance().signInWithCredential(phoneAuthCredential)
                            .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    progressBar.setVisibility(View.GONE);
                                    buttonVerify.setVisibility(View.VISIBLE);
                                    if(task.isSuccessful()) {

                                        Toast.makeText(VerifyOTPActivity.this,"Registration Successful.",  Toast.LENGTH_SHORT).show();
                                        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                                        startActivity(intent);
                                    }else {

                                        Toast.makeText(VerifyOTPActivity.this,"The verification code entered was invalid", Toast.LENGTH_SHORT).show();
                                    }

                                }
                            });

                }
            }
        });

    }

    private void setupOTPInputs(){
        otpEt1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(!s.toString().trim().isEmpty()) {
                    otpEt2.requestFocus();
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        otpEt2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(!s.toString().trim().isEmpty()) {
                    otpEt3.requestFocus();
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        otpEt3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(!s.toString().trim().isEmpty()) {
                    otpEt4.requestFocus();
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        otpEt4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(!s.toString().trim().isEmpty()) {
                    otpEt5.requestFocus();
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        otpEt5.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(!s.toString().trim().isEmpty()) {
                    otpEt6.requestFocus();
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void showKeyboard(EditText otpET){

        otpET.requestFocus();

        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        inputMethodManager.showSoftInput(otpET, InputMethodManager.SHOW_IMPLICIT);
    }

    private void startCountDownTimer(){

        resendEnabled = false;
        resendBtn.setTextColor(Color.parseColor("#99000000"));

        new CountDownTimer(resendTime * 1000, 1000){

            @Override
            public void onTick(long millisUntilFinished) {
                resendBtn.setText("Resend Code ("+(millisUntilFinished / 1000)+")");

            }

            @Override
            public void onFinish() {

                resendEnabled = true;
                resendBtn.setText("Resend Code");
                resendBtn.setTextColor(getResources().getColor(R.color.primary));

            }
        }.start();
    }

    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {

        if(keyCode == KeyEvent.KEYCODE_DEL){

            if(selectedETPosition == 5){

                selectedETPosition = 4;
                showKeyboard(otpEt5);
            }
            else if(selectedETPosition == 4){
                selectedETPosition = 3;
                showKeyboard(otpEt4);
            }
            else if(selectedETPosition == 3){
                selectedETPosition = 2;
                showKeyboard(otpEt3);
            }
            else if(selectedETPosition == 2){
                selectedETPosition = 1;
                showKeyboard(otpEt2);
            }
            else if(selectedETPosition == 1){

                selectedETPosition = 0;
                showKeyboard(otpEt1);
            }

            return true;
        }
        else{
            return super.onKeyUp(keyCode, event);
        }

    }
}