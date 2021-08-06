package com.example.sqllitesample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText nameET,classET,rollET;
    Button insertBT,updateBT,deleteBT,displayBT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameET = findViewById(R.id.nameET);
        rollET = findViewById(R.id.rollET);
        classET = findViewById(R.id.classET);

        insertBT = findViewById(R.id.insertBT);
        updateBT = findViewById(R.id.updateBT);
        displayBT = findViewById(R.id.displayBT);
        deleteBT = findViewById(R.id.deleteBT);

        insertBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        deleteBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        updateBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        displayBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }
}