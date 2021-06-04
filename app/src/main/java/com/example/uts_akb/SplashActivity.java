package com.example.uts_akb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
/*
Tanggal Pengerjaan  : 3 June 2021
Nim                 : 10118067
Nama                : Agus Awaludin
Kelas               : IF-2
 */
public class SplashActivity extends AppCompatActivity {

    Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, WalkthroughActivity.class);
                startActivity(intent);
                finish();
            }
        },3000);
    }
}