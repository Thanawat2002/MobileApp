package com.example.assign04_6406021621030;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class GpaActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText inputGrade1, inputGrade2, inputGrade3, inputGrade4;
    private Button btnCalGpa, btnBack;
    private TextView textPoints, textCredit, textGpa;
    private String[] gpaArray;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gpa);

        btnCalGpa = (Button) findViewById(R.id.btnCalGpa);
        btnCalGpa.setOnClickListener(this);
        btnBack = (Button) findViewById(R.id.btnBack);
        btnBack.setOnClickListener(this);

        inputGrade1 = (EditText) findViewById(R.id.inputGrade1);
        inputGrade2 = (EditText) findViewById(R.id.inputGrade2);
        inputGrade3 = (EditText) findViewById(R.id.inputGrade3);
        inputGrade4 = (EditText) findViewById(R.id.inputGrade4);
        textPoints = (TextView) findViewById(R.id.textPoints);
        textCredit = (TextView) findViewById(R.id.textCredit);
        textGpa = (TextView) findViewById(R.id.textGpa);
    }

    @Override
    public void onClick(View v) {
        gpaArray = new String[]{inputGrade1.getText().toString(), inputGrade2.getText().toString(), inputGrade3.getText().toString(), inputGrade4.getText().toString()};
        float points = 0, credits, gpa;
        int id = v.getId();
        DecimalFormat df = new DecimalFormat("###,###,###.00");
        if (id == R.id.btnCalGpa) {
            for (int i = 0; i < gpaArray.length; i++) {
                if (gpaArray[i].equals("A")) {
                    points += 4.0;
                } else if (gpaArray[i].equals("B+")) {
                    points += 3.5;
                } else if (gpaArray[i].equals("B")) {
                    points += 3.0;
                } else if (gpaArray[i].equals("C+")) {
                    points += 2.5;
                } else if (gpaArray[i].equals("C")) {
                    points += 2.0;
                } else if (gpaArray[i].equals("D+")) {
                    points += 1.5;
                } else if (gpaArray[i].equals("D")) {
                    points += 1.0;
                } else if (gpaArray[i].equals("F")) {
                    points += 0;
                }
            }
            textPoints.setText(df.format(points * 3));
            textCredit.setText(df.format(gpaArray.length * 3));
            textGpa.setText(df.format((points * 3)/(gpaArray.length * 3)));
        } else if (id == R.id.btnBack) {
            finish();
        }
    }
}