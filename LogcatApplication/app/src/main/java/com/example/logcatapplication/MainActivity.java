package com.example.logcatapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private final String TAG = "MY_APP";
    private int data = 10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnError = findViewById(R.id.btnError);
        btnError.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Show logcat Error", Toast.LENGTH_SHORT).show();
                Log.e(TAG, "Test Log.e data = " + data);
            }
        });

        Button btnWarning = findViewById(R.id.btnWarning);
        btnWarning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Show logcat Warning", Toast.LENGTH_SHORT).show();
                Log.w(TAG, "Test Log.w data = " + data);
            }
        });

        Button btnInfo= findViewById(R.id.btnInfo);
        btnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Show logcat Information", Toast.LENGTH_SHORT).show();
                Log.i(TAG, "Test Log.i data = " + data);
            }
        });

        Button btnDebug= findViewById(R.id.btnDebug);
        btnDebug.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Show logcat Debug", Toast.LENGTH_SHORT).show();
                Log.d(TAG, "Test Log.d data = " + data);
            }
        });

        Button btnVarbose= findViewById(R.id.btnVarbose);
        btnVarbose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Show logcat Varbose", Toast.LENGTH_SHORT).show();
                Log.v(TAG, "Test Log.v data = " + data);
            }
        });
    }
}