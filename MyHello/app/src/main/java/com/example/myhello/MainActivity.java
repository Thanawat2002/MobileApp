package com.example.myhello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // วาดหน้าจอ

        Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { // เป็นการเขียนแบบ inner class
                EditText name = (EditText) findViewById(R.id.editTextText);
                TextView textview = (TextView) findViewById(R.id.textView);
                textview.setText("Hi " + name.getText() + "'s");
                Toast.makeText(MainActivity.this, "Hello " + name.getText() + "'s",
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}