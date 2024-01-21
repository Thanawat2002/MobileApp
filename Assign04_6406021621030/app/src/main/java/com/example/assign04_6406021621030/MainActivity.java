package com.example.assign04_6406021621030;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnGrade, btnVat, btnGpa, btnGallery, btnExit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGrade = (Button) findViewById(R.id.btnGrade);
        btnGrade.setOnClickListener(this);
        btnVat = (Button) findViewById(R.id.btnVat);
        btnVat.setOnClickListener(this);
        btnGpa = (Button) findViewById(R.id.btnGpa);
        btnGpa.setOnClickListener(this);
        btnGallery = (Button) findViewById(R.id.btnGallery);
        btnGallery.setOnClickListener(this);
        btnExit = (Button) findViewById(R.id.btnExit);
        btnExit.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.btnGrade) {
            Intent GradeActivity = new Intent(this, GradeActivity.class);
            startActivity(GradeActivity);
        } else if (id == R.id.btnVat) {
            Intent VatActivity = new Intent(this, VatActivity.class);
            startActivity(VatActivity);
        } else if (id == R.id.btnGpa) {
            Intent GpaActivity = new Intent(this, GpaActivity.class);
            startActivity(GpaActivity);
        } else if (id == R.id.btnGallery) {
            Intent GalleryActivity = new Intent(this, GalleryActivity.class);
            startActivity(GalleryActivity);
        } else if (id == R.id.btnExit) {
            finishAffinity();
        }
    }
}