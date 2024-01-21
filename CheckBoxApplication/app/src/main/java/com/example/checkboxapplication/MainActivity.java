package com.example.checkboxapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private CheckBox appleCheckBox, bananaCheckBox, grapeCheckBox, orangeCheckBox;
    private Button btnSubmit;
    private TextView show;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        appleCheckBox = (CheckBox) findViewById(R.id.appleCheckBox);
        bananaCheckBox = (CheckBox) findViewById(R.id.bananaCheckBox);
        grapeCheckBox = (CheckBox) findViewById(R.id.grapeCheckBox);
        orangeCheckBox = (CheckBox) findViewById(R.id.orangeCheckBox);
        show = (TextView) findViewById(R.id.show);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String message = "";
        if (appleCheckBox.isChecked()) message += "Selected Apple\n";
        else message += "No selected CheckBox 1\n";
        if (bananaCheckBox.isChecked()) message += "Selected Apple\n";
        else message += "No selected CheckBox 2\n";
        if (grapeCheckBox.isChecked()) message += "Selected Grape\n";
        else message += "No selected CheckBox 3\n";
        if (orangeCheckBox.isChecked()) message += "Selected Orange\n";
        else message += "No selected CheckBox 4\n";
        show.setText(message);
    }
}