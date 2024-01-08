package com.example.eventmanagementapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // แบบที่ 1 ใช้การ inner Class
        Button btnType1 = (Button) findViewById(R.id.btnType1);
        btnType1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Event Type 1 : Use Inner Class", Toast.LENGTH_SHORT).show();
            }
        });
        // แบบที่ 3 ใช้การ implement
        Button btnType3 = (Button) findViewById(R.id.btnType3);
        btnType3.setOnClickListener(this);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
    }
    // event type 2 ใช้การ attribute onClick
    public void buttonClick2(View v) {
        Toast.makeText(this, "Event Type 2 : Use attribute onClick", Toast.LENGTH_SHORT).show();
    }

    // event type 3 ใช้การ implement
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnType3) {
            Toast.makeText(this, "Event Type 3 : Use Implement", Toast.LENGTH_SHORT).show();
        }else if (v.getId() == R.id.button){
            Toast.makeText(this, "Event Type 4 : Use Implement", Toast.LENGTH_SHORT).show();
        }
    }
}