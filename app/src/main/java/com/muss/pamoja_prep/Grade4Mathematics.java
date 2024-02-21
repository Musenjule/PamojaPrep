package com.muss.pamoja_prep;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.muss.pamoja_prep.databinding.ActivityGrade4MathematicsBinding;

public class Grade4Mathematics extends AppCompatActivity {

    private String Question,A,B,C,D,Correct_Answer;
    ActivityGrade4MathematicsBinding binding;
    DatabaseReference reference;
    DatabaseReference imageReference;
    EditText topic;

    TextView algebra,data,finding,geometry,measurement,numbers;

    ImageButton imageButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityGrade4MathematicsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Button go = findViewById(R.id.goBtn);
        imageButton = findViewById(R.id.imageBtn);

        algebra = findViewById(R.id.algebra);
        data = findViewById(R.id.data);
        finding = findViewById(R.id.finding);
        geometry = findViewById(R.id.geometry);
        measurement = findViewById(R.id.measurement);
        numbers = findViewById(R.id.numbers);
        topic = findViewById(R.id.topicET);








        binding.algebra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                reference = FirebaseDatabase.getInstance().getReference();

                reference = FirebaseDatabase.getInstance().getReference().child("Grade_4").child("Algebra").child("Question_1128").getRef();

                reference.get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<DataSnapshot> task) {

                        if (task.isSuccessful()) {
                            Toast.makeText(Grade4Mathematics.this, "Successful", Toast.LENGTH_SHORT).show();
                            DataSnapshot dataSnapshot = task.getResult();

                            String Question = String.valueOf(dataSnapshot.child("Question").getValue()).toString();
                            String Answer_A = String.valueOf(dataSnapshot.child("Answer_A").getValue()).toString();
                            String Answer_B = String.valueOf(dataSnapshot.child("Answer_B").getValue()).toString();
                            String Answer_C = String.valueOf(dataSnapshot.child("Answer_C").getValue()).toString();
                            String Answer_D = String.valueOf(dataSnapshot.child("Answer_D").getValue()).toString();
                            String Correct_Answer = String.valueOf(dataSnapshot.child("Correct_Answer").getValue()).toString();

                            String Question2 = String.valueOf(dataSnapshot.child("Question").getValue()).toString();
                            String Answer_A2 = String.valueOf(dataSnapshot.child("Answer_A").getValue()).toString();
                            String Answer_B2 = String.valueOf(dataSnapshot.child("Answer_B").getValue()).toString();
                            String Answer_C2 = String.valueOf(dataSnapshot.child("Answer_C").getValue()).toString();
                            String Answer_D2 = String.valueOf(dataSnapshot.child("Answer_D").getValue()).toString();
                            String Correct_Answer2 = String.valueOf(dataSnapshot.child("Correct_Answer").getValue()).toString();

                            binding.tvQuestion.setText(Question2);
                            binding.tvAnswerA.setText(Answer_A2);
                            binding.tvAnswerB.setText(Answer_B2);
                            binding.tvAnswerC.setText(Answer_C2);
                            binding.tvAnswerD.setText(Answer_D2);
                            binding.tvCorrectAnswer.setText(Correct_Answer2);

                            binding.tvQuestion.setText(Question);
                            binding.tvAnswerA.setText(Answer_A);
                            binding.tvAnswerB.setText(Answer_B);
                            binding.tvAnswerC.setText(Answer_C);
                            binding.tvAnswerD.setText(Answer_D);
                            binding.tvCorrectAnswer.setText(Correct_Answer);


                        } else {

                            Toast.makeText(Grade4Mathematics.this, "Failed to read!!!", Toast.LENGTH_SHORT).show();
                        }

                    }
                });
            }
        });




        binding.data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                reference = FirebaseDatabase.getInstance().getReference().child("Grade_4").child("DataHandling").child("Question_1120").getRef();
                reference.get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<DataSnapshot> task) {

                        if (task.isSuccessful()) {
                            Toast.makeText(Grade4Mathematics.this, "Successful", Toast.LENGTH_SHORT).show();
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

                            Toast.makeText(Grade4Mathematics.this, "Failed to read!!!", Toast.LENGTH_SHORT).show();
                        }



                    }
                });
            }
        });

        binding.geometry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                reference = FirebaseDatabase.getInstance().getReference().child("Grade_4").child("Geometry").child("Question_1103");
                reference.get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<DataSnapshot> task) {

                        if (task.isSuccessful()) {
                            Toast.makeText(Grade4Mathematics.this, "Successful", Toast.LENGTH_SHORT).show();
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

                            Toast.makeText(Grade4Mathematics.this, "Failed to read!!!", Toast.LENGTH_SHORT).show();
                        }

                    }
                });
            }
        });

        binding.measurement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reference = FirebaseDatabase.getInstance().getReference().child("Grade_4").child("Measurement").child("Question_1000").getRef();
                reference.get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<DataSnapshot> task) {

                        if (task.isSuccessful()) {
                            Toast.makeText(Grade4Mathematics.this, "Successful", Toast.LENGTH_SHORT).show();
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

                            Toast.makeText(Grade4Mathematics.this, "Failed to read!!!", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });

        binding.numbers.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {

                reference = FirebaseDatabase.getInstance().getReference().child("Grade_4").child("Numbers").child("Question_1").getRef();
                reference.get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<DataSnapshot> task) {

                        if (task.isSuccessful()) {
                            Toast.makeText(Grade4Mathematics.this, "Successful", Toast.LENGTH_SHORT).show();
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

                            Toast.makeText(Grade4Mathematics.this, "Failed to read!!!", Toast.LENGTH_SHORT).show();
                        }

                    }
                });
            }
        });




        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Grade4Mathematics.this, Mathematics.class);
                startActivity(intent);
                finish();
            }
        });



    }
}
