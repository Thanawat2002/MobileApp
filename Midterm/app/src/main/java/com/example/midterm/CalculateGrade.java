package com.example.midterm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class CalculateGrade extends AppCompatActivity implements View.OnClickListener {
    private Button btnCalGrade, btnBack;
    private EditText inputGrade1, inputGrade2, inputGrade3, inputGrade4, inputGrade5;
    private TextView textResult;
    private String[] newArray;
    final String message = "Result :";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate_grade);

        btnBack = (Button) findViewById(R.id.btnBack);
        btnBack.setOnClickListener(this);
        btnCalGrade = (Button) findViewById(R.id.btnCalGrade);
        btnCalGrade.setOnClickListener(this);

        textResult = (TextView) findViewById(R.id.textResult);
        inputGrade1 = (EditText) findViewById(R.id.inputGrade1);
        inputGrade2 = (EditText) findViewById(R.id.inputGrade2);
        inputGrade3 = (EditText) findViewById(R.id.inputGrade3);
        inputGrade4 = (EditText) findViewById(R.id.inputGrade4);
        inputGrade5 = (EditText) findViewById(R.id.inputGrade5);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.btnCalGrade) {
            calculateGrade(textResult, inputGrade1.getText().toString(), inputGrade2.getText().toString(), inputGrade3.getText().toString(), inputGrade4.getText().toString(), inputGrade5.getText().toString());
        } else if (id == R.id.btnBack) {
            finish();
        }
    }

    public void calculateGrade(TextView textResult, String grade1,String grade2,String grade3, String grade4, String grade5) {
        newArray = new String[]{grade1, grade2, grade3, grade4, grade5};
        float credit = 0, score = 0;
        String grade = "";

        for (int i = 0; i < newArray.length; i++) {
            grade += newArray[i] + ", ";
            if (newArray[i].equals("A")) {
                score += 4;
            } else if (newArray[i].equals("B")) {
                score += 3;
            } else if (newArray[i].equals("C")) {
                score += 2;
            } else if (newArray[i].equals("D")) {
                score += 1;
            } else if (newArray[i].equals("F")) {
                score += 0;
            }
        }
        credit = newArray.length * 3;
        textResult.setText(message + "\nจำนวนวิชา : " + newArray.length + "\nเกรด : " + grade + "\nจำนวนหน่อยกิต : " + credit
            + "\nจำนวนคะแนนที่ได้ : " + (score * 3) + "\nเกรดเฉลี่ยที่ได้ : " + (score * 3)/credit
        );


    }
}