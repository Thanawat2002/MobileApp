package com.example.findminapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView labelShow;
    private EditText numText;
    private Button btnAdd, btnFindMin, btnClear;
    private ArrayList<Integer> numList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        labelShow = findViewById(R.id.lableShow);
        numText = findViewById(R.id.numText);
        btnAdd = findViewById(R.id.btnAdd);
        btnFindMin = findViewById(R.id.btnFindMin);
        btnClear = findViewById(R.id.btnClear);

        btnFindMin.setEnabled(false);
        btnClear.setEnabled(false);

        btnAdd.setOnClickListener(this);
        btnFindMin.setOnClickListener(this);
        btnClear.setOnClickListener(this);

        numList = new ArrayList<>();
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnAdd) {
            onAddButtonClick();
        } else if (v.getId() == R.id.btnFindMin) {
            onFindMinButtonClick();
        } else if (v.getId() == R.id.btnClear) {
            onClearButtonClick();
        }
    }

    private void onAddButtonClick() {
        int num = Integer.parseInt(numText.getText().toString());
        numList.add(num);

        labelShow.append("\n" + num);
        numText.setText("");
        btnFindMin.setEnabled(true);
        btnClear.setEnabled(true);

        if (numList.size() == 5) {
            btnAdd.setEnabled(false);
            Toast.makeText(this, "5 Number", Toast.LENGTH_LONG).show();
        }
    }

    private void onFindMinButtonClick() {
        int min = Collections.min(numList);
        Toast.makeText(this, "Value Min is : " + min, Toast.LENGTH_LONG).show();
    }

    private void onClearButtonClick() {
        numText.setText("");
        labelShow.setText("Find Number Add :");
        btnFindMin.setEnabled(false);
        btnClear.setEnabled(false);
        btnAdd.setEnabled(true);
        numList.clear();
    }
}
