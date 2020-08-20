package com.example.uds_app.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.uds_app.R;

import util.Constantes;

public class SplashActivity extends AppCompatActivity {

    private SplashActivity splashActivity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        splashActivity = this;
        startTime();
    }

    private void startTime(){

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(splashActivity, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        }, Constantes.SPLASH_TIME_OUT);
    }
}