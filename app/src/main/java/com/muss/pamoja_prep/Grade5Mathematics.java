package com.muss.pamoja_prep;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.muss.pamoja_prep.databinding.ActivityGrade5MathematicsBinding;

public class Grade5Mathematics extends AppCompatActivity {

    ActivityGrade5MathematicsBinding binding;
    TextView algebra,data,finding,geometry,measurement;
    TextInputLayout inputTopic;
    EditText topicET;
    TextView Question,CorrectAnswer,tvAnswer_A,tvAnswer_B,tvAnswer_C,tvAnswer_D,tvQuestion,tvCorrect_Answer;

    DatabaseReference reference;

    ImageButton imageButton;
    Button goBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityGrade5MathematicsBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());

        algebra = findViewById(R.id.algebra);
        data = findViewById(R.id.data);
        finding = findViewById(R.id.finding);
        geometry = findViewById(R.id.geometry);
        measurement = findViewById(R.id.measurement);


        Question = findViewById(R.id.question);
        tvAnswer_A = findViewById(R.id.tvAnswer_A);
        tvAnswer_B = findViewById(R.id.tvAnswer_B);
        tvAnswer_C = findViewById(R.id.tvAnswer_C);
        tvAnswer_D = findViewById(R.id.tvAnswer_D);
        tvQuestion = findViewById(R.id.tvQuestion);
        tvCorrect_Answer = findViewById(R.id.tvCorrect_Answer);


        imageButton = findViewById(R.id.imageBtn);
        topicET = findViewById(R.id.topicET);
        inputTopic = findViewById(R.id.inputTopic);



        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Grade5Mathematics.this, Mathematics.class);
                startActivity(intent);
                finish();
            }
        });

        binding.algebra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                reference = FirebaseDatabase.getInstance().getReference().child("Grade_5").child("Algebra").child("Question_1024").getRef();
                reference = reference.child("Grade_4").child("Algebra");
                reference.get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<DataSnapshot> task) {

                        if (task.isSuccessful()) {
                            Toast.makeText(Grade5Mathematics.this, "Successful", Toast.LENGTH_SHORT).show();
                            DataSnapshot dataSnapshot = task.getResult();

                            String Question = String.valueOf(dataSnapshot.child("Question").getValue()).toString();
                            String Answer_A = String.valueOf(dataSnapshot.child("Answer_A").getValue()).toString();
                            String Answer_B = String.valueOf(dataSnapshot.child("Answer_B").getValue()).toString();
                            String Answer_C = String.valueOf(dataSnapshot.child("Answer_C").getValue()).toString();
                            String Answer_D = String.valueOf(dataSnapshot.child("Answer_D").getValue()).toString();
                            String Correct_Answer = String.valueOf(dataSnapshot.child("Correct_Answer").getValue()).toString();

                            binding.tvQuestion.setText(Question);
                            binding.tvAnswerA.setText(Answer_A);
                            binding.tvAnswerB.setText(Answer_B);
                            binding.tvAnswerC.setText(Answer_C);
                            binding.tvAnswerD.setText(Answer_D);
                            binding.tvCorrectAnswer.setText(Correct_Answer);


                        } else {

                            Toast.makeText(Grade5Mathematics.this, "Failed to read!!!", Toast.LENGTH_SHORT).show();
                        }

                    }
                });
            }
        });
        binding.data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reference = FirebaseDatabase.getInstance().getReference().child("Grade_5").child("Data_Handling").child("Question_1120").getRef();
                reference.get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<DataSnapshot> task) {

                        if (task.isSuccessful()) {
                            Toast.makeText(Grade5Mathematics.this, "Successful", Toast.LENGTH_SHORT).show();
                            DataSnapshot dataSnapshot = task.getResult();

                            String Question = String.valueOf(dataSnapshot.child("Question").getValue()).toString();
                            String Answer_A = String.valueOf(dataSnapshot.child("Answer_A").getValue()).toString();
                            String Answer_B = String.valueOf(dataSnapshot.child("Answer_B").getValue()).toString();
                            String Answer_C = String.valueOf(dataSnapshot.child("Answer_C").getValue()).toString();
                            String Answer_D = String.valueOf(dataSnapshot.child("Answer_D").getValue()).toString();
                            String Correct_Answer = String.valueOf(dataSnapshot.child("Correct_Answer").getValue()).toString();

                            binding.tvQuestion.setText(Question);
                            binding.tvAnswerA.setText(Answer_A);
                            binding.tvAnswerB.setText(Answer_B);
                            binding.tvAnswerC.setText(Answer_C);
                            binding.tvAnswerD.setText(Answer_D);
                            binding.tvCorrectAnswer.setText(Correct_Answer);


                        } else {

                            Toast.makeText(Grade5Mathematics.this, "Failed to read!!!", Toast.LENGTH_SHORT).show();
                        }

                    }
                });


            }
        });
        binding.finding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                reference = FirebaseDatabase.getInstance().getReference().child("Grade_5").child("Finding_the_Unknown").child("Question_1047").getRef();
                reference.get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<DataSnapshot> task) {

                        if (task.isSuccessful()) {
                            Toast.makeText(Grade5Mathematics.this, "Successful", Toast.LENGTH_SHORT).show();
                            DataSnapshot dataSnapshot = task.getResult();

                            String Question = String.valueOf(dataSnapshot.child("Question").getValue()).toString();
                            String Answer_A = String.valueOf(dataSnapshot.child("Answer_A").getValue()).toString();
                            String Answer_B = String.valueOf(dataSnapshot.child("Answer_B").getValue()).toString();
                            String Answer_C = String.valueOf(dataSnapshot.child("Answer_C").getValue()).toString();
                            String Answer_D = String.valueOf(dataSnapshot.child("Answer_D").getValue()).toString();
                            String Correct_Answer = String.valueOf(dataSnapshot.child("Correct_Answer").getValue()).toString();

                            binding.tvQuestion.setText(Question);
                            binding.tvAnswerA.setText(Answer_A);
                            binding.tvAnswerB.setText(Answer_B);
                            binding.tvAnswerC.setText(Answer_C);
                            binding.tvAnswerD.setText(Answer_D);
                            binding.tvCorrectAnswer.setText(Correct_Answer);


                        } else {

                            Toast.makeText(Grade5Mathematics.this, "Failed to read!!!", Toast.LENGTH_SHORT).show();
                        }

                    }
                });
            }
        });

        binding.geometry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                reference = FirebaseDatabase.getInstance().getReference().child("Grade_5").child("Geometry").child("Question_1018").getRef();
                reference.get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<DataSnapshot> task) {
                        if (task.isSuccessful()) {
                            Toast.makeText(Grade5Mathematics.this, "Successful", Toast.LENGTH_SHORT).show();
                            DataSnapshot dataSnapshot = task.getResult();

                            String Question = String.valueOf(dataSnapshot.child("Question").getValue()).toString();
                            String Answer_A = String.valueOf(dataSnapshot.child("Answer_A").getValue()).toString();
                            String Answer_B = String.valueOf(dataSnapshot.child("Answer_B").getValue()).toString();
                            String Answer_C = String.valueOf(dataSnapshot.child("Answer_C").getValue()).toString();
                            String Answer_D = String.valueOf(dataSnapshot.child("Answer_D").getValue()).toString();
                            String Correct_Answer = String.valueOf(dataSnapshot.child("Correct_Answer").getValue()).toString();

                            binding.tvQuestion.setText(Question);
                            binding.tvAnswerA.setText(Answer_A);
                            binding.tvAnswerB.setText(Answer_B);
                            binding.tvAnswerC.setText(Answer_C);
                            binding.tvAnswerD.setText(Answer_D);
                            binding.tvCorrectAnswer.setText(Correct_Answer);


                        } else {

                            Toast.makeText(Grade5Mathematics.this, "Failed to read!!!", Toast.LENGTH_SHORT).show();
                        }

                    }
                });
            }
        });

        binding.measurement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                reference = FirebaseDatabase.getInstance().getReference().child("Grade_5").child("Measurement").child("Question_1000").getRef();
                reference.get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<DataSnapshot> task) {

                        if (task.isSuccessful()) {
                            Toast.makeText(Grade5Mathematics.this, "Successful", Toast.LENGTH_SHORT).show();
                            DataSnapshot dataSnapshot = task.getResult();

                            String Question = String.valueOf(dataSnapshot.child("Question").getValue()).toString();
                            String Answer_A = String.valueOf(dataSnapshot.child("Answer_A").getValue()).toString();
                            String Answer_B = String.valueOf(dataSnapshot.child("Answer_B").getValue()).toString();
                            String Answer_C = String.valueOf(dataSnapshot.child("Answer_C").getValue()).toString();
                            String Answer_D = String.valueOf(dataSnapshot.child("Answer_D").getValue()).toString();
                            String Correct_Answer = String.valueOf(dataSnapshot.child("Correct_Answer").getValue()).toString();

                            binding.tvQuestion.setText(Question);
                            binding.tvAnswerA.setText(Answer_A);
                            binding.tvAnswerB.setText(Answer_B);
                            binding.tvAnswerC.setText(Answer_C);
                            binding.tvAnswerD.setText(Answer_D);
                            binding.tvCorrectAnswer.setText(Correct_Answer);


                        } else {

                            Toast.makeText(Grade5Mathematics.this, "Failed to read!!!", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });

        binding.numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                reference = FirebaseDatabase.getInstance().getReference().child("Grade_5").child("Numbers").child("Question_1").getRef();
                reference.get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<DataSnapshot> task) {

                        if (task.isSuccessful()) {
                            Toast.makeText(Grade5Mathematics.this, "Successful", Toast.LENGTH_SHORT).show();
                            DataSnapshot dataSnapshot = task.getResult();

                            String Question = String.valueOf(dataSnapshot.child("Question").getValue()).toString();
                            String Answer_A = String.valueOf(dataSnapshot.child("Answer_A").getValue()).toString();
                            String Answer_B = String.valueOf(dataSnapshot.child("Answer_B").getValue()).toString();
                            String Answer_C = String.valueOf(dataSnapshot.child("Answer_C").getValue()).toString();
                            String Answer_D = String.valueOf(dataSnapshot.child("Answer_D").getValue()).toString();
                            String Correct_Answer = String.valueOf(dataSnapshot.child("Correct_Answer").getValue()).toString();

                            binding.tvQuestion.setText(Question);
                            binding.tvAnswerA.setText(Answer_A);
                            binding.tvAnswerB.setText(Answer_B);
                            binding.tvAnswerC.setText(Answer_C);
                            binding.tvAnswerD.setText(Answer_D);
                            binding.tvCorrectAnswer.setText(Correct_Answer);


                        } else {

                            Toast.makeText(Grade5Mathematics.this, "Failed to read!!!", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });

    }
}