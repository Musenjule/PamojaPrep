package com.muss.pamoja_prep;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.FirebaseAuth;


public class Register extends AppCompatActivity {
    EditText firstNameET, lastNameET, emailET, mobileET, passwordET;
    TextView tvFirstNameError,tvLastNameError, tvEmailError, tvMobileError, tvPasswordError;
    CardView card1, card2, card3, card4, card5;
    Button signUpBtn;
    TextView signInBtn;
    CheckBox checkBox;
    String email,password,validatePassword;


    private  boolean hasUpperCase = false, hasLowerCase = false, hasNumber = false, hasSymbol = false, isAtLeast8 = false, isSignUpClickable = false;

    private final boolean checkEmptyField = false, isChecked = false;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

         firstNameET = findViewById(R.id.firstNameET);
         lastNameET = findViewById(R.id.lastNameET);
         emailET = findViewById(R.id.emailET);
         mobileET = findViewById(R.id.mobileET);
         passwordET = findViewById(R.id.passwordET);
         tvFirstNameError = findViewById(R.id.tvFirstNameError);
        tvLastNameError = findViewById(R.id.tvLastNameError);
         tvEmailError = findViewById(R.id.tvEmailError);
         tvMobileError = findViewById(R.id.tvMobileError);
         tvPasswordError = findViewById(R.id.tvPasswordError);
         card1 = findViewById(R.id.card1);
         card2 = findViewById(R.id.card2);
         card3 = findViewById(R.id.card3);
         card4 = findViewById(R.id.card4);
         card5 = findViewById(R.id.card5);
         checkBox = findViewById(R.id.checkBox);
         signUpBtn = findViewById(R.id.signUpBtn);
        signInBtn = findViewById( R.id.signInBtn);

        String firstName,lastName,email,mobile,password;
        firstName = firstNameET.getText().toString();
        lastName = lastNameET.getText().toString();
                email = emailET.getText().toString();
                mobile = mobileET.getText().toString();
                password = passwordET.getText().toString();





        ActionCodeSettings actionCodeSettings =
                ActionCodeSettings.newBuilder()
                        // URL you want to redirect back to. The domain (www.example.com) for this
                        // URL must be whitelisted in the Firebase Console.
                        .setUrl("https://www.example.com/finishSignUp?cartId=1234")
                        // This must be true
                        .setHandleCodeInApp(true)
                        .setIOSBundleId("com.example.ios")
                        .setAndroidPackageName(
                                "com.example.android",
                                true, /* installIfNotA
                                vailable */
                                "12"    /* minimumVersion */)
                        .build();

        EditText passwordET = findViewById(R.id.passwordET);

        passwordET.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @SuppressLint("ResourceType")
            @Override
            public void afterTextChanged(Editable s) {
                String password = s.toString();
                //for uppercase
                if (password.matches("(.*[A-Z].*)")) {
                    hasUpperCase = true;
                    card1.setCardBackgroundColor(Color.parseColor(getString(R.color.colorAccent)));
                } else {
                    hasUpperCase = false;
                    card1.setCardBackgroundColor(Color.parseColor(getString(R.color.colorDefault)));

                }
                // for lowercase
                if (password.matches("(.*[a-z].*)")) {
                    hasLowerCase = true;
                    card2.setCardBackgroundColor(Color.parseColor(getString(R.color.colorAccent)));
                } else {
                    hasLowerCase = false;
                    card2.setCardBackgroundColor(Color.parseColor(getString(R.color.colorDefault)));

                }
                //for number
                if (password.matches("(.*[0-9].*)")) {
                    hasNumber = true;
                    card3.setCardBackgroundColor(Color.parseColor(getString(R.color.colorAccent)));
                } else {
                    hasNumber = false;
                    card3.setCardBackgroundColor(Color.parseColor(getString(R.color.colorDefault)));

                }
                //for symbol
                if (password.matches("^(?=.*[_.()@!£#?%*$~]).*$")) {
                    hasSymbol = true;
                    card4.setCardBackgroundColor(Color.parseColor(getString(R.color.colorAccent)));
                } else {
                    hasSymbol = false;
                    card4.setCardBackgroundColor(Color.parseColor(getString(R.color.colorDefault)));

                }
                //for 8 characters
                if (password.length() >= 8) {
                    isAtLeast8 = true;
                    card5.setCardBackgroundColor(Color.parseColor(getString(R.color.colorAccent)));
                } else {
                    isAtLeast8 = false;
                    card5.setCardBackgroundColor(Color.parseColor(getString(R.color.colorDefault)));

                }


            }
        });





        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                signUpBtn.setVisibility(View.VISIBLE);
                if(!isChecked) {
                    signUpBtn.setVisibility(View.GONE);
                }
            }
        });




        signUpBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String firstName = firstNameET.getText().toString(),
                        lastName = lastNameET.getText().toString(),
                        mobile = mobileET.getText().toString(),
                        email  = emailET.getText().toString(),
                        password = passwordET.getText().toString();

                if(firstName.length()==0){
                    firstNameET.setError("* REQUIRED FIELD!!!");
                    firstNameET.getText().toString();
                }
                if(lastName.length()==0){
                    lastNameET.setError("* REQUIRED FIELD!!!");
                    lastNameET.getText().toString();
                }
                if(email.length()==0){
                    emailET.setError("* REQUIRED FIELD!!!");
                    emailET.getText().toString();
                }
                if(mobile.length()==0){
                    mobileET.setError("* REQUIRED FIELD!!!");
                    mobileET.getText().toString();
                }
                if(password.length()==0){
                    passwordET.setError("* REQUIRED FIELD!!!");
                    passwordET.getText().toString();
                    return;
                }






                final FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();

                FirebaseAuth mAuth = FirebaseAuth.getInstance();




                FirebaseAuth auth = FirebaseAuth.getInstance();
                auth.sendSignInLinkToEmail(email, actionCodeSettings)
                        .addOnCompleteListener(new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {
                                if (task.isSuccessful()) {
                                    Log.d(TAG, "Email sent.");
                                }
                            }
                        });

                firebaseAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener((task -> {
                    if (task.isSuccessful()) {

                        firebaseAuth.getCurrentUser().sendEmailVerification().addOnCompleteListener(new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> sendSignInLinkToEmail) {
                                if (task.isSuccessful()) {
                                    Toast.makeText(Register.this, "Please Verify your Email", Toast.LENGTH_SHORT).show();
                                    emailET.getText().toString();
                                    passwordET.getText().toString();

                                    // opening OTP get Activity along with mobile and email
                                    Intent intent = new Intent(Register.this, sendOTPActivity.class);

                                    intent.putExtra("mobile", mobile);
                                    intent.putExtra("email", email);

                                    startActivity(intent);

                                }

                            }
                        });


                    } else {
                        Toast.makeText(Register.this, task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }
                ));



            }


        });


        signInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Register.this, Login.class));
                finish();
            }
        });
    }

}