package com.muss.pamoja_prep;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class Login extends AppCompatActivity {
    GoogleSignInOptions gso;
    GoogleSignInClient gsc;
    ImageView googleBtn;
    TextView forgotPassword;
    String strEmail;


    private boolean passwordShowing = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText emailET = findViewById(R.id.emailET);
        final EditText passwordET = findViewById(R.id.passwordET);

        final Button loginBtn = findViewById(R.id.loginBtn);
        final TextView signUpBtn = findViewById(R.id.signUpBtn);
        final  TextView forgotPassword = findViewById(R.id.forgotPasswordBtn);

        final ImageView googleBtn =findViewById(R.id.googleBtn);

        gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestEmail().build();
        gsc = GoogleSignIn.getClient(this, gso);



        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(emailET.length()==0) {
                    emailET.setError("Email can't be blank!!!");
                    emailET.getText().toString();
                    return;
                }
                if(passwordET.length()==0) {
                    passwordET.setError("Password can't be blank!!!");
                    passwordET.getText().toString();
                    return;
                }



                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
                String email = emailET.getText().toString();
                String password = passwordET.getText().toString();


                firebaseAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener((task -> {
                  if(task.isSuccessful() && emailET.length()>0 && passwordET.length()>0) {
                      if(firebaseAuth.getCurrentUser().isEmailVerified()) {

                          startActivity(new Intent(Login.this, MainActivity.class));
                      } else if (firebaseAuth.getCurrentUser().isAnonymous()) {
                          Toast.makeText(Login.this, "User does not exist", Toast.LENGTH_SHORT).show();
                      }else {
                          Toast.makeText(Login.this, "Please Verify Email", Toast.LENGTH_SHORT).show();

                      }


                  }
                }));




            }
        });

        forgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this, ForgotPassword.class);
                startActivity(intent);
                finish();
            }
        });



        signUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Login.this, TermsAndConditions1.class);
                startActivity(intent);
            }
        });

        googleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signIn();
            }
        });

    }

    void signIn(){
        Intent signInIntent = gsc.getSignInIntent();
        startActivityForResult(signInIntent,1000);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 1000){
            Task<GoogleSignInAccount> task = GoogleSignIn.getSignedInAccountFromIntent(data);

            try {
                task.getResult(ApiException.class);
                navigateToTermsAndConditions2();
            } catch (ApiException e) {
                Toast.makeText(getApplicationContext(),"Something went wrong", Toast.LENGTH_SHORT).show();
            }
        }
    }
    void navigateToTermsAndConditions2(){
        finish();
        Intent intent = new Intent(Login.this, TermsAndConditions2.class);
        startActivity(intent);
    }
}