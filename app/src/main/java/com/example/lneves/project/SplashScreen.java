package com.example.lneves.project;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                showGeneral();
            }


        },4000);
    }
    private void showGeneral() {
        Intent intent = new Intent (SplashScreen.this, GeneralActivity.class);
        startActivity(intent);
        finish();
    }

}
