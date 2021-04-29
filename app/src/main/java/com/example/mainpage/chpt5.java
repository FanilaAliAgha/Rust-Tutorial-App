package com.example.mainpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class chpt5 extends AppCompatActivity {


    public com.google.android.material.textview.MaterialTextView chap5;
    public com.google.android.material.textview.MaterialTextView C5Q1;
    public com.google.android.material.textview.MaterialTextView C5Q2;
    public com.google.android.material.textview.MaterialTextView C5Q3;
    public com.google.android.material.textview.MaterialTextView C5Q4;
    public com.google.android.material.textview.MaterialTextView C5Q5;
    public com.google.android.material.button.MaterialButton C5btn;
    public com.google.android.material.button.MaterialButton C5Fbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chpt5);


        chap5 = findViewById(R.id.chap5);
        C5Q5 = findViewById(R.id.C5Q5);
        C5Q4 = findViewById(R.id.C5Q4);
        C5Q3 = findViewById(R.id.C5Q3);
        C5Q2 = findViewById(R.id.C5Q2);
        C5Q1 = findViewById(R.id.C5Q1);
        C5btn = findViewById(R.id.C5btn);
        C5Fbtn = findViewById(R.id.C5Fbtn);



        C5btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chpt5.this,chpt6.class);
                startActivity(intent);
            }
        });


        C5Fbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(chpt5.this,attemptquiz.class);
                startActivity(intent);


            }
        });
    }
}