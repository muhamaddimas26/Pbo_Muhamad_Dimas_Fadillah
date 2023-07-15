package com.example.latihan;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ListView;

public class ListViewActivity extends AppCompatActivity {

  ListView  lvResult;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        lvResult = findViewById(R.id.lvResult);

        String[][] dataNegara = new String[][]{{"Indonesia","ASIA","indonesia"},
                {"Malaysia","ASIA","malaysia"},{"Singapore","ASIA","singapore"},
                {"Italia","EROPA","italia"},{"Inggris","EROPA","inggris"},
                {"Belanda","EROPA","belanda"},{"Argentina","AMERIKA","argentina"},
                {"Chile","AMERIKA","chile"},{"Mesir","AFRIKA","mesir"},
                {"Uganda","AFRIKA","uganda"}};

        NegaraAdapter adapter = new NegaraAdapter(ListViewActivity.this, dataNegara);
        lvResult.setAdapter(adapter);






    }
}