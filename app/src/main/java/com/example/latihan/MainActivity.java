package com.example.latihan;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button tampilkan;
    EditText nama, alamat;
    TextView hasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tampilkan = findViewById(R.id.btntampilkan);
        nama = findViewById(R.id.edtnama);
        alamat = findViewById(R.id.edtalamat);
        hasil = findViewById(R.id.txthasil);

        tampilkan.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasil.setText("Hello Nama Saya " + nama.getText().toString()
                            + " dan alamat Saya di " + alamat.getText().toString());
            }
        });




    }
}