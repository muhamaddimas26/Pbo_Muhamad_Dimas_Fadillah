package com.example.latihan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class RelativeActivity extends AppCompatActivity {
    Spinner data;
    Button okay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative);
        data = (Spinner) findViewById(R.id.provinsi);
        okay = (Button) findViewById(R.id.tombol);
        okay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RelativeActivity.this,
                        "Pilihan Anda Adalah "+ data.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}