package com.example.mylg2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView image;
    RadioGroup radioGroup;
    RadioButton rdFirst, rdSecond, rdThird, radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        image = findViewById(R.id.imageView);
        radioGroup = findViewById(R.id.rdbtngrp);
        rdFirst = findViewById(R.id.rdFirst);
        rdSecond = findViewById(R.id.rdSecond);
        rdThird = findViewById(R.id.rdThird);
    }

    public void checkedRadio(View view)
    {
        int radioId = radioGroup.getCheckedRadioButtonId();
        radioButton = findViewById(radioId);

        if (radioButton == rdFirst)
            image.setImageResource(R.drawable.swim);
           else if (radioButton == rdSecond)
            image.setImageResource(R.drawable.zumba);
        else
            image.setImageResource(R.drawable.pilates);

        Toast.makeText(this, radioButton.getText(), Toast.LENGTH_SHORT).show();

    }


}