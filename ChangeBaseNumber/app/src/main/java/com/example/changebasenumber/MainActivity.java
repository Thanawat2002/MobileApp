package com.example.changebasenumber;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText numText;
    private TextView decText, binText, octText, hexaText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Exercise 4_1 S6406021621030");
    }

    public void OnClick_btnChange(View v) {
        numText = (EditText) findViewById(R.id.numText);
        decText = (TextView) findViewById(R.id.decText);
        binText = (TextView) findViewById(R.id.binText);
        octText = (TextView) findViewById(R.id.octText);
        hexaText = (TextView) findViewById(R.id.hexaText);

        String inputText = numText.getText().toString();
        if (inputText.isEmpty()) {
            Toast.makeText(this, "Value is empty" + numText.getText(), Toast.LENGTH_LONG).show();
        } else {
            decText.setText(numText.getText());
            binText.setText(Integer.toBinaryString(Integer.parseInt(inputText)));
            octText.setText(Integer.toOctalString(Integer.parseInt(inputText)));
            hexaText.setText(Integer.toHexString(Integer.parseInt(inputText)));
        }

    }
}