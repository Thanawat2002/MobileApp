package com.example.assign04_6406021621030;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class GalleryActivity extends AppCompatActivity implements View.OnClickListener{
    private ImageButton imageButton, imageButton2, imageButton3, imageButton4, imageButton5, imageButton6, imageButton7, imageButton8;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        List<String> image = new ArrayList<String>();
        Log.d("TAG", "Count: ");

        imageButton = (ImageButton) findViewById(R.id.imageButton1);
        imageButton.setOnClickListener(this);
        imageButton2 = (ImageButton) findViewById(R.id.imageButton2);
        imageButton2.setOnClickListener(this);
        imageButton3 = (ImageButton) findViewById(R.id.imageButton3);
        imageButton3.setOnClickListener(this);
        imageButton4 = (ImageButton) findViewById(R.id.imageButton4);
        imageButton4.setOnClickListener(this);
        imageButton5 = (ImageButton) findViewById(R.id.imageButton5);
        imageButton5.setOnClickListener(this);
        imageButton6 = (ImageButton) findViewById(R.id.imageButton6);
        imageButton6.setOnClickListener(this);
        imageButton7 = (ImageButton) findViewById(R.id.imageButton7);
        imageButton7.setOnClickListener(this);
        imageButton8 = (ImageButton) findViewById(R.id.imageButton8);
        imageButton8.setOnClickListener(this);

        imageView = (ImageView) findViewById(R.id.imageView15);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.imageButton1) {
            imageView.setImageResource(R.mipmap.black1_foreground);
        } else if (id == R.id.imageButton2) {
            imageView.setImageResource(R.mipmap.black2_foreground);
        } else if (id == R.id.imageButton3) {
            imageView.setImageResource(R.mipmap.black3_foreground);
        } else if (id == R.id.imageButton4) {
            imageView.setImageResource(R.mipmap.black4_foreground);
        } else if (id == R.id.imageButton5) {
            imageView.setImageResource(R.mipmap.black5_foreground);
        } else if (id == R.id.imageButton6) {
            imageView.setImageResource(R.mipmap.black6_foreground);
        } else if (id == R.id.imageButton7) {
            imageView.setImageResource(R.mipmap.black7_foreground);
        } else if (id == R.id.imageButton8) {
            imageView.setImageResource(R.mipmap.black8_foreground);
        }

    }
}