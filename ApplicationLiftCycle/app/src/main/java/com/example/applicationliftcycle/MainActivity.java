package com.example.applicationliftcycle;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView text1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = (TextView) findViewById(R.id.text1); // Create Object
        text1.append("\nOnCreate");
        Toast.makeText(this, "OnCrete", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        text1.append("\nOnStart");
        Toast.makeText(this, "OnStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        text1.append("\nOnResume");
        Toast.makeText(this, "OnResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected  void onRestart() {
        super.onRestart();
        text1.append("\nOnRestart");
        Toast.makeText(this, "OnRestart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected  void onPause() {
        super.onPause();
        text1.append("\nOnPause");
        Toast.makeText(this, "OnPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected  void onStop() {
        super.onStop();
        text1.append("\nOnStop");
        Toast.makeText(this, "OnStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected  void onDestroy() {
        super.onDestroy();
        text1.append("\nOnDestroy");
        Toast.makeText(this, "OnDestroy", Toast.LENGTH_SHORT).show();
    }
}