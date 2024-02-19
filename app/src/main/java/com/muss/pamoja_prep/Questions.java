package com.muss.pamoja_prep;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.muss.pamoja_prep.databinding.ActivityQuestionsBinding;

public class Questions extends AppCompatActivity {

    EditText editText;
    TextView Q1,Q2,Q3,Q4,Q5,Q6,Q7,Q8,Q9,Q10,Q11,Q12,Q13,Q14,Q15,Q16,Q17,Q18;
    DatabaseReference reference;
    ActivityQuestionsBinding binding;

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
        Q11 = findViewById(R.id.question11);
        Q12 = findViewById(R.id.question12);
        Q13 = findViewById(R.id.question13);
        Q14 = findViewById(R.id.question14);
        Q15 = findViewById(R.id.question15);
        Q16 = findViewById(R.id.question16);
        Q17 = findViewById(R.id.question17);

        binding.algebra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reference = FirebaseDatabase.getInstance().getReference().child("Grade_4").child("Algebra").getRef();
                reference.get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<DataSnapshot> task) {

                        if (task.isSuccessful()){
                            Toast.makeText(Questions.this, "Successful", Toast.LENGTH_SHORT).show();
                            DataSnapshot dataSnapshot = task.getResult();

                            String Question_1128 = String.valueOf(dataSnapshot.child("Question_1128").getValue());
                            String Question_1129 = String.valueOf(dataSnapshot.child("Question_1129").getValue());
                            String Question_1130 = String.valueOf(dataSnapshot.child("Question_1130").getValue());
                            String Question_1131 = String.valueOf(dataSnapshot.child("Question_1131").getValue());
                            String Question_1132 = String.valueOf(dataSnapshot.child("Question_1132").getValue());
                            String Question_1133 = String.valueOf(dataSnapshot.child("Question_1133").getValue());
                            String Question_1134 = String.valueOf(dataSnapshot.child("Question_1134").getValue());
                            String Question_1135 = String.valueOf(dataSnapshot.child("Question_1135").getValue());
                            String Question_1136 = String.valueOf(dataSnapshot.child("Question_1136").getValue());
                            String Question_1137 = String.valueOf(dataSnapshot.child("Question_1137").getValue());
                            String Question_1138 = String.valueOf(dataSnapshot.child("Question_1138").getValue());
                            String Question_1139 = String.valueOf(dataSnapshot.child("Question_1139").getValue());
                            String Question_1140 = String.valueOf(dataSnapshot.child("Question_1140").getValue());
                            String Question_1141 = String.valueOf(dataSnapshot.child("Question_1141").getValue());
                            String Question_1142 = String.valueOf(dataSnapshot.child("Question_1142").getValue());
                            String Question_1143 = String.valueOf(dataSnapshot.child("Question_1143").getValue());
                            String Question_1144 = String.valueOf(dataSnapshot.child("Question_1144").getValue());
                            String Question_1145 = String.valueOf(dataSnapshot.child("Question_1145").getValue());

                            binding.tvQuestion1.setText(Question_1128);
                            binding.tvQuestion2.setText(Question_1129);
                            binding.tvQuestion3.setText(Question_1130);
                            binding.tvQuestion4.setText(Question_1131);
                            binding.tvQuestion5.setText(Question_1132);
                            binding.tvQuestion6.setText(Question_1133);
                            binding.tvQuestion7.setText(Question_1134);
                            binding.tvQuestion8.setText(Question_1135);
                            binding.tvQuestion9.setText(Question_1136);
                            binding.tvQuestion10.setText(Question_1137);
                            binding.tvQuestion11.setText(Question_1138);
                            binding.tvQuestion12.setText(Question_1139);
                            binding.tvQuestion13.setText(Question_1140);
                            binding.tvQuestion14.setText(Question_1141);
                            binding.tvQuestion15.setText(Question_1142);
                            binding.tvQuestion16.setText(Question_1143);
                            binding.tvQuestion17.setText(Question_1144);
                            binding.tvQuestion18.setText(Question_1145);



                        }else {
                            Toast.makeText(Questions.this, "Failed!!!", Toast.LENGTH_SHORT).show();
                        }

                    }
                });
            }
        });

        binding.data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reference = FirebaseDatabase.getInstance().getReference().child("Grade_4").child("DataHandling").getRef();
                reference.get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<DataSnapshot> task) {
                        if (task.isSuccessful()){
                            Toast.makeText(Questions.this, "Successful", Toast.LENGTH_SHORT).show();
                            DataSnapshot dataSnapshot = task.getResult();

                            String Question_1120 = String.valueOf(dataSnapshot.child("Question_1120").getValue());
                            String Question_1121 = String.valueOf(dataSnapshot.child("Question_1121").getValue());
                            String Question_1122 = String.valueOf(dataSnapshot.child("Question_1122").getValue());
                            String Question_1123 = String.valueOf(dataSnapshot.child("Question_1123").getValue());
                            String Question_1124 = String.valueOf(dataSnapshot.child("Question_1124").getValue());
                            String Question_1125 = String.valueOf(dataSnapshot.child("Question_1125").getValue());
                            String Question_1126 = String.valueOf(dataSnapshot.child("Question_1126").getValue());
                            String Question_1127 = String.valueOf(dataSnapshot.child("Question_1127").getValue());

                            binding.tvQuestion1.setText(Question_1120);
                            binding.tvQuestion2.setText(Question_1121);
                            binding.tvQuestion3.setText(Question_1122);
                            binding.tvQuestion4.setText(Question_1123);
                            binding.tvQuestion5.setText(Question_1124);
                            binding.tvQuestion6.setText(Question_1125);
                            binding.tvQuestion7.setText(Question_1126);
                            binding.tvQuestion8.setText(Question_1127);




                        }else {
                            Toast.makeText(Questions.this, "Failed!!!", Toast.LENGTH_SHORT).show();
                        }

                    }
                });
            }
        });
        binding.geometry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reference = FirebaseDatabase.getInstance().getReference().child("Grade_4").child("Geometry");
                reference.get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<DataSnapshot> task) {

                        if (task.isSuccessful()){
                            Toast.makeText(Questions.this, "Successful", Toast.LENGTH_SHORT).show();
                            DataSnapshot dataSnapshot = task.getResult();

                            String Question_1103 = String.valueOf(dataSnapshot.child("Question_1103").getValue());
                            Object Question = Object.class.cast("Question").toString();
                            String Question_1104 = String.valueOf(dataSnapshot.child("Question_1104").getValue());
                            String Question_1105 = String.valueOf(dataSnapshot.child("Question_1105").getValue());
                            String Question_1106 = String.valueOf(dataSnapshot.child("Question_1106").getValue());
                            String Question_1107 = String.valueOf(dataSnapshot.child("Question_1107").getValue());
                            String Question_1108 = String.valueOf(dataSnapshot.child("Question_1108").getValue());
                            String Question_1109 = String.valueOf(dataSnapshot.child("Question_1109").getValue());
                            String Question_1110 = String.valueOf(dataSnapshot.child("Question_1110").getValue());
                            String Question_1111 = String.valueOf(dataSnapshot.child("Question_1111").getValue());
                            String Question_1112 = String.valueOf(dataSnapshot.child("Question_1112").getValue());
                            String Question_1113 = String.valueOf(dataSnapshot.child("Question_1113").getValue());
                            String Question_1114 = String.valueOf(dataSnapshot.child("Question_1114").getValue());
                            String Question_1115 = String.valueOf(dataSnapshot.child("Question_1115").getValue());
                            String Question_1116 = String.valueOf(dataSnapshot.child("Question_1116").getValue());
                            String Question_1117 = String.valueOf(dataSnapshot.child("Question_1117").getValue());
                            String Question_1118 = String.valueOf(dataSnapshot.child("Question_1118").getValue());
                            String Question_1119 = String.valueOf(dataSnapshot.child("Question_1119").getValue());

                            binding.tvQuestion1.setText(Question_1103);
                            binding.tvQuestion2.setText(Question_1104);
                            binding.tvQuestion3.setText(Question_1105);
                            binding.tvQuestion4.setText(Question_1106);
                            binding.tvQuestion5.setText(Question_1107);
                            binding.tvQuestion6.setText(Question_1108);
                            binding.tvQuestion7.setText(Question_1109);
                            binding.tvQuestion8.setText(Question_1110);
                            binding.tvQuestion9.setText(Question_1111);
                            binding.tvQuestion10.setText(Question_1112);
                            binding.tvQuestion11.setText(Question_1113);
                            binding.tvQuestion12.setText(Question_1114);
                            binding.tvQuestion13.setText(Question_1115);
                            binding.tvQuestion14.setText(Question_1116);
                            binding.tvQuestion15.setText(Question_1117);
                            binding.tvQuestion16.setText(Question_1118);
                            binding.tvQuestion17.setText(Question_1119);



                        }else {
                            Toast.makeText(Questions.this, "Failed!!!", Toast.LENGTH_SHORT).show();
                        }

                    }
                });
            }
        });



    }
}