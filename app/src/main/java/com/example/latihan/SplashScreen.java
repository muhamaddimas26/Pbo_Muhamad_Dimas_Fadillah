package com.example.latihan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.StrictMode;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import com.example.latihan.MainActivity;

public class SplashScreen extends AppCompatActivity { TextView linkk;
    private final int welcomeScreenDisplay = 10000; // 10 detik
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        if (Build.VERSION.SDK_INT > 9) {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
        }

        Thread welcomeThread = new Thread() {
            int wait = 0;

            @Override
            public void run() {
                try {
                    super.run();
                    while (wait < welcomeScreenDisplay) {
                        sleep(1000);
                        wait += 1000;
                    }
                } catch (Exception e) {
                    System.out.println(e);
                } finally {
                    Intent iyapindah = new Intent(SplashScreen.this, MainActivity.class);
                    startActivity(iyapindah);
                    finish();
                }
            }
        };
        welcomeThread.start();
    }
}