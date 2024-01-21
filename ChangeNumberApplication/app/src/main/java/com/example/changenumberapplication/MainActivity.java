package com.example.changenumberapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText decText;
    private Button btnCal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        decText = (EditText) findViewById(R.id.decText);
        btnCal = (Button) findViewById(R.id.btnCal);
        btnCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String TextDec = decText.getText().toString();
                if (TextDec.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Data not correct", Toast.LENGTH_SHORT).show();
                } else {
                    int dec;
                    dec = Integer.parseInt(TextDec);
                    String binText = "";
                    binText = decToBin(dec);
                    Toast.makeText(MainActivity.this, "Binary : " + binText, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private String decToBin(int dec) {
        return (Integer.toBinaryString(dec));
    }
}