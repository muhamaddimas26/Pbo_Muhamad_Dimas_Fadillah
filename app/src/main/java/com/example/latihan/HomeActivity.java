package com.example.latihan;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {


    Button btntampilkan;
    EditText nama, alamat;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btntampilkan = findViewById(R.id.btntampilkan);
        nama = findViewById(R.id.edtnama);
        alamat = findViewById(R.id.edtalamat);
        hasil = findViewById(R.id.txthasil);

        btntampilkan.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasil.setText("Hello Nama Saya " + nama.getText().toString()
                        + " dan Alamat Saya di " + alamat.getText().toString());
            }
        });
    }
}