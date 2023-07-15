package com.example.latihan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class HomeActivity extends AppCompatActivity {
    Button linear, relative, login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

      linear = findViewById(R.id.btnLinear);
      relative = findViewById(R.id.btnRelative);
      login = findViewById(R.id.btnLogin);


        linear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent linearlayout = new Intent(HomeActivity.this, MainActivity.class);
                startActivity(linearlayout);
            }
        });

        relative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent relativelayout = new Intent(HomeActivity.this, RegisterActivity.class);
                startActivity(relativelayout);
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent login = new Intent(HomeActivity.this, LoginActivity.class);
                startActivity(login);
            }
        });
    }
}