package com.example.easytutonotes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.*;
import android.content.Intent;


public class splashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(splashScreen.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        }, 3000);
    }

}
