package com.example.basicloginapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btnLogin, btnClear;
    private EditText usernameText, passwordText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameText = (EditText) findViewById(R.id.usernameText);
        passwordText = (EditText) findViewById(R.id.passwordText);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnClear = (Button) findViewById(R.id.btnClear);
        btnLogin.setOnClickListener(this);
        btnClear.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.btnLogin) {
            String message = "";
            message = "Username : " + usernameText.getText().toString();
            message += "\nPassword : " + passwordText.getText().toString();
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        } else if (id == R.id.btnClear) {
            usernameText.setText("");
            passwordText.setText("");
        }
//        switch (id) {
//            case R.id.btnLogin:
//                break;
//            case R.id.btnClear:
//                break;
//        }
    }
}