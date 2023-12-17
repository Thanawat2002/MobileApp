package com.example.assign01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    protected int Sum(int n1, int n2) {
        return Integer.sum(n1, n2);
    }
    protected int Min(int n1, int n2) {
        return Integer.min(n1, n2);
    }
    protected int Max(int n1, int n2) {
        return Integer.max(n1, n2);
    }
    private Button btnCal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCal = (Button) findViewById(R.id.btnCal);

        btnCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText Number_01 = (EditText) findViewById(R.id.inputNumber1);
                EditText Number_02 = (EditText) findViewById(R.id.inputNumber2);
                TextView textView10 = (TextView) findViewById(R.id.textView10);
                TextView textView11 = (TextView) findViewById(R.id.textView11);
                TextView textView12 = (TextView) findViewById(R.id.textView12);

                try {
                    int number1 = Integer.parseInt(Number_01.getText().toString());
                    int number2 = Integer.parseInt(Number_02.getText().toString());
                    textView10.setText(Integer.toString(Sum(number1, number2)));
                    textView11.setText(Integer.toString(Min(number1, number2)));
                    textView12.setText(Integer.toString(Max(number1, number2)));
                } catch (Exception e) {
                    Toast.makeText(MainActivity.this, "Please fill it in", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}