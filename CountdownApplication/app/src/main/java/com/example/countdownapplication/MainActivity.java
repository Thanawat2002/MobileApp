package com.example.countdownapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnUp = (Button) findViewById(R.id.btnUp);
        btnUp.setOnClickListener(this);
        Button btnDown = (Button) findViewById(R.id.btnDown);
        btnDown.setOnClickListener(this);
        Button btnClear = (Button) findViewById(R.id.btnClear);
        btnClear.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        TextView numberText = (TextView) findViewById(R.id.numberText);
        if (v.getId() == R.id.btnUp) {
            numberText.setText(Integer.toString(++count));
            Log.d("TAG", "Number is :" + count);
            if ((count % 5) == 0) {
                Toast.makeText(this, "Five is divisible", Toast.LENGTH_SHORT).show();
            }
        } else if (v.getId() == R.id.btnDown) {
            numberText.setText(Integer.toString(--count));
            Log.d("TAG", "Number is :" + count);
            if ((count % 5) == 0) {
                Toast.makeText(this, "Five is divisible", Toast.LENGTH_SHORT).show();
            }
        }
        else if (v.getId() == R.id.btnClear) {
            count = 0;
            numberText.setText(Integer.toString(count));
            Toast.makeText(this, "Reset Value", Toast.LENGTH_SHORT).show();
        }
    }
}