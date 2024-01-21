package com.example.midterm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btnGrade, btnTax, btnImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Mid 2/65");
        btnGrade = (Button) findViewById(R.id.btnGrade);
        btnGrade.setOnClickListener(this);
        btnTax = (Button) findViewById(R.id.btnTax);
        btnTax.setOnClickListener(this);
        btnImage = (Button) findViewById(R.id.btnImage);
        btnImage.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnGrade) {
            Intent CalculateGrade = new Intent(this, CalculateGrade.class);
            startActivity(CalculateGrade);
        } else if (v.getId() == R.id.btnTax) {
            Intent CalculateTax = new Intent(this, CalculateTax.class);
            startActivity(CalculateTax);
        } else if (v.getId() == R.id.btnImage) {
            
        }
    }
}