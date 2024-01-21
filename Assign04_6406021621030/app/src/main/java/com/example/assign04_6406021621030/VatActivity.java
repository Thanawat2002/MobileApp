package com.example.assign04_6406021621030;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class VatActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText inputPrice;
    private Button btnCalVat, btnBack;
    private TextView textPrice, textVat, textTotal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vat);

        btnCalVat = (Button) findViewById(R.id.btnCalGpa);
        btnCalVat.setOnClickListener(this);
        btnBack = (Button) findViewById(R.id.btnBack);
        btnBack.setOnClickListener(this);
        
        inputPrice = (EditText) findViewById(R.id.inputGrade1);
        textPrice = (TextView) findViewById(R.id.textPrice);
        textVat = (TextView) findViewById(R.id.textVat);
        textTotal = (TextView) findViewById(R.id.textTotal);
    }

    @Override
    public void onClick(View v) {
        try {
            int id = v.getId();
            double price = Float.parseFloat(inputPrice.getText().toString()), vat, total;
            DecimalFormat df = new DecimalFormat("###,###,###.00");
            if (id == R.id.btnCalGpa) {
                textPrice.setText(df.format(price));
                vat = (price * 0.07);
                textVat.setText(df.format(vat));
                total = (price + vat);
                textTotal.setText(df.format(total));
            } else if (id == R.id.btnBack) {
                finish();
            }
        } catch (Exception e) {
            Toast.makeText(this, "กรอกข้อความ", Toast.LENGTH_SHORT).show();
        }
    }
}