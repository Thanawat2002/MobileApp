package com.example.registerapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    private TextInputEditText userName, passWord;
    private Button btnReg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userName = (TextInputEditText) findViewById(R.id.userName);
        passWord = (TextInputEditText) findViewById(R.id.passWord);
        btnReg = (Button) findViewById(R.id.btnReg);
        btnReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Register();
            }
        });
    }

    public void Register() {
        String userStr = userName.getText().toString().trim();
        String passStr = passWord.getText().toString().trim();
        if (CheckUserName(userStr) && CheckPassWord(passStr)) {
            Toast.makeText(this, "You have been Register!", Toast.LENGTH_SHORT).show();
        }
    }

    private boolean CheckUserName(String name) {
        if (TextUtils.isEmpty(name)) {
            userName.setError("Please Enter a username");
            return false;
        }
        return true;
    }

    private boolean CheckPassWord(String pass) {
        if (TextUtils.isEmpty(pass)) {
            passWord.setError("Please Enter a password");
            return false;
        } else if (pass.length() < 6) {
            passWord.setError("Password Should be grater then 5 character");
            return false;
        }
        return true;
    }

}