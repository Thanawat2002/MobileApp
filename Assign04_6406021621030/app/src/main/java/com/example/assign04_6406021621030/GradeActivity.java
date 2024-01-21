package com.example.assign04_6406021621030;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class GradeActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnCalGrade, btnBack;
    private EditText inputScore;
    private TextView textScore, textGrade;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade);

        btnCalGrade = (Button) findViewById(R.id.btnCalGpa);
        btnCalGrade.setOnClickListener(this);
        btnBack = (Button) findViewById(R.id.btnBack);
        btnBack.setOnClickListener(this);
        inputScore = (EditText) findViewById(R.id.inputGrade1);
        textScore = (TextView) findViewById(R.id.textPrice);
        textGrade = (TextView) findViewById(R.id.textVat);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        int score = Integer.parseInt(inputScore.getText().toString());
        String grade = "";
        if (id == R.id.btnCalGpa) {
            if (score >= 80 && score <= 100) {
                grade = "A";
            } else if (score >= 75 && score <= 79) {
                grade = "B+";
            } else if (score >= 70 && score <= 74) {
                grade = "B";
            } else if (score >= 65 && score <= 69) {
                grade = "C+";
            } else if (score >= 60 && score <= 64) {
                grade = "C";
            } else if (score >= 55 && score <= 59) {
                grade = "D+";
            } else if (score >= 50 && score <= 54) {
                grade = "D";
            } else if (score >= 0 && score <= 49) {
                grade = "F";
            }

            textScore.setText(String.valueOf(score));
            textGrade.setText(grade);
        } else if (id == R.id.btnBack) {
            finish();
        }
    }
}