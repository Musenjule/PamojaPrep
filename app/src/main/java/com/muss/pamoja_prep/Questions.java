package com.muss.pamoja_prep;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.muss.pamoja_prep.databinding.ActivityQuestionsBinding;

public class Questions extends AppCompatActivity {

    EditText editText;
    TextView Q1,Q2,Q3,Q4,Q5,Q6,Q7,Q8,Q9,Q10,Algebra,Data_Handling,Geometry,Measurement,Numbers,A,B,C,D,tvAnswerA,tvAnswerB,tvAnswerC,tvAnswerD,tvAnswerA2,tvAnswerB2,tvAnswerC2,tvAnswerD2,tvAnswerA3,tvAnswerB3,tvAnswerC3,tvAnswerD3,tvAnswerA4,tvAnswerB4,tvAnswerC4,tvAnswerD4,tvAnswerA5,tvAnswerB5,tvAnswerC5,tvAnswerD5,tvAnswerA6,tvAnswerB6,tvAnswerC6,tvAnswerD6,tvAnswerA7,tvAnswerB7,tvAnswerC7,tvAnswerD7,tvAnswerA8,tvAnswerB8,tvAnswerC8,tvAnswerD8,tvAnswerA9,tvAnswerB9,tvAnswerC9,tvAnswerD9,tvAnswerA10,tvAnswerB10,tvAnswerC10,tvAnswerD10;
    DatabaseReference reference;
    private ActivityQuestionsBinding binding;
    ImageButton imageBtn;
    LinearLayout linearLayoutCA,linearLayoutCA2,linearLayoutCA3,linearLayoutCA4,linearLayoutCA5,linearLayoutCA6,linearLayoutCA7,linearLayoutCA8,linearLayoutCA9,linearLayoutCA10,answers,answers2,answers3,answers4,answers5,answers6,answers7,answers8,answers9,answers10;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityQuestionsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        editText = findViewById(R.id.topicET);
        Q1 = findViewById(R.id.question1);
        Q2 = findViewById(R.id.question2);
        Q3 = findViewById(R.id.question3);
        Q4 = findViewById(R.id.question4);
        Q5 = findViewById(R.id.question5);
        Q6 = findViewById(R.id.question6);
        Q7 = findViewById(R.id.question7);
        Q8 = findViewById(R.id.question8);
        Q9 = findViewById(R.id.question9);
        Q10 = findViewById(R.id.question10);

        A = findViewById(R.id.A);
        B = findViewById(R.id.B);
        C = findViewById(R.id.C);
        D = findViewById(R.id.D);

        linearLayoutCA = findViewById(R.id.linearLayoutCA);
        linearLayoutCA2 = findViewById(R.id.linearLayoutCA2);
        linearLayoutCA3 = findViewById(R.id.linearLayoutCA3);
        linearLayoutCA4 = findViewById(R.id.linearLayoutCA4);
        linearLayoutCA5 = findViewById(R.id.linearLayoutCA5);
        linearLayoutCA6 = findViewById(R.id.linearLayoutCA6);
        linearLayoutCA7 = findViewById(R.id.linearLayoutCA7);
        linearLayoutCA8 = findViewById(R.id.linearLayoutCA8);
        linearLayoutCA9 = findViewById(R.id.linearLayoutCA9);
        linearLayoutCA10 = findViewById(R.id.linearLayoutCA10);
        answers = findViewById(R.id.Answers);
        answers2 = findViewById(R.id.Answers2);
        answers3 = findViewById(R.id.Answers3);
        answers4 = findViewById(R.id.Answers4);
        answers5 = findViewById(R.id.Answers5);
        answers6 = findViewById(R.id.Answers6);
        answers7 = findViewById(R.id.Answers7);
        answers8 = findViewById(R.id.Answers8);
        answers9 = findViewById(R.id.Answers9);
        answers10 = findViewById(R.id.Answers10);
        tvAnswerA = findViewById(R.id.tvAnswer_A);
        tvAnswerB = findViewById(R.id.tvAnswer_B);
        tvAnswerC = findViewById(R.id.tvAnswer_C);
        tvAnswerD = findViewById(R.id.tvAnswer_D);
        tvAnswerA2 = findViewById(R.id.tvAnswer_A2);
        tvAnswerB2 = findViewById(R.id.tvAnswer_B2);
        tvAnswerC2 = findViewById(R.id.tvAnswer_C2);
        tvAnswerD2 = findViewById(R.id.tvAnswer_D2);
        tvAnswerA3 = findViewById(R.id.tvAnswer_A3);
        tvAnswerB3 = findViewById(R.id.tvAnswer_B3);
        tvAnswerC3 = findViewById(R.id.tvAnswer_C3);
        tvAnswerD3 = findViewById(R.id.tvAnswer_D3);
        tvAnswerA4 = findViewById(R.id.tvAnswer_A4);
        tvAnswerB4 = findViewById(R.id.tvAnswer_B4);
        tvAnswerC4 = findViewById(R.id.tvAnswer_C4);
        tvAnswerD4 = findViewById(R.id.tvAnswer_D4);
        tvAnswerA5 = findViewById(R.id.tvAnswer_A5);
        tvAnswerB5 = findViewById(R.id.tvAnswer_B5);
        tvAnswerC5 = findViewById(R.id.tvAnswer_C5);
        tvAnswerD5 = findViewById(R.id.tvAnswer_D5);
        tvAnswerA6 = findViewById(R.id.tvAnswer_A6);
        tvAnswerB6 = findViewById(R.id.tvAnswer_B6);
        tvAnswerC6 = findViewById(R.id.tvAnswer_C6);
        tvAnswerD6 = findViewById(R.id.tvAnswer_D6);
        tvAnswerA7 = findViewById(R.id.tvAnswer_A7);
        tvAnswerB7 = findViewById(R.id.tvAnswer_B7);
        tvAnswerC7 = findViewById(R.id.tvAnswer_C7);
        tvAnswerD7 = findViewById(R.id.tvAnswer_D7);
        tvAnswerA8 = findViewById(R.id.tvAnswer_A8);
        tvAnswerB8 = findViewById(R.id.tvAnswer_B8);
        tvAnswerC8 = findViewById(R.id.tvAnswer_C8);
        tvAnswerD8 = findViewById(R.id.tvAnswer_D8);
        tvAnswerA9 = findViewById(R.id.tvAnswer_A9);
        tvAnswerB9 = findViewById(R.id.tvAnswer_B9);
        tvAnswerC9 = findViewById(R.id.tvAnswer_C9);
        tvAnswerD9 = findViewById(R.id.tvAnswer_D9);
        tvAnswerA10 = findViewById(R.id.tvAnswer_A10);
        tvAnswerB10 = findViewById(R.id.tvAnswer_B10);
        tvAnswerC10 = findViewById(R.id.tvAnswer_C10);
        tvAnswerD10 = findViewById(R.id.tvAnswer_D10);


        imageBtn = findViewById(R.id.imageBtn);

        Algebra = findViewById(R.id.algebra);
        Data_Handling = findViewById(R.id.data);
        Geometry = findViewById(R.id.geometry);
        Measurement = findViewById(R.id.measurement);
        Numbers = findViewById(R.id.numbers);




        Algebra.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View v) {
                Algebra.setTextColor(Color.parseColor(getString(R.color.orange)));
                Data_Handling.setTextColor(Color.BLACK);
                Geometry.setTextColor(Color.BLACK);
                Measurement.setTextColor(Color.BLACK);
                Numbers.setTextColor(Color.BLACK);
                reference = FirebaseDatabase.getInstance().getReference().child("Grade_4").child("Algebra").getRef();
                reference.get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<DataSnapshot> task) {

                        if (task.isSuccessful()){
                            Toast.makeText(Questions.this, "Successful", Toast.LENGTH_SHORT).show();
                            DataSnapshot dataSnapshot = task.getResult();

                            Object questionObj = dataSnapshot.getValue();
                            String json = new Gson().toJson(questionObj);
                            JsonObject jsonObject = new JsonParser().parse(json).getAsJsonObject();




                            binding.tvQuestion1.setText(jsonObject.getAsJsonObject("Question_01").get("Question").getAsString());
                            binding.tvAnswerA.setText(jsonObject.getAsJsonObject("Question_01").get("A").getAsString());
                            binding.tvAnswerB.setText(jsonObject.getAsJsonObject("Question_01").get("B").getAsString());
                            binding.tvAnswerC.setText(jsonObject.getAsJsonObject("Question_01").get("C").getAsString());
                            binding.tvAnswerD.setText(jsonObject.getAsJsonObject("Question_01").get("D").getAsString());
                            binding.tvCorrectAnswer.setText(jsonObject.getAsJsonObject("Question_01").get("Correct_Answer").getAsString());

                            answers.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {

                                    if (!"A".equals(jsonObject.getAsJsonObject("Question_01").get("Correct_Answer").getAsString())){
                                        tvAnswerA.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));

                                    }else {
                                        tvAnswerA.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"B".equals(jsonObject.getAsJsonObject("Question_01").get("Correct_Answer").getAsString())){
                                        tvAnswerB.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerB.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"C".equals(jsonObject.getAsJsonObject("Question_01").get("Correct_Answer").getAsString())){
                                        tvAnswerC.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerC.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"D".equals(jsonObject.getAsJsonObject("Question_01").get("Correct_Answer").getAsString())){
                                        tvAnswerD.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerD.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (answers.isClickable()){

                                        linearLayoutCA.setVisibility(View.VISIBLE);
                                    } else {
                                        linearLayoutCA.setVisibility(View.GONE);
                                        finish();
                                    }

                                }
                            });

                            binding.tvQuestion2.setText(jsonObject.getAsJsonObject("Question_02").get("Question").getAsString());
                            binding.tvAnswerA2.setText(jsonObject.getAsJsonObject("Question_02").get("A").getAsString());
                            binding.tvAnswerB2.setText(jsonObject.getAsJsonObject("Question_02").get("B").getAsString());
                            binding.tvAnswerC2.setText(jsonObject.getAsJsonObject("Question_02").get("C").getAsString());
                            binding.tvAnswerD2.setText(jsonObject.getAsJsonObject("Question_02").get("D").getAsString());
                            binding.tvCorrectAnswer2.setText(jsonObject.getAsJsonObject("Question_02").get("Correct_Answer").getAsString());

                            answers2.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {

                                    if (!"A".equals(jsonObject.getAsJsonObject("Question_02").get("Correct_Answer").getAsString())){
                                        tvAnswerA2.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));

                                    }else {
                                        tvAnswerA2.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"B".equals(jsonObject.getAsJsonObject("Question_02").get("Correct_Answer").getAsString())){
                                        tvAnswerB2.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerB2.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"C".equals(jsonObject.getAsJsonObject("Question_02").get("Correct_Answer").getAsString())){
                                        tvAnswerC2.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerC2.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"D".equals(jsonObject.getAsJsonObject("Question_02").get("Correct_Answer").getAsString())){
                                        tvAnswerD2.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerD2.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (answers2.isClickable()){

                                        linearLayoutCA2.setVisibility(View.VISIBLE);
                                    } else {
                                        linearLayoutCA2.setVisibility(View.GONE);
                                        finish();
                                    }

                                }
                            });

                            binding.tvQuestion3.setText(jsonObject.getAsJsonObject("Question_03").get("Question").getAsString());
                            binding.tvAnswerA3.setText(jsonObject.getAsJsonObject("Question_03").get("A").getAsString());
                            binding.tvAnswerB3.setText(jsonObject.getAsJsonObject("Question_03").get("B").getAsString());
                            binding.tvAnswerC3.setText(jsonObject.getAsJsonObject("Question_03").get("C").getAsString());
                            binding.tvAnswerD3.setText(jsonObject.getAsJsonObject("Question_03").get("D").getAsString());
                            binding.tvCorrectAnswer3.setText(jsonObject.getAsJsonObject("Question_03").get("Correct_Answer").getAsString());

                            answers3.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {

                                    if (!"A".equals(jsonObject.getAsJsonObject("Question_03").get("Correct_Answer").getAsString())){
                                        tvAnswerA3.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));

                                    }else {
                                        tvAnswerA3.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"B".equals(jsonObject.getAsJsonObject("Question_03").get("Correct_Answer").getAsString())){
                                        tvAnswerB3.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerB3.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"C".equals(jsonObject.getAsJsonObject("Question_03").get("Correct_Answer").getAsString())){
                                        tvAnswerC3.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerC3.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"D".equals(jsonObject.getAsJsonObject("Question_03").get("Correct_Answer").getAsString())){
                                        tvAnswerD3.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerD3.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (answers3.isClickable()){

                                        linearLayoutCA3.setVisibility(View.VISIBLE);
                                    } else {
                                        linearLayoutCA3.setVisibility(View.GONE);
                                        finish();
                                    }

                                }
                            });

                            binding.tvQuestion4.setText(jsonObject.getAsJsonObject("Question_04").get("Question").getAsString());
                            binding.tvAnswerA4.setText(jsonObject.getAsJsonObject("Question_04").get("A").getAsString());
                            binding.tvAnswerB4.setText(jsonObject.getAsJsonObject("Question_04").get("B").getAsString());
                            binding.tvAnswerC4.setText(jsonObject.getAsJsonObject("Question_04").get("C").getAsString());
                            binding.tvAnswerD4.setText(jsonObject.getAsJsonObject("Question_04").get("D").getAsString());
                            binding.tvCorrectAnswer4.setText(jsonObject.getAsJsonObject("Question_04").get("Correct_Answer").getAsString());

                            answers4.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {

                                    if (!"A".equals(jsonObject.getAsJsonObject("Question_04").get("Correct_Answer").getAsString())){
                                        tvAnswerA4.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));

                                    }else {
                                        tvAnswerA4.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"B".equals(jsonObject.getAsJsonObject("Question_04").get("Correct_Answer").getAsString())){
                                        tvAnswerB4.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerB4.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"C".equals(jsonObject.getAsJsonObject("Question_04").get("Correct_Answer").getAsString())){
                                        tvAnswerC4.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerC4.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"D".equals(jsonObject.getAsJsonObject("Question_04").get("Correct_Answer").getAsString())){
                                        tvAnswerD4.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerD4.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (answers4.isClickable()){

                                        linearLayoutCA4.setVisibility(View.VISIBLE);
                                    } else {
                                        linearLayoutCA4.setVisibility(View.GONE);
                                        finish();
                                    }

                                }
                            });

                            binding.tvQuestion5.setText(jsonObject.getAsJsonObject("Question_05").get("Question").getAsString());
                            binding.tvAnswerA5.setText(jsonObject.getAsJsonObject("Question_05").get("A").getAsString());
                            binding.tvAnswerB5.setText(jsonObject.getAsJsonObject("Question_05").get("B").getAsString());
                            binding.tvAnswerC5.setText(jsonObject.getAsJsonObject("Question_05").get("C").getAsString());
                            binding.tvAnswerD5.setText(jsonObject.getAsJsonObject("Question_05").get("D").getAsString());
                            binding.tvCorrectAnswer5.setText(jsonObject.getAsJsonObject("Question_05").get("Correct_Answer").getAsString());

                            answers5.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {

                                    if (!"A".equals(jsonObject.getAsJsonObject("Question_05").get("Correct_Answer").getAsString())){
                                        tvAnswerA5.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));

                                    }else {
                                        tvAnswerA5.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"B".equals(jsonObject.getAsJsonObject("Question_05").get("Correct_Answer").getAsString())){
                                        tvAnswerB5.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerB5.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"C".equals(jsonObject.getAsJsonObject("Question_05").get("Correct_Answer").getAsString())){
                                        tvAnswerC5.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerC5.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"D".equals(jsonObject.getAsJsonObject("Question_05").get("Correct_Answer").getAsString())){
                                        tvAnswerD5.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerD5.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (answers5.isClickable()){

                                        linearLayoutCA5.setVisibility(View.VISIBLE);
                                    } else {
                                        linearLayoutCA5.setVisibility(View.GONE);
                                        finish();
                                    }

                                }
                            });

                            binding.tvQuestion6.setText(jsonObject.getAsJsonObject("Question_06").get("Question").getAsString());
                            binding.tvAnswerA6.setText(jsonObject.getAsJsonObject("Question_06").get("A").getAsString());
                            binding.tvAnswerB6.setText(jsonObject.getAsJsonObject("Question_06").get("B").getAsString());
                            binding.tvAnswerC6.setText(jsonObject.getAsJsonObject("Question_06").get("C").getAsString());
                            binding.tvAnswerD6.setText(jsonObject.getAsJsonObject("Question_06").get("D").getAsString());
                            binding.tvCorrectAnswer6.setText(jsonObject.getAsJsonObject("Question_06").get("Correct_Answer").getAsString());

                            answers6.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {

                                    if (!"A".equals(jsonObject.getAsJsonObject("Question_06").get("Correct_Answer").getAsString())){
                                        tvAnswerA6.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));

                                    }else {
                                        tvAnswerA6.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"B".equals(jsonObject.getAsJsonObject("Question_06").get("Correct_Answer").getAsString())){
                                        tvAnswerB6.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerB6.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"C".equals(jsonObject.getAsJsonObject("Question_06").get("Correct_Answer").getAsString())){
                                        tvAnswerC6.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerC6.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"D".equals(jsonObject.getAsJsonObject("Question_06").get("Correct_Answer").getAsString())){
                                        tvAnswerD6.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerD6.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (answers6.isClickable()){

                                        linearLayoutCA6.setVisibility(View.VISIBLE);
                                    } else {
                                        linearLayoutCA6.setVisibility(View.GONE);
                                        finish();
                                    }

                                }
                            });

                            binding.tvQuestion7.setText(jsonObject.getAsJsonObject("Question_07").get("Question").getAsString());
                            binding.tvAnswerA7.setText(jsonObject.getAsJsonObject("Question_07").get("A").getAsString());
                            binding.tvAnswerB7.setText(jsonObject.getAsJsonObject("Question_07").get("B").getAsString());
                            binding.tvAnswerC7.setText(jsonObject.getAsJsonObject("Question_07").get("C").getAsString());
                            binding.tvAnswerD7.setText(jsonObject.getAsJsonObject("Question_07").get("D").getAsString());
                            binding.tvCorrectAnswer7.setText(jsonObject.getAsJsonObject("Question_07").get("Correct_Answer").getAsString());

                            answers7.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {

                                    if (!"A".equals(jsonObject.getAsJsonObject("Question_07").get("Correct_Answer").getAsString())){
                                        tvAnswerA7.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));

                                    }else {
                                        tvAnswerA7.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"B".equals(jsonObject.getAsJsonObject("Question_07").get("Correct_Answer").getAsString())){
                                        tvAnswerB7.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerB7.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"C".equals(jsonObject.getAsJsonObject("Question_07").get("Correct_Answer").getAsString())){
                                        tvAnswerC7.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerC7.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"D".equals(jsonObject.getAsJsonObject("Question_07").get("Correct_Answer").getAsString())){
                                        tvAnswerD7.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerD7.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (answers7.isClickable()){

                                        linearLayoutCA7.setVisibility(View.VISIBLE);
                                    } else {
                                        linearLayoutCA7.setVisibility(View.GONE);
                                        finish();
                                    }

                                }
                            });

                            binding.tvQuestion8.setText(jsonObject.getAsJsonObject("Question_08").get("Question").getAsString());
                            binding.tvAnswerA8.setText(jsonObject.getAsJsonObject("Question_08").get("A").getAsString());
                            binding.tvAnswerB8.setText(jsonObject.getAsJsonObject("Question_08").get("B").getAsString());
                            binding.tvAnswerC8.setText(jsonObject.getAsJsonObject("Question_08").get("C").getAsString());
                            binding.tvAnswerD8.setText(jsonObject.getAsJsonObject("Question_08").get("D").getAsString());
                            binding.tvCorrectAnswer8.setText(jsonObject.getAsJsonObject("Question_08").get("Correct_Answer").getAsString());

                            answers8.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {

                                    if (!"A".equals(jsonObject.getAsJsonObject("Question_08").get("Correct_Answer").getAsString())){
                                        tvAnswerA8.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));

                                    }else {
                                        tvAnswerA8.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"B".equals(jsonObject.getAsJsonObject("Question_08").get("Correct_Answer").getAsString())){
                                        tvAnswerB8.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerB8.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"C".equals(jsonObject.getAsJsonObject("Question_08").get("Correct_Answer").getAsString())){
                                        tvAnswerC8.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerC8.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"D".equals(jsonObject.getAsJsonObject("Question_08").get("Correct_Answer").getAsString())){
                                        tvAnswerD8.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerD8.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (answers8.isClickable()){

                                        linearLayoutCA8.setVisibility(View.VISIBLE);
                                    } else {
                                        linearLayoutCA8.setVisibility(View.GONE);
                                        finish();
                                    }

                                }
                            });

                            binding.tvQuestion9.setText(jsonObject.getAsJsonObject("Question_09").get("Question").getAsString());
                            binding.tvAnswerA9.setText(jsonObject.getAsJsonObject("Question_09").get("A").getAsString());
                            binding.tvAnswerB9.setText(jsonObject.getAsJsonObject("Question_09").get("B").getAsString());
                            binding.tvAnswerC9.setText(jsonObject.getAsJsonObject("Question_09").get("C").getAsString());
                            binding.tvAnswerD9.setText(jsonObject.getAsJsonObject("Question_09").get("D").getAsString());
                            binding.tvCorrectAnswer9.setText(jsonObject.getAsJsonObject("Question_09").get("Correct_Answer").getAsString());

                            answers9.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {

                                    if (!"A".equals(jsonObject.getAsJsonObject("Question_09").get("Correct_Answer").getAsString())){
                                        tvAnswerA9.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));

                                    }else {
                                        tvAnswerA9.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"B".equals(jsonObject.getAsJsonObject("Question_09").get("Correct_Answer").getAsString())){
                                        tvAnswerB9.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerB9.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"C".equals(jsonObject.getAsJsonObject("Question_09").get("Correct_Answer").getAsString())){
                                        tvAnswerC9.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerC9.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"D".equals(jsonObject.getAsJsonObject("Question_09").get("Correct_Answer").getAsString())){
                                        tvAnswerD9.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerD9.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (answers9.isClickable()){

                                        linearLayoutCA9.setVisibility(View.VISIBLE);
                                    } else {
                                        linearLayoutCA9.setVisibility(View.GONE);
                                        finish();
                                    }

                                }
                            });

                            binding.tvQuestion10.setText(jsonObject.getAsJsonObject("Question_10").get("Question").getAsString());
                            binding.tvAnswerA10.setText(jsonObject.getAsJsonObject("Question_10").get("A").getAsString());
                            binding.tvAnswerB10.setText(jsonObject.getAsJsonObject("Question_10").get("B").getAsString());
                            binding.tvAnswerC10.setText(jsonObject.getAsJsonObject("Question_10").get("C").getAsString());
                            binding.tvAnswerD10.setText(jsonObject.getAsJsonObject("Question_10").get("D").getAsString());
                            binding.tvCorrectAnswer10.setText(jsonObject.getAsJsonObject("Question_10").get("Correct_Answer").getAsString());

                            answers10.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {

                                    if (!"A".equals(jsonObject.getAsJsonObject("Question_10").get("Correct_Answer").getAsString())){
                                        tvAnswerA10.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));

                                    }else {
                                        tvAnswerA10.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"B".equals(jsonObject.getAsJsonObject("Question_10").get("Correct_Answer").getAsString())){
                                        tvAnswerB10.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerB10.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"C".equals(jsonObject.getAsJsonObject("Question_10").get("Correct_Answer").getAsString())){
                                        tvAnswerC10.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerC10.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"D".equals(jsonObject.getAsJsonObject("Question_10").get("Correct_Answer").getAsString())){
                                        tvAnswerD10.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerD10.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (answers10.isClickable()){

                                        linearLayoutCA10.setVisibility(View.VISIBLE);
                                    } else {
                                        linearLayoutCA10.setVisibility(View.GONE);
                                        finish();
                                    }

                                }
                            });





                        }else {
                            Toast.makeText(Questions.this, "Failed!!!", Toast.LENGTH_SHORT).show();
                        }

                    }
                });
            }
        });

        binding.data.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View v) {
                Algebra.setTextColor(Color.BLACK);
                Data_Handling.setTextColor(Color.parseColor(getString(R.color.orange)));
                Geometry.setTextColor(Color.BLACK);
                Measurement.setTextColor(Color.BLACK);
                Numbers.setTextColor(Color.BLACK);
                reference = FirebaseDatabase.getInstance().getReference().child("Grade_4").child("DataHandling").getRef();
                reference.get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<DataSnapshot> task) {
                        if (task.isSuccessful()){
                            Toast.makeText(Questions.this, "Successful", Toast.LENGTH_SHORT).show();
                            DataSnapshot dataSnapshot = task.getResult();


                            Object questionObj = dataSnapshot.getValue();
                            String json = new Gson().toJson(questionObj);
                            JsonObject jsonObject = new JsonParser().parse(json).getAsJsonObject();



                            binding.tvQuestion1.setText(jsonObject.getAsJsonObject("Question_01").get("Question").getAsString());
                            binding.tvAnswerA.setText(jsonObject.getAsJsonObject("Question_01").get("A").getAsString());
                            binding.tvAnswerB.setText(jsonObject.getAsJsonObject("Question_01").get("B").getAsString());
                            binding.tvAnswerC.setText(jsonObject.getAsJsonObject("Question_01").get("C").getAsString());
                            binding.tvAnswerD.setText(jsonObject.getAsJsonObject("Question_01").get("D").getAsString());
                            binding.tvCorrectAnswer.setText(jsonObject.getAsJsonObject("Question_01").get("Correct_Answer").getAsString());

                            answers.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {

                                    if (!"A".equals(jsonObject.getAsJsonObject("Question_01").get("Correct_Answer").getAsString())){
                                        tvAnswerA.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));

                                    }else {
                                        tvAnswerA.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"B".equals(jsonObject.getAsJsonObject("Question_01").get("Correct_Answer").getAsString())){
                                        tvAnswerB.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerB.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"C".equals(jsonObject.getAsJsonObject("Question_01").get("Correct_Answer").getAsString())){
                                        tvAnswerC.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerC.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"D".equals(jsonObject.getAsJsonObject("Question_01").get("Correct_Answer").getAsString())){
                                        tvAnswerD.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerD.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (answers.isClickable()){

                                        linearLayoutCA.setVisibility(View.VISIBLE);
                                    } else {
                                        linearLayoutCA.setVisibility(View.GONE);
                                        finish();
                                    }

                                }
                            });

                            binding.tvQuestion2.setText(jsonObject.getAsJsonObject("Question_02").get("Question").getAsString());
                            binding.tvAnswerA2.setText(jsonObject.getAsJsonObject("Question_02").get("A").getAsString());
                            binding.tvAnswerB2.setText(jsonObject.getAsJsonObject("Question_02").get("B").getAsString());
                            binding.tvAnswerC2.setText(jsonObject.getAsJsonObject("Question_02").get("C").getAsString());
                            binding.tvAnswerD2.setText(jsonObject.getAsJsonObject("Question_02").get("D").getAsString());
                            binding.tvCorrectAnswer2.setText(jsonObject.getAsJsonObject("Question_02").get("Correct_Answer").getAsString());

                            answers2.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {

                                    if (!"A".equals(jsonObject.getAsJsonObject("Question_02").get("Correct_Answer").getAsString())){
                                        tvAnswerA2.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));

                                    }else {
                                        tvAnswerA2.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"B".equals(jsonObject.getAsJsonObject("Question_02").get("Correct_Answer").getAsString())){
                                        tvAnswerB2.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerB2.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"C".equals(jsonObject.getAsJsonObject("Question_02").get("Correct_Answer").getAsString())){
                                        tvAnswerC2.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerC2.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"D".equals(jsonObject.getAsJsonObject("Question_02").get("Correct_Answer").getAsString())){
                                        tvAnswerD2.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerD2.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (answers2.isClickable()){

                                        linearLayoutCA2.setVisibility(View.VISIBLE);
                                    } else {
                                        linearLayoutCA2.setVisibility(View.GONE);
                                        finish();
                                    }

                                }
                            });

                            binding.tvQuestion3.setText(jsonObject.getAsJsonObject("Question_03").get("Question").getAsString());
                            binding.tvAnswerA3.setText(jsonObject.getAsJsonObject("Question_03").get("A").getAsString());
                            binding.tvAnswerB3.setText(jsonObject.getAsJsonObject("Question_03").get("B").getAsString());
                            binding.tvAnswerC3.setText(jsonObject.getAsJsonObject("Question_03").get("C").getAsString());
                            binding.tvAnswerD3.setText(jsonObject.getAsJsonObject("Question_03").get("D").getAsString());
                            binding.tvCorrectAnswer3.setText(jsonObject.getAsJsonObject("Question_03").get("Correct_Answer").getAsString());

                            answers3.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {

                                    if (!"A".equals(jsonObject.getAsJsonObject("Question_03").get("Correct_Answer").getAsString())){
                                        tvAnswerA3.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));

                                    }else {
                                        tvAnswerA3.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"B".equals(jsonObject.getAsJsonObject("Question_03").get("Correct_Answer").getAsString())){
                                        tvAnswerB3.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerB3.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"C".equals(jsonObject.getAsJsonObject("Question_03").get("Correct_Answer").getAsString())){
                                        tvAnswerC3.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerC3.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"D".equals(jsonObject.getAsJsonObject("Question_03").get("Correct_Answer").getAsString())){
                                        tvAnswerD3.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerD3.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (answers3.isClickable()){

                                        linearLayoutCA3.setVisibility(View.VISIBLE);
                                    } else {
                                        linearLayoutCA3.setVisibility(View.GONE);
                                        finish();
                                    }

                                }
                            });

                            binding.tvQuestion4.setText(jsonObject.getAsJsonObject("Question_04").get("Question").getAsString());
                            binding.tvAnswerA4.setText(jsonObject.getAsJsonObject("Question_04").get("A").getAsString());
                            binding.tvAnswerB4.setText(jsonObject.getAsJsonObject("Question_04").get("B").getAsString());
                            binding.tvAnswerC4.setText(jsonObject.getAsJsonObject("Question_04").get("C").getAsString());
                            binding.tvAnswerD4.setText(jsonObject.getAsJsonObject("Question_04").get("D").getAsString());
                            binding.tvCorrectAnswer4.setText(jsonObject.getAsJsonObject("Question_04").get("Correct_Answer").getAsString());

                            answers4.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {

                                    if (!"A".equals(jsonObject.getAsJsonObject("Question_04").get("Correct_Answer").getAsString())){
                                        tvAnswerA4.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));

                                    }else {
                                        tvAnswerA4.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"B".equals(jsonObject.getAsJsonObject("Question_04").get("Correct_Answer").getAsString())){
                                        tvAnswerB4.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerB4.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"C".equals(jsonObject.getAsJsonObject("Question_04").get("Correct_Answer").getAsString())){
                                        tvAnswerC4.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerC4.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"D".equals(jsonObject.getAsJsonObject("Question_04").get("Correct_Answer").getAsString())){
                                        tvAnswerD4.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerD4.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (answers4.isClickable()){

                                        linearLayoutCA4.setVisibility(View.VISIBLE);
                                    } else {
                                        linearLayoutCA4.setVisibility(View.GONE);
                                        finish();
                                    }

                                }
                            });

                            binding.tvQuestion5.setText(jsonObject.getAsJsonObject("Question_05").get("Question").getAsString());
                            binding.tvAnswerA5.setText(jsonObject.getAsJsonObject("Question_05").get("A").getAsString());
                            binding.tvAnswerB5.setText(jsonObject.getAsJsonObject("Question_05").get("B").getAsString());
                            binding.tvAnswerC5.setText(jsonObject.getAsJsonObject("Question_05").get("C").getAsString());
                            binding.tvAnswerD5.setText(jsonObject.getAsJsonObject("Question_05").get("D").getAsString());
                            binding.tvCorrectAnswer5.setText(jsonObject.getAsJsonObject("Question_05").get("Correct_Answer").getAsString());

                            answers5.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {

                                    if (!"A".equals(jsonObject.getAsJsonObject("Question_05").get("Correct_Answer").getAsString())){
                                        tvAnswerA5.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));

                                    }else {
                                        tvAnswerA5.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"B".equals(jsonObject.getAsJsonObject("Question_05").get("Correct_Answer").getAsString())){
                                        tvAnswerB5.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerB5.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"C".equals(jsonObject.getAsJsonObject("Question_05").get("Correct_Answer").getAsString())){
                                        tvAnswerC5.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerC5.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"D".equals(jsonObject.getAsJsonObject("Question_05").get("Correct_Answer").getAsString())){
                                        tvAnswerD5.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerD5.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (answers5.isClickable()){

                                        linearLayoutCA5.setVisibility(View.VISIBLE);
                                    } else {
                                        linearLayoutCA5.setVisibility(View.GONE);
                                        finish();
                                    }

                                }
                            });

                            binding.tvQuestion6.setText(jsonObject.getAsJsonObject("Question_06").get("Question").getAsString());
                            binding.tvAnswerA6.setText(jsonObject.getAsJsonObject("Question_06").get("A").getAsString());
                            binding.tvAnswerB6.setText(jsonObject.getAsJsonObject("Question_06").get("B").getAsString());
                            binding.tvAnswerC6.setText(jsonObject.getAsJsonObject("Question_06").get("C").getAsString());
                            binding.tvAnswerD6.setText(jsonObject.getAsJsonObject("Question_06").get("D").getAsString());
                            binding.tvCorrectAnswer6.setText(jsonObject.getAsJsonObject("Question_06").get("Correct_Answer").getAsString());

                            answers6.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {

                                    if (!"A".equals(jsonObject.getAsJsonObject("Question_06").get("Correct_Answer").getAsString())){
                                        tvAnswerA6.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));

                                    }else {
                                        tvAnswerA6.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"B".equals(jsonObject.getAsJsonObject("Question_06").get("Correct_Answer").getAsString())){
                                        tvAnswerB6.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerB6.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"C".equals(jsonObject.getAsJsonObject("Question_06").get("Correct_Answer").getAsString())){
                                        tvAnswerC6.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerC6.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"D".equals(jsonObject.getAsJsonObject("Question_06").get("Correct_Answer").getAsString())){
                                        tvAnswerD6.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerD6.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (answers6.isClickable()){

                                        linearLayoutCA6.setVisibility(View.VISIBLE);
                                    } else {
                                        linearLayoutCA6.setVisibility(View.GONE);
                                        finish();
                                    }

                                }
                            });

                            binding.tvQuestion7.setText(jsonObject.getAsJsonObject("Question_07").get("Question").getAsString());
                            binding.tvAnswerA7.setText(jsonObject.getAsJsonObject("Question_07").get("A").getAsString());
                            binding.tvAnswerB7.setText(jsonObject.getAsJsonObject("Question_07").get("B").getAsString());
                            binding.tvAnswerC7.setText(jsonObject.getAsJsonObject("Question_07").get("C").getAsString());
                            binding.tvAnswerD7.setText(jsonObject.getAsJsonObject("Question_07").get("D").getAsString());
                            binding.tvCorrectAnswer7.setText(jsonObject.getAsJsonObject("Question_07").get("Correct_Answer").getAsString());

                            answers7.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {

                                    if (!"A".equals(jsonObject.getAsJsonObject("Question_07").get("Correct_Answer").getAsString())){
                                        tvAnswerA7.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));

                                    }else {
                                        tvAnswerA7.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"B".equals(jsonObject.getAsJsonObject("Question_07").get("Correct_Answer").getAsString())){
                                        tvAnswerB7.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerB7.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"C".equals(jsonObject.getAsJsonObject("Question_07").get("Correct_Answer").getAsString())){
                                        tvAnswerC7.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerC7.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"D".equals(jsonObject.getAsJsonObject("Question_07").get("Correct_Answer").getAsString())){
                                        tvAnswerD7.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerD7.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (answers7.isClickable()){

                                        linearLayoutCA7.setVisibility(View.VISIBLE);
                                    } else {
                                        linearLayoutCA7.setVisibility(View.GONE);
                                        finish();
                                    }

                                }
                            });

                            binding.tvQuestion8.setText(jsonObject.getAsJsonObject("Question_08").get("Question").getAsString());
                            binding.tvAnswerA8.setText(jsonObject.getAsJsonObject("Question_08").get("A").getAsString());
                            binding.tvAnswerB8.setText(jsonObject.getAsJsonObject("Question_08").get("B").getAsString());
                            binding.tvAnswerC8.setText(jsonObject.getAsJsonObject("Question_08").get("C").getAsString());
                            binding.tvAnswerD8.setText(jsonObject.getAsJsonObject("Question_08").get("D").getAsString());
                            binding.tvCorrectAnswer8.setText(jsonObject.getAsJsonObject("Question_08").get("Correct_Answer").getAsString());

                            answers8.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {

                                    if (!"A".equals(jsonObject.getAsJsonObject("Question_08").get("Correct_Answer").getAsString())){
                                        tvAnswerA8.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));

                                    }else {
                                        tvAnswerA8.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"B".equals(jsonObject.getAsJsonObject("Question_08").get("Correct_Answer").getAsString())){
                                        tvAnswerB8.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerB8.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"C".equals(jsonObject.getAsJsonObject("Question_08").get("Correct_Answer").getAsString())){
                                        tvAnswerC8.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerC8.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"D".equals(jsonObject.getAsJsonObject("Question_08").get("Correct_Answer").getAsString())){
                                        tvAnswerD8.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerD8.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (answers8.isClickable()){

                                        linearLayoutCA8.setVisibility(View.VISIBLE);
                                    } else {
                                        linearLayoutCA8.setVisibility(View.GONE);
                                        finish();
                                    }

                                }
                            });




                        }else {
                            Toast.makeText(Questions.this, "Failed!!!", Toast.LENGTH_SHORT).show();
                        }

                    }
                });
            }
        });
        binding.geometry.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View v) {
                Algebra.setTextColor(Color.BLACK);
                Data_Handling.setTextColor(Color.BLACK);
                Geometry.setTextColor(Color.parseColor(getString(R.color.orange)));
                Measurement.setTextColor(Color.BLACK);
                Numbers.setTextColor(Color.BLACK);
                reference = FirebaseDatabase.getInstance().getReference().child("Grade_4").child("Geometry");
                reference.get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<DataSnapshot> task) {

                        if (task.isSuccessful()){
                            Toast.makeText(Questions.this, "Successful", Toast.LENGTH_SHORT).show();
                            DataSnapshot dataSnapshot = task.getResult();
                            Object questionObj = dataSnapshot.getValue();
                            String json = new Gson().toJson(questionObj);
                            JsonObject jsonObject = new JsonParser().parse(json).getAsJsonObject();


                            binding.tvQuestion1.setText(jsonObject.getAsJsonObject("Question_01").get("Question").getAsString());
                            binding.tvAnswerA.setText(jsonObject.getAsJsonObject("Question_01").get("A").getAsString());
                            binding.tvAnswerB.setText(jsonObject.getAsJsonObject("Question_01").get("B").getAsString());
                            binding.tvAnswerC.setText(jsonObject.getAsJsonObject("Question_01").get("C").getAsString());
                            binding.tvAnswerD.setText(jsonObject.getAsJsonObject("Question_01").get("D").getAsString());
                            binding.tvCorrectAnswer.setText(jsonObject.getAsJsonObject("Question_01").get("Correct_Answer").getAsString());

                            answers.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {

                                    if (!"A".equals(jsonObject.getAsJsonObject("Question_01").get("Correct_Answer").getAsString())){
                                        tvAnswerA.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));

                                    }else {
                                        tvAnswerA.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"B".equals(jsonObject.getAsJsonObject("Question_01").get("Correct_Answer").getAsString())){
                                        tvAnswerB.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerB.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"C".equals(jsonObject.getAsJsonObject("Question_01").get("Correct_Answer").getAsString())){
                                        tvAnswerC.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerC.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"D".equals(jsonObject.getAsJsonObject("Question_01").get("Correct_Answer").getAsString())){
                                        tvAnswerD.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerD.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (answers.isClickable()){

                                        linearLayoutCA.setVisibility(View.VISIBLE);
                                    } else {
                                        linearLayoutCA.setVisibility(View.GONE);
                                        finish();
                                    }

                                }
                            });

                            binding.tvQuestion2.setText(jsonObject.getAsJsonObject("Question_02").get("Question").getAsString());
                            binding.tvAnswerA2.setText(jsonObject.getAsJsonObject("Question_02").get("A").getAsString());
                            binding.tvAnswerB2.setText(jsonObject.getAsJsonObject("Question_02").get("B").getAsString());
                            binding.tvAnswerC2.setText(jsonObject.getAsJsonObject("Question_02").get("C").getAsString());
                            binding.tvAnswerD2.setText(jsonObject.getAsJsonObject("Question_02").get("D").getAsString());
                            binding.tvCorrectAnswer2.setText(jsonObject.getAsJsonObject("Question_02").get("Correct_Answer").getAsString());

                            answers2.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {

                                    if (!"A".equals(jsonObject.getAsJsonObject("Question_02").get("Correct_Answer").getAsString())){
                                        tvAnswerA2.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));

                                    }else {
                                        tvAnswerA2.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"B".equals(jsonObject.getAsJsonObject("Question_02").get("Correct_Answer").getAsString())){
                                        tvAnswerB2.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerB2.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"C".equals(jsonObject.getAsJsonObject("Question_02").get("Correct_Answer").getAsString())){
                                        tvAnswerC2.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerC2.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"D".equals(jsonObject.getAsJsonObject("Question_02").get("Correct_Answer").getAsString())){
                                        tvAnswerD2.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerD2.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (answers2.isClickable()){

                                        linearLayoutCA2.setVisibility(View.VISIBLE);
                                    } else {
                                        linearLayoutCA2.setVisibility(View.GONE);
                                        finish();
                                    }

                                }
                            });

                            binding.tvQuestion3.setText(jsonObject.getAsJsonObject("Question_03").get("Question").getAsString());
                            binding.tvAnswerA3.setText(jsonObject.getAsJsonObject("Question_03").get("A").getAsString());
                            binding.tvAnswerB3.setText(jsonObject.getAsJsonObject("Question_03").get("B").getAsString());
                            binding.tvAnswerC3.setText(jsonObject.getAsJsonObject("Question_03").get("C").getAsString());
                            binding.tvAnswerD3.setText(jsonObject.getAsJsonObject("Question_03").get("D").getAsString());
                            binding.tvCorrectAnswer3.setText(jsonObject.getAsJsonObject("Question_03").get("Correct_Answer").getAsString());

                            answers3.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {

                                    if (!"A".equals(jsonObject.getAsJsonObject("Question_03").get("Correct_Answer").getAsString())){
                                        tvAnswerA3.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));

                                    }else {
                                        tvAnswerA3.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"B".equals(jsonObject.getAsJsonObject("Question_03").get("Correct_Answer").getAsString())){
                                        tvAnswerB3.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerB3.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"C".equals(jsonObject.getAsJsonObject("Question_03").get("Correct_Answer").getAsString())){
                                        tvAnswerC3.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerC3.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"D".equals(jsonObject.getAsJsonObject("Question_03").get("Correct_Answer").getAsString())){
                                        tvAnswerD3.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerD3.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (answers3.isClickable()){

                                        linearLayoutCA3.setVisibility(View.VISIBLE);
                                    } else {
                                        linearLayoutCA3.setVisibility(View.GONE);
                                        finish();
                                    }

                                }
                            });

                            binding.tvQuestion4.setText(jsonObject.getAsJsonObject("Question_04").get("Question").getAsString());
                            binding.tvAnswerA4.setText(jsonObject.getAsJsonObject("Question_04").get("A").getAsString());
                            binding.tvAnswerB4.setText(jsonObject.getAsJsonObject("Question_04").get("B").getAsString());
                            binding.tvAnswerC4.setText(jsonObject.getAsJsonObject("Question_04").get("C").getAsString());
                            binding.tvAnswerD4.setText(jsonObject.getAsJsonObject("Question_04").get("D").getAsString());
                            binding.tvCorrectAnswer4.setText(jsonObject.getAsJsonObject("Question_04").get("Correct_Answer").getAsString());

                            answers4.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {

                                    if (!"A".equals(jsonObject.getAsJsonObject("Question_04").get("Correct_Answer").getAsString())){
                                        tvAnswerA4.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));

                                    }else {
                                        tvAnswerA4.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"B".equals(jsonObject.getAsJsonObject("Question_04").get("Correct_Answer").getAsString())){
                                        tvAnswerB4.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerB4.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"C".equals(jsonObject.getAsJsonObject("Question_04").get("Correct_Answer").getAsString())){
                                        tvAnswerC4.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerC4.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"D".equals(jsonObject.getAsJsonObject("Question_04").get("Correct_Answer").getAsString())){
                                        tvAnswerD4.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerD4.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (answers4.isClickable()){

                                        linearLayoutCA4.setVisibility(View.VISIBLE);
                                    } else {
                                        linearLayoutCA4.setVisibility(View.GONE);
                                        finish();
                                    }

                                }
                            });

                            binding.tvQuestion5.setText(jsonObject.getAsJsonObject("Question_05").get("Question").getAsString());
                            binding.tvAnswerA5.setText(jsonObject.getAsJsonObject("Question_05").get("A").getAsString());
                            binding.tvAnswerB5.setText(jsonObject.getAsJsonObject("Question_05").get("B").getAsString());
                            binding.tvAnswerC5.setText(jsonObject.getAsJsonObject("Question_05").get("C").getAsString());
                            binding.tvAnswerD5.setText(jsonObject.getAsJsonObject("Question_05").get("D").getAsString());
                            binding.tvCorrectAnswer5.setText(jsonObject.getAsJsonObject("Question_05").get("Correct_Answer").getAsString());

                            answers5.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {

                                    if (!"A".equals(jsonObject.getAsJsonObject("Question_05").get("Correct_Answer").getAsString())){
                                        tvAnswerA5.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));

                                    }else {
                                        tvAnswerA5.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"B".equals(jsonObject.getAsJsonObject("Question_05").get("Correct_Answer").getAsString())){
                                        tvAnswerB5.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerB5.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"C".equals(jsonObject.getAsJsonObject("Question_05").get("Correct_Answer").getAsString())){
                                        tvAnswerC5.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerC5.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"D".equals(jsonObject.getAsJsonObject("Question_05").get("Correct_Answer").getAsString())){
                                        tvAnswerD5.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerD5.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (answers5.isClickable()){

                                        linearLayoutCA5.setVisibility(View.VISIBLE);
                                    } else {
                                        linearLayoutCA5.setVisibility(View.GONE);
                                        finish();
                                    }

                                }
                            });

                            binding.tvQuestion6.setText(jsonObject.getAsJsonObject("Question_06").get("Question").getAsString());
                            binding.tvAnswerA6.setText(jsonObject.getAsJsonObject("Question_06").get("A").getAsString());
                            binding.tvAnswerB6.setText(jsonObject.getAsJsonObject("Question_06").get("B").getAsString());
                            binding.tvAnswerC6.setText(jsonObject.getAsJsonObject("Question_06").get("C").getAsString());
                            binding.tvAnswerD6.setText(jsonObject.getAsJsonObject("Question_06").get("D").getAsString());
                            binding.tvCorrectAnswer6.setText(jsonObject.getAsJsonObject("Question_06").get("Correct_Answer").getAsString());

                            answers6.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {

                                    if (!"A".equals(jsonObject.getAsJsonObject("Question_06").get("Correct_Answer").getAsString())){
                                        tvAnswerA6.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));

                                    }else {
                                        tvAnswerA6.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"B".equals(jsonObject.getAsJsonObject("Question_06").get("Correct_Answer").getAsString())){
                                        tvAnswerB6.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerB6.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"C".equals(jsonObject.getAsJsonObject("Question_06").get("Correct_Answer").getAsString())){
                                        tvAnswerC6.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerC6.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"D".equals(jsonObject.getAsJsonObject("Question_06").get("Correct_Answer").getAsString())){
                                        tvAnswerD6.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerD6.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (answers6.isClickable()){

                                        linearLayoutCA6.setVisibility(View.VISIBLE);
                                    } else {
                                        linearLayoutCA6.setVisibility(View.GONE);
                                        finish();
                                    }

                                }
                            });

                            binding.tvQuestion7.setText(jsonObject.getAsJsonObject("Question_07").get("Question").getAsString());
                            binding.tvAnswerA7.setText(jsonObject.getAsJsonObject("Question_07").get("A").getAsString());
                            binding.tvAnswerB7.setText(jsonObject.getAsJsonObject("Question_07").get("B").getAsString());
                            binding.tvAnswerC7.setText(jsonObject.getAsJsonObject("Question_07").get("C").getAsString());
                            binding.tvAnswerD7.setText(jsonObject.getAsJsonObject("Question_07").get("D").getAsString());
                            binding.tvCorrectAnswer7.setText(jsonObject.getAsJsonObject("Question_07").get("Correct_Answer").getAsString());

                            answers7.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {

                                    if (!"A".equals(jsonObject.getAsJsonObject("Question_07").get("Correct_Answer").getAsString())){
                                        tvAnswerA7.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));

                                    }else {
                                        tvAnswerA7.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"B".equals(jsonObject.getAsJsonObject("Question_07").get("Correct_Answer").getAsString())){
                                        tvAnswerB7.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerB7.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"C".equals(jsonObject.getAsJsonObject("Question_07").get("Correct_Answer").getAsString())){
                                        tvAnswerC7.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerC7.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"D".equals(jsonObject.getAsJsonObject("Question_07").get("Correct_Answer").getAsString())){
                                        tvAnswerD7.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerD7.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (answers7.isClickable()){

                                        linearLayoutCA7.setVisibility(View.VISIBLE);
                                    } else {
                                        linearLayoutCA7.setVisibility(View.GONE);
                                        finish();
                                    }

                                }
                            });

                            binding.tvQuestion8.setText(jsonObject.getAsJsonObject("Question_08").get("Question").getAsString());
                            binding.tvAnswerA8.setText(jsonObject.getAsJsonObject("Question_08").get("A").getAsString());
                            binding.tvAnswerB8.setText(jsonObject.getAsJsonObject("Question_08").get("B").getAsString());
                            binding.tvAnswerC8.setText(jsonObject.getAsJsonObject("Question_08").get("C").getAsString());
                            binding.tvAnswerD8.setText(jsonObject.getAsJsonObject("Question_08").get("D").getAsString());
                            binding.tvCorrectAnswer8.setText(jsonObject.getAsJsonObject("Question_08").get("Correct_Answer").getAsString());

                            answers8.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {

                                    if (!"A".equals(jsonObject.getAsJsonObject("Question_08").get("Correct_Answer").getAsString())){
                                        tvAnswerA8.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));

                                    }else {
                                        tvAnswerA8.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"B".equals(jsonObject.getAsJsonObject("Question_08").get("Correct_Answer").getAsString())){
                                        tvAnswerB8.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerB8.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"C".equals(jsonObject.getAsJsonObject("Question_08").get("Correct_Answer").getAsString())){
                                        tvAnswerC8.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerC8.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"D".equals(jsonObject.getAsJsonObject("Question_08").get("Correct_Answer").getAsString())){
                                        tvAnswerD8.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerD8.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (answers8.isClickable()){

                                        linearLayoutCA8.setVisibility(View.VISIBLE);
                                    } else {
                                        linearLayoutCA8.setVisibility(View.GONE);
                                        finish();
                                    }

                                }
                            });

                            binding.tvQuestion9.setText(jsonObject.getAsJsonObject("Question_09").get("Question").getAsString());
                            binding.tvAnswerA9.setText(jsonObject.getAsJsonObject("Question_09").get("A").getAsString());
                            binding.tvAnswerB9.setText(jsonObject.getAsJsonObject("Question_09").get("B").getAsString());
                            binding.tvAnswerC9.setText(jsonObject.getAsJsonObject("Question_09").get("C").getAsString());
                            binding.tvAnswerD9.setText(jsonObject.getAsJsonObject("Question_09").get("D").getAsString());
                            binding.tvCorrectAnswer9.setText(jsonObject.getAsJsonObject("Question_09").get("Correct_Answer").getAsString());

                            answers9.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {

                                    if (!"A".equals(jsonObject.getAsJsonObject("Question_09").get("Correct_Answer").getAsString())){
                                        tvAnswerA9.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));

                                    }else {
                                        tvAnswerA9.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"B".equals(jsonObject.getAsJsonObject("Question_09").get("Correct_Answer").getAsString())){
                                        tvAnswerB9.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerB9.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"C".equals(jsonObject.getAsJsonObject("Question_09").get("Correct_Answer").getAsString())){
                                        tvAnswerC9.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerC9.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"D".equals(jsonObject.getAsJsonObject("Question_09").get("Correct_Answer").getAsString())){
                                        tvAnswerD9.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerD9.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (answers9.isClickable()){

                                        linearLayoutCA9.setVisibility(View.VISIBLE);
                                    } else {
                                        linearLayoutCA9.setVisibility(View.GONE);
                                        finish();
                                    }

                                }
                            });

                            binding.tvQuestion10.setText(jsonObject.getAsJsonObject("Question_10").get("Question").getAsString());
                            binding.tvAnswerA10.setText(jsonObject.getAsJsonObject("Question_10").get("A").getAsString());
                            binding.tvAnswerB10.setText(jsonObject.getAsJsonObject("Question_10").get("B").getAsString());
                            binding.tvAnswerC10.setText(jsonObject.getAsJsonObject("Question_10").get("C").getAsString());
                            binding.tvAnswerD10.setText(jsonObject.getAsJsonObject("Question_10").get("D").getAsString());
                            binding.tvCorrectAnswer10.setText(jsonObject.getAsJsonObject("Question_10").get("Correct_Answer").getAsString());

                            answers10.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {

                                    if (!"A".equals(jsonObject.getAsJsonObject("Question_10").get("Correct_Answer").getAsString())){
                                        tvAnswerA10.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));

                                    }else {
                                        tvAnswerA10.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"B".equals(jsonObject.getAsJsonObject("Question_10").get("Correct_Answer").getAsString())){
                                        tvAnswerB10.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerB10.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"C".equals(jsonObject.getAsJsonObject("Question_10").get("Correct_Answer").getAsString())){
                                        tvAnswerC10.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerC10.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"D".equals(jsonObject.getAsJsonObject("Question_10").get("Correct_Answer").getAsString())){
                                        tvAnswerD10.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerD10.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (answers10.isClickable()){

                                        linearLayoutCA10.setVisibility(View.VISIBLE);
                                    } else {
                                        linearLayoutCA10.setVisibility(View.GONE);
                                        finish();
                                    }

                                }
                            });



                        }else {
                            Toast.makeText(Questions.this, "Failed!!!", Toast.LENGTH_SHORT).show();
                        }

                    }
                });
            }
        });

        binding.measurement.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View v) {
                Algebra.setTextColor(Color.BLACK);
                Data_Handling.setTextColor(Color.BLACK);
                Geometry.setTextColor(Color.BLACK);
                Measurement.setTextColor(Color.parseColor(getString(R.color.orange)));
                Numbers.setTextColor(Color.BLACK);
                reference = FirebaseDatabase.getInstance().getReference().child("Grade_4").child("Measurement");
                reference.get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<DataSnapshot> task) {
                        if (task.isSuccessful()){
                            Toast.makeText(Questions.this, "Successful", Toast.LENGTH_SHORT).show();
                            DataSnapshot dataSnapshot = task.getResult();

                            Object questionObj = dataSnapshot.getValue();
                            String json = new Gson().toJson(questionObj);
                            JsonObject jsonObject = new JsonParser().parse(json).getAsJsonObject();



                            binding.tvQuestion1.setText(jsonObject.getAsJsonObject("Question_01").get("Question").getAsString());
                            binding.tvAnswerA.setText(jsonObject.getAsJsonObject("Question_01").get("A").getAsString());
                            binding.tvAnswerB.setText(jsonObject.getAsJsonObject("Question_01").get("B").getAsString());
                            binding.tvAnswerC.setText(jsonObject.getAsJsonObject("Question_01").get("C").getAsString());
                            binding.tvAnswerD.setText(jsonObject.getAsJsonObject("Question_01").get("D").getAsString());
                            binding.tvCorrectAnswer.setText(jsonObject.getAsJsonObject("Question_01").get("Correct_Answer").getAsString());

                            answers.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {

                                    if (!"A".equals(jsonObject.getAsJsonObject("Question_01").get("Correct_Answer").getAsString())){
                                        tvAnswerA.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));

                                    }else {
                                        tvAnswerA.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"B".equals(jsonObject.getAsJsonObject("Question_01").get("Correct_Answer").getAsString())){
                                        tvAnswerB.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerB.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"C".equals(jsonObject.getAsJsonObject("Question_01").get("Correct_Answer").getAsString())){
                                        tvAnswerC.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerC.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"D".equals(jsonObject.getAsJsonObject("Question_01").get("Correct_Answer").getAsString())){
                                        tvAnswerD.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerD.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (answers.isClickable()){

                                        linearLayoutCA.setVisibility(View.VISIBLE);
                                    } else {
                                        linearLayoutCA.setVisibility(View.GONE);
                                        finish();
                                    }

                                }
                            });

                            binding.tvQuestion2.setText(jsonObject.getAsJsonObject("Question_02").get("Question").getAsString());
                            binding.tvAnswerA2.setText(jsonObject.getAsJsonObject("Question_02").get("A").getAsString());
                            binding.tvAnswerB2.setText(jsonObject.getAsJsonObject("Question_02").get("B").getAsString());
                            binding.tvAnswerC2.setText(jsonObject.getAsJsonObject("Question_02").get("C").getAsString());
                            binding.tvAnswerD2.setText(jsonObject.getAsJsonObject("Question_02").get("D").getAsString());
                            binding.tvCorrectAnswer2.setText(jsonObject.getAsJsonObject("Question_02").get("Correct_Answer").getAsString());

                            answers2.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {

                                    if (!"A".equals(jsonObject.getAsJsonObject("Question_02").get("Correct_Answer").getAsString())){
                                        tvAnswerA2.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));

                                    }else {
                                        tvAnswerA2.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"B".equals(jsonObject.getAsJsonObject("Question_02").get("Correct_Answer").getAsString())){
                                        tvAnswerB2.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerB2.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"C".equals(jsonObject.getAsJsonObject("Question_02").get("Correct_Answer").getAsString())){
                                        tvAnswerC2.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerC2.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"D".equals(jsonObject.getAsJsonObject("Question_02").get("Correct_Answer").getAsString())){
                                        tvAnswerD2.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerD2.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (answers2.isClickable()){

                                        linearLayoutCA2.setVisibility(View.VISIBLE);
                                    } else {
                                        linearLayoutCA2.setVisibility(View.GONE);
                                        finish();
                                    }

                                }
                            });

                            binding.tvQuestion3.setText(jsonObject.getAsJsonObject("Question_03").get("Question").getAsString());
                            binding.tvAnswerA3.setText(jsonObject.getAsJsonObject("Question_03").get("A").getAsString());
                            binding.tvAnswerB3.setText(jsonObject.getAsJsonObject("Question_03").get("B").getAsString());
                            binding.tvAnswerC3.setText(jsonObject.getAsJsonObject("Question_03").get("C").getAsString());
                            binding.tvAnswerD3.setText(jsonObject.getAsJsonObject("Question_03").get("D").getAsString());
                            binding.tvCorrectAnswer3.setText(jsonObject.getAsJsonObject("Question_03").get("Correct_Answer").getAsString());

                            answers3.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {

                                    if (!"A".equals(jsonObject.getAsJsonObject("Question_03").get("Correct_Answer").getAsString())){
                                        tvAnswerA3.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));

                                    }else {
                                        tvAnswerA3.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"B".equals(jsonObject.getAsJsonObject("Question_03").get("Correct_Answer").getAsString())){
                                        tvAnswerB3.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerB3.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"C".equals(jsonObject.getAsJsonObject("Question_03").get("Correct_Answer").getAsString())){
                                        tvAnswerC3.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerC3.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"D".equals(jsonObject.getAsJsonObject("Question_03").get("Correct_Answer").getAsString())){
                                        tvAnswerD3.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerD3.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (answers3.isClickable()){

                                        linearLayoutCA3.setVisibility(View.VISIBLE);
                                    } else {
                                        linearLayoutCA3.setVisibility(View.GONE);
                                        finish();
                                    }

                                }
                            });

                            binding.tvQuestion4.setText(jsonObject.getAsJsonObject("Question_04").get("Question").getAsString());
                            binding.tvAnswerA4.setText(jsonObject.getAsJsonObject("Question_04").get("A").getAsString());
                            binding.tvAnswerB4.setText(jsonObject.getAsJsonObject("Question_04").get("B").getAsString());
                            binding.tvAnswerC4.setText(jsonObject.getAsJsonObject("Question_04").get("C").getAsString());
                            binding.tvAnswerD4.setText(jsonObject.getAsJsonObject("Question_04").get("D").getAsString());
                            binding.tvCorrectAnswer4.setText(jsonObject.getAsJsonObject("Question_04").get("Correct_Answer").getAsString());

                            answers4.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {

                                    if (!"A".equals(jsonObject.getAsJsonObject("Question_04").get("Correct_Answer").getAsString())){
                                        tvAnswerA4.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));

                                    }else {
                                        tvAnswerA4.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"B".equals(jsonObject.getAsJsonObject("Question_04").get("Correct_Answer").getAsString())){
                                        tvAnswerB4.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerB4.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"C".equals(jsonObject.getAsJsonObject("Question_04").get("Correct_Answer").getAsString())){
                                        tvAnswerC4.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerC4.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"D".equals(jsonObject.getAsJsonObject("Question_04").get("Correct_Answer").getAsString())){
                                        tvAnswerD4.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerD4.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (answers4.isClickable()){

                                        linearLayoutCA4.setVisibility(View.VISIBLE);
                                    } else {
                                        linearLayoutCA4.setVisibility(View.GONE);
                                        finish();
                                    }

                                }
                            });

                            binding.tvQuestion5.setText(jsonObject.getAsJsonObject("Question_05").get("Question").getAsString());
                            binding.tvAnswerA5.setText(jsonObject.getAsJsonObject("Question_05").get("A").getAsString());
                            binding.tvAnswerB5.setText(jsonObject.getAsJsonObject("Question_05").get("B").getAsString());
                            binding.tvAnswerC5.setText(jsonObject.getAsJsonObject("Question_05").get("C").getAsString());
                            binding.tvAnswerD5.setText(jsonObject.getAsJsonObject("Question_05").get("D").getAsString());
                            binding.tvCorrectAnswer5.setText(jsonObject.getAsJsonObject("Question_05").get("Correct_Answer").getAsString());

                            answers5.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {

                                    if (!"A".equals(jsonObject.getAsJsonObject("Question_05").get("Correct_Answer").getAsString())){
                                        tvAnswerA5.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));

                                    }else {
                                        tvAnswerA5.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"B".equals(jsonObject.getAsJsonObject("Question_05").get("Correct_Answer").getAsString())){
                                        tvAnswerB5.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerB5.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"C".equals(jsonObject.getAsJsonObject("Question_05").get("Correct_Answer").getAsString())){
                                        tvAnswerC5.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerC5.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"D".equals(jsonObject.getAsJsonObject("Question_05").get("Correct_Answer").getAsString())){
                                        tvAnswerD5.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerD5.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (answers5.isClickable()){

                                        linearLayoutCA5.setVisibility(View.VISIBLE);
                                    } else {
                                        linearLayoutCA5.setVisibility(View.GONE);
                                        finish();
                                    }

                                }
                            });

                            binding.tvQuestion6.setText(jsonObject.getAsJsonObject("Question_06").get("Question").getAsString());
                            binding.tvAnswerA6.setText(jsonObject.getAsJsonObject("Question_06").get("A").getAsString());
                            binding.tvAnswerB6.setText(jsonObject.getAsJsonObject("Question_06").get("B").getAsString());
                            binding.tvAnswerC6.setText(jsonObject.getAsJsonObject("Question_06").get("C").getAsString());
                            binding.tvAnswerD6.setText(jsonObject.getAsJsonObject("Question_06").get("D").getAsString());
                            binding.tvCorrectAnswer6.setText(jsonObject.getAsJsonObject("Question_06").get("Correct_Answer").getAsString());

                            answers6.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {

                                    if (!"A".equals(jsonObject.getAsJsonObject("Question_06").get("Correct_Answer").getAsString())){
                                        tvAnswerA6.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));

                                    }else {
                                        tvAnswerA6.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"B".equals(jsonObject.getAsJsonObject("Question_06").get("Correct_Answer").getAsString())){
                                        tvAnswerB6.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerB6.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"C".equals(jsonObject.getAsJsonObject("Question_06").get("Correct_Answer").getAsString())){
                                        tvAnswerC6.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerC6.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"D".equals(jsonObject.getAsJsonObject("Question_06").get("Correct_Answer").getAsString())){
                                        tvAnswerD6.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerD6.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (answers6.isClickable()){

                                        linearLayoutCA6.setVisibility(View.VISIBLE);
                                    } else {
                                        linearLayoutCA6.setVisibility(View.GONE);
                                        finish();
                                    }

                                }
                            });

                            binding.tvQuestion7.setText(jsonObject.getAsJsonObject("Question_07").get("Question").getAsString());
                            binding.tvAnswerA7.setText(jsonObject.getAsJsonObject("Question_07").get("A").getAsString());
                            binding.tvAnswerB7.setText(jsonObject.getAsJsonObject("Question_07").get("B").getAsString());
                            binding.tvAnswerC7.setText(jsonObject.getAsJsonObject("Question_07").get("C").getAsString());
                            binding.tvAnswerD7.setText(jsonObject.getAsJsonObject("Question_07").get("D").getAsString());
                            binding.tvCorrectAnswer7.setText(jsonObject.getAsJsonObject("Question_07").get("Correct_Answer").getAsString());

                            answers7.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {

                                    if (!"A".equals(jsonObject.getAsJsonObject("Question_07").get("Correct_Answer").getAsString())){
                                        tvAnswerA7.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));

                                    }else {
                                        tvAnswerA7.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"B".equals(jsonObject.getAsJsonObject("Question_07").get("Correct_Answer").getAsString())){
                                        tvAnswerB7.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerB7.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"C".equals(jsonObject.getAsJsonObject("Question_07").get("Correct_Answer").getAsString())){
                                        tvAnswerC7.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerC7.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"D".equals(jsonObject.getAsJsonObject("Question_07").get("Correct_Answer").getAsString())){
                                        tvAnswerD7.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerD7.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (answers7.isClickable()){

                                        linearLayoutCA7.setVisibility(View.VISIBLE);
                                    } else {
                                        linearLayoutCA7.setVisibility(View.GONE);
                                        finish();
                                    }

                                }
                            });

                            binding.tvQuestion8.setText(jsonObject.getAsJsonObject("Question_08").get("Question").getAsString());
                            binding.tvAnswerA8.setText(jsonObject.getAsJsonObject("Question_08").get("A").getAsString());
                            binding.tvAnswerB8.setText(jsonObject.getAsJsonObject("Question_08").get("B").getAsString());
                            binding.tvAnswerC8.setText(jsonObject.getAsJsonObject("Question_08").get("C").getAsString());
                            binding.tvAnswerD8.setText(jsonObject.getAsJsonObject("Question_08").get("D").getAsString());
                            binding.tvCorrectAnswer8.setText(jsonObject.getAsJsonObject("Question_08").get("Correct_Answer").getAsString());

                            answers8.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {

                                    if (!"A".equals(jsonObject.getAsJsonObject("Question_08").get("Correct_Answer").getAsString())){
                                        tvAnswerA8.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));

                                    }else {
                                        tvAnswerA8.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"B".equals(jsonObject.getAsJsonObject("Question_08").get("Correct_Answer").getAsString())){
                                        tvAnswerB8.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerB8.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"C".equals(jsonObject.getAsJsonObject("Question_08").get("Correct_Answer").getAsString())){
                                        tvAnswerC8.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerC8.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"D".equals(jsonObject.getAsJsonObject("Question_08").get("Correct_Answer").getAsString())){
                                        tvAnswerD8.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerD8.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (answers8.isClickable()){

                                        linearLayoutCA8.setVisibility(View.VISIBLE);
                                    } else {
                                        linearLayoutCA8.setVisibility(View.GONE);
                                        finish();
                                    }

                                }
                            });

                            binding.tvQuestion9.setText(jsonObject.getAsJsonObject("Question_09").get("Question").getAsString());
                            binding.tvAnswerA9.setText(jsonObject.getAsJsonObject("Question_09").get("A").getAsString());
                            binding.tvAnswerB9.setText(jsonObject.getAsJsonObject("Question_09").get("B").getAsString());
                            binding.tvAnswerC9.setText(jsonObject.getAsJsonObject("Question_09").get("C").getAsString());
                            binding.tvAnswerD9.setText(jsonObject.getAsJsonObject("Question_09").get("D").getAsString());
                            binding.tvCorrectAnswer9.setText(jsonObject.getAsJsonObject("Question_09").get("Correct_Answer").getAsString());

                            answers9.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {

                                    if (!"A".equals(jsonObject.getAsJsonObject("Question_09").get("Correct_Answer").getAsString())){
                                        tvAnswerA9.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));

                                    }else {
                                        tvAnswerA9.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"B".equals(jsonObject.getAsJsonObject("Question_09").get("Correct_Answer").getAsString())){
                                        tvAnswerB9.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerB9.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"C".equals(jsonObject.getAsJsonObject("Question_09").get("Correct_Answer").getAsString())){
                                        tvAnswerC9.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerC9.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"D".equals(jsonObject.getAsJsonObject("Question_09").get("Correct_Answer").getAsString())){
                                        tvAnswerD9.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerD9.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (answers9.isClickable()){

                                        linearLayoutCA9.setVisibility(View.VISIBLE);
                                    } else {
                                        linearLayoutCA9.setVisibility(View.GONE);
                                        finish();
                                    }

                                }
                            });

                            binding.tvQuestion10.setText(jsonObject.getAsJsonObject("Question_10").get("Question").getAsString());
                            binding.tvAnswerA10.setText(jsonObject.getAsJsonObject("Question_10").get("A").getAsString());
                            binding.tvAnswerB10.setText(jsonObject.getAsJsonObject("Question_10").get("B").getAsString());
                            binding.tvAnswerC10.setText(jsonObject.getAsJsonObject("Question_10").get("C").getAsString());
                            binding.tvAnswerD10.setText(jsonObject.getAsJsonObject("Question_10").get("D").getAsString());
                            binding.tvCorrectAnswer10.setText(jsonObject.getAsJsonObject("Question_10").get("Correct_Answer").getAsString());

                            answers10.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {

                                    if (!"A".equals(jsonObject.getAsJsonObject("Question_10").get("Correct_Answer").getAsString())){
                                        tvAnswerA10.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));

                                    }else {
                                        tvAnswerA10.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"B".equals(jsonObject.getAsJsonObject("Question_10").get("Correct_Answer").getAsString())){
                                        tvAnswerB10.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerB10.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"C".equals(jsonObject.getAsJsonObject("Question_10").get("Correct_Answer").getAsString())){
                                        tvAnswerC10.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerC10.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"D".equals(jsonObject.getAsJsonObject("Question_10").get("Correct_Answer").getAsString())){
                                        tvAnswerD10.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerD10.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (answers10.isClickable()){

                                        linearLayoutCA10.setVisibility(View.VISIBLE);
                                    } else {
                                        linearLayoutCA10.setVisibility(View.GONE);
                                        finish();
                                    }

                                }
                            });





                        }else {
                            Toast.makeText(Questions.this, "Failed!!!", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });

        binding.numbers.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View v) {
                Algebra.setTextColor(Color.BLACK);
                Data_Handling.setTextColor(Color.BLACK);
                Geometry.setTextColor(Color.BLACK);
                Measurement.setTextColor(Color.BLACK);
                Numbers.setTextColor(Color.parseColor(getString(R.color.orange)));
                reference = FirebaseDatabase.getInstance().getReference().child("Grade_4").child("Numbers").getRef();
                reference.get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<DataSnapshot> task) {
                        if (task.isSuccessful()){
                            Toast.makeText(Questions.this, "Successful", Toast.LENGTH_SHORT).show();
                            DataSnapshot dataSnapshot = task.getResult();

                            Object questionObj = dataSnapshot.getValue();
                            String json = new Gson().toJson(questionObj);
                            JsonObject jsonObject = new JsonParser().parse(json).getAsJsonObject();

                            binding.tvQuestion1.setText(jsonObject.getAsJsonObject("Question_01").get("Question").getAsString());
                            binding.tvAnswerA.setText(jsonObject.getAsJsonObject("Question_01").get("A").getAsString());
                            binding.tvAnswerB.setText(jsonObject.getAsJsonObject("Question_01").get("B").getAsString());
                            binding.tvAnswerC.setText(jsonObject.getAsJsonObject("Question_01").get("C").getAsString());
                            binding.tvAnswerD.setText(jsonObject.getAsJsonObject("Question_01").get("D").getAsString());
                            binding.tvCorrectAnswer.setText(jsonObject.getAsJsonObject("Question_01").get("Correct_Answer").getAsString());

                            answers.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {

                                    if (!"A".equals(jsonObject.getAsJsonObject("Question_01").get("Correct_Answer").getAsString())){
                                        tvAnswerA.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));

                                    }else {
                                        tvAnswerA.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"B".equals(jsonObject.getAsJsonObject("Question_01").get("Correct_Answer").getAsString())){
                                        tvAnswerB.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerB.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"C".equals(jsonObject.getAsJsonObject("Question_01").get("Correct_Answer").getAsString())){
                                        tvAnswerC.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerC.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"D".equals(jsonObject.getAsJsonObject("Question_01").get("Correct_Answer").getAsString())){
                                        tvAnswerD.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerD.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (answers.isClickable()){

                                        linearLayoutCA.setVisibility(View.VISIBLE);
                                    } else {
                                        linearLayoutCA.setVisibility(View.GONE);
                                        finish();
                                    }

                                }
                            });

                            binding.tvQuestion2.setText(jsonObject.getAsJsonObject("Question_02").get("Question").getAsString());
                            binding.tvAnswerA2.setText(jsonObject.getAsJsonObject("Question_02").get("A").getAsString());
                            binding.tvAnswerB2.setText(jsonObject.getAsJsonObject("Question_02").get("B").getAsString());
                            binding.tvAnswerC2.setText(jsonObject.getAsJsonObject("Question_02").get("C").getAsString());
                            binding.tvAnswerD2.setText(jsonObject.getAsJsonObject("Question_02").get("D").getAsString());
                            binding.tvCorrectAnswer2.setText(jsonObject.getAsJsonObject("Question_02").get("Correct_Answer").getAsString());

                            answers2.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {

                                    if (!"A".equals(jsonObject.getAsJsonObject("Question_02").get("Correct_Answer").getAsString())){
                                        tvAnswerA2.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));

                                    }else {
                                        tvAnswerA2.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"B".equals(jsonObject.getAsJsonObject("Question_02").get("Correct_Answer").getAsString())){
                                        tvAnswerB2.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerB2.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"C".equals(jsonObject.getAsJsonObject("Question_02").get("Correct_Answer").getAsString())){
                                        tvAnswerC2.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerC2.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"D".equals(jsonObject.getAsJsonObject("Question_02").get("Correct_Answer").getAsString())){
                                        tvAnswerD2.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerD2.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (answers2.isClickable()){

                                        linearLayoutCA2.setVisibility(View.VISIBLE);
                                    } else {
                                        linearLayoutCA2.setVisibility(View.GONE);
                                        finish();
                                    }

                                }
                            });

                            binding.tvQuestion3.setText(jsonObject.getAsJsonObject("Question_03").get("Question").getAsString());
                            binding.tvAnswerA3.setText(jsonObject.getAsJsonObject("Question_03").get("A").getAsString());
                            binding.tvAnswerB3.setText(jsonObject.getAsJsonObject("Question_03").get("B").getAsString());
                            binding.tvAnswerC3.setText(jsonObject.getAsJsonObject("Question_03").get("C").getAsString());
                            binding.tvAnswerD3.setText(jsonObject.getAsJsonObject("Question_03").get("D").getAsString());
                            binding.tvCorrectAnswer3.setText(jsonObject.getAsJsonObject("Question_03").get("Correct_Answer").getAsString());

                            answers3.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {

                                    if (!"A".equals(jsonObject.getAsJsonObject("Question_03").get("Correct_Answer").getAsString())){
                                        tvAnswerA3.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));

                                    }else {
                                        tvAnswerA3.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"B".equals(jsonObject.getAsJsonObject("Question_03").get("Correct_Answer").getAsString())){
                                        tvAnswerB3.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerB3.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"C".equals(jsonObject.getAsJsonObject("Question_03").get("Correct_Answer").getAsString())){
                                        tvAnswerC3.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerC3.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"D".equals(jsonObject.getAsJsonObject("Question_03").get("Correct_Answer").getAsString())){
                                        tvAnswerD3.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerD3.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (answers3.isClickable()){

                                        linearLayoutCA3.setVisibility(View.VISIBLE);
                                    } else {
                                        linearLayoutCA3.setVisibility(View.GONE);
                                        finish();
                                    }

                                }
                            });

                            binding.tvQuestion4.setText(jsonObject.getAsJsonObject("Question_04").get("Question").getAsString());
                            binding.tvAnswerA4.setText(jsonObject.getAsJsonObject("Question_04").get("A").getAsString());
                            binding.tvAnswerB4.setText(jsonObject.getAsJsonObject("Question_04").get("B").getAsString());
                            binding.tvAnswerC4.setText(jsonObject.getAsJsonObject("Question_04").get("C").getAsString());
                            binding.tvAnswerD4.setText(jsonObject.getAsJsonObject("Question_04").get("D").getAsString());
                            binding.tvCorrectAnswer4.setText(jsonObject.getAsJsonObject("Question_04").get("Correct_Answer").getAsString());

                            answers4.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {

                                    if (!"A".equals(jsonObject.getAsJsonObject("Question_04").get("Correct_Answer").getAsString())){
                                        tvAnswerA4.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));

                                    }else {
                                        tvAnswerA4.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"B".equals(jsonObject.getAsJsonObject("Question_04").get("Correct_Answer").getAsString())){
                                        tvAnswerB4.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerB4.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"C".equals(jsonObject.getAsJsonObject("Question_04").get("Correct_Answer").getAsString())){
                                        tvAnswerC4.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerC4.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"D".equals(jsonObject.getAsJsonObject("Question_04").get("Correct_Answer").getAsString())){
                                        tvAnswerD4.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerD4.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (answers4.isClickable()){

                                        linearLayoutCA4.setVisibility(View.VISIBLE);
                                    } else {
                                        linearLayoutCA4.setVisibility(View.GONE);
                                        finish();
                                    }

                                }
                            });

                            binding.tvQuestion5.setText(jsonObject.getAsJsonObject("Question_05").get("Question").getAsString());
                            binding.tvAnswerA5.setText(jsonObject.getAsJsonObject("Question_05").get("A").getAsString());
                            binding.tvAnswerB5.setText(jsonObject.getAsJsonObject("Question_05").get("B").getAsString());
                            binding.tvAnswerC5.setText(jsonObject.getAsJsonObject("Question_05").get("C").getAsString());
                            binding.tvAnswerD5.setText(jsonObject.getAsJsonObject("Question_05").get("D").getAsString());
                            binding.tvCorrectAnswer5.setText(jsonObject.getAsJsonObject("Question_05").get("Correct_Answer").getAsString());

                            answers5.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {

                                    if (!"A".equals(jsonObject.getAsJsonObject("Question_05").get("Correct_Answer").getAsString())){
                                        tvAnswerA5.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));

                                    }else {
                                        tvAnswerA5.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"B".equals(jsonObject.getAsJsonObject("Question_05").get("Correct_Answer").getAsString())){
                                        tvAnswerB5.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerB5.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"C".equals(jsonObject.getAsJsonObject("Question_05").get("Correct_Answer").getAsString())){
                                        tvAnswerC5.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerC5.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"D".equals(jsonObject.getAsJsonObject("Question_05").get("Correct_Answer").getAsString())){
                                        tvAnswerD5.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerD5.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (answers5.isClickable()){

                                        linearLayoutCA5.setVisibility(View.VISIBLE);
                                    } else {
                                        linearLayoutCA5.setVisibility(View.GONE);
                                        finish();
                                    }

                                }
                            });

                            binding.tvQuestion6.setText(jsonObject.getAsJsonObject("Question_06").get("Question").getAsString());
                            binding.tvAnswerA6.setText(jsonObject.getAsJsonObject("Question_06").get("A").getAsString());
                            binding.tvAnswerB6.setText(jsonObject.getAsJsonObject("Question_06").get("B").getAsString());
                            binding.tvAnswerC6.setText(jsonObject.getAsJsonObject("Question_06").get("C").getAsString());
                            binding.tvAnswerD6.setText(jsonObject.getAsJsonObject("Question_06").get("D").getAsString());
                            binding.tvCorrectAnswer6.setText(jsonObject.getAsJsonObject("Question_06").get("Correct_Answer").getAsString());

                            answers6.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {

                                    if (!"A".equals(jsonObject.getAsJsonObject("Question_06").get("Correct_Answer").getAsString())){
                                        tvAnswerA6.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));

                                    }else {
                                        tvAnswerA6.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"B".equals(jsonObject.getAsJsonObject("Question_06").get("Correct_Answer").getAsString())){
                                        tvAnswerB6.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerB6.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"C".equals(jsonObject.getAsJsonObject("Question_06").get("Correct_Answer").getAsString())){
                                        tvAnswerC6.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerC6.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"D".equals(jsonObject.getAsJsonObject("Question_06").get("Correct_Answer").getAsString())){
                                        tvAnswerD6.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerD6.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (answers6.isClickable()){

                                        linearLayoutCA6.setVisibility(View.VISIBLE);
                                    } else {
                                        linearLayoutCA6.setVisibility(View.GONE);
                                        finish();
                                    }

                                }
                            });

                            binding.tvQuestion7.setText(jsonObject.getAsJsonObject("Question_07").get("Question").getAsString());
                            binding.tvAnswerA7.setText(jsonObject.getAsJsonObject("Question_07").get("A").getAsString());
                            binding.tvAnswerB7.setText(jsonObject.getAsJsonObject("Question_07").get("B").getAsString());
                            binding.tvAnswerC7.setText(jsonObject.getAsJsonObject("Question_07").get("C").getAsString());
                            binding.tvAnswerD7.setText(jsonObject.getAsJsonObject("Question_07").get("D").getAsString());
                            binding.tvCorrectAnswer7.setText(jsonObject.getAsJsonObject("Question_07").get("Correct_Answer").getAsString());

                            answers7.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {

                                    if (!"A".equals(jsonObject.getAsJsonObject("Question_07").get("Correct_Answer").getAsString())){
                                        tvAnswerA7.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));

                                    }else {
                                        tvAnswerA7.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"B".equals(jsonObject.getAsJsonObject("Question_07").get("Correct_Answer").getAsString())){
                                        tvAnswerB7.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerB7.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"C".equals(jsonObject.getAsJsonObject("Question_07").get("Correct_Answer").getAsString())){
                                        tvAnswerC7.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerC7.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"D".equals(jsonObject.getAsJsonObject("Question_07").get("Correct_Answer").getAsString())){
                                        tvAnswerD7.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerD7.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (answers7.isClickable()){

                                        linearLayoutCA7.setVisibility(View.VISIBLE);
                                    } else {
                                        linearLayoutCA7.setVisibility(View.GONE);
                                        finish();
                                    }

                                }
                            });

                            binding.tvQuestion8.setText(jsonObject.getAsJsonObject("Question_08").get("Question").getAsString());
                            binding.tvAnswerA8.setText(jsonObject.getAsJsonObject("Question_08").get("A").getAsString());
                            binding.tvAnswerB8.setText(jsonObject.getAsJsonObject("Question_08").get("B").getAsString());
                            binding.tvAnswerC8.setText(jsonObject.getAsJsonObject("Question_08").get("C").getAsString());
                            binding.tvAnswerD8.setText(jsonObject.getAsJsonObject("Question_08").get("D").getAsString());
                            binding.tvCorrectAnswer8.setText(jsonObject.getAsJsonObject("Question_08").get("Correct_Answer").getAsString());

                            answers8.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {

                                    if (!"A".equals(jsonObject.getAsJsonObject("Question_08").get("Correct_Answer").getAsString())){
                                        tvAnswerA8.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));

                                    }else {
                                        tvAnswerA8.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"B".equals(jsonObject.getAsJsonObject("Question_08").get("Correct_Answer").getAsString())){
                                        tvAnswerB8.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerB8.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"C".equals(jsonObject.getAsJsonObject("Question_08").get("Correct_Answer").getAsString())){
                                        tvAnswerC8.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerC8.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"D".equals(jsonObject.getAsJsonObject("Question_08").get("Correct_Answer").getAsString())){
                                        tvAnswerD8.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerD8.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (answers8.isClickable()){

                                        linearLayoutCA8.setVisibility(View.VISIBLE);
                                    } else {
                                        linearLayoutCA8.setVisibility(View.GONE);
                                        finish();
                                    }

                                }
                            });

                            binding.tvQuestion9.setText(jsonObject.getAsJsonObject("Question_09").get("Question").getAsString());
                            binding.tvAnswerA9.setText(jsonObject.getAsJsonObject("Question_09").get("A").getAsString());
                            binding.tvAnswerB9.setText(jsonObject.getAsJsonObject("Question_09").get("B").getAsString());
                            binding.tvAnswerC9.setText(jsonObject.getAsJsonObject("Question_09").get("C").getAsString());
                            binding.tvAnswerD9.setText(jsonObject.getAsJsonObject("Question_09").get("D").getAsString());
                            binding.tvCorrectAnswer9.setText(jsonObject.getAsJsonObject("Question_09").get("Correct_Answer").getAsString());

                            answers9.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {

                                    if (!"A".equals(jsonObject.getAsJsonObject("Question_09").get("Correct_Answer").getAsString())){
                                        tvAnswerA9.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));

                                    }else {
                                        tvAnswerA9.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"B".equals(jsonObject.getAsJsonObject("Question_09").get("Correct_Answer").getAsString())){
                                        tvAnswerB9.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerB9.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"C".equals(jsonObject.getAsJsonObject("Question_09").get("Correct_Answer").getAsString())){
                                        tvAnswerC9.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerC9.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"D".equals(jsonObject.getAsJsonObject("Question_09").get("Correct_Answer").getAsString())){
                                        tvAnswerD9.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerD9.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (answers9.isClickable()){

                                        linearLayoutCA9.setVisibility(View.VISIBLE);
                                    } else {
                                        linearLayoutCA9.setVisibility(View.GONE);
                                        finish();
                                    }

                                }
                            });

                            binding.tvQuestion10.setText(jsonObject.getAsJsonObject("Question_10").get("Question").getAsString());
                            binding.tvAnswerA10.setText(jsonObject.getAsJsonObject("Question_10").get("A").getAsString());
                            binding.tvAnswerB10.setText(jsonObject.getAsJsonObject("Question_10").get("B").getAsString());
                            binding.tvAnswerC10.setText(jsonObject.getAsJsonObject("Question_10").get("C").getAsString());
                            binding.tvAnswerD10.setText(jsonObject.getAsJsonObject("Question_10").get("D").getAsString());
                            binding.tvCorrectAnswer10.setText(jsonObject.getAsJsonObject("Question_10").get("Correct_Answer").getAsString());

                            answers10.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {

                                    if (!"A".equals(jsonObject.getAsJsonObject("Question_10").get("Correct_Answer").getAsString())){
                                        tvAnswerA10.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));

                                    }else {
                                        tvAnswerA10.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"B".equals(jsonObject.getAsJsonObject("Question_10").get("Correct_Answer").getAsString())){
                                        tvAnswerB10.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerB10.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"C".equals(jsonObject.getAsJsonObject("Question_10").get("Correct_Answer").getAsString())){
                                        tvAnswerC10.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerC10.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (!"D".equals(jsonObject.getAsJsonObject("Question_10").get("Correct_Answer").getAsString())){
                                        tvAnswerD10.setBackgroundColor(Color.parseColor(getString(R.color.colorWrong)));
                                    }
                                    else {
                                        tvAnswerD10.setBackgroundColor(Color.parseColor(getString(R.color.colorCorrect)));
                                    }
                                    if (answers10.isClickable()){

                                        linearLayoutCA10.setVisibility(View.VISIBLE);
                                    } else {
                                        linearLayoutCA10.setVisibility(View.GONE);
                                        finish();
                                    }

                                }
                            });




                        }else {
                            Toast.makeText(Questions.this, "Failed!!!", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });

        imageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Questions.this, Mathematics.class);
                startActivity(intent);
                finish();
            }
        });




    }
}