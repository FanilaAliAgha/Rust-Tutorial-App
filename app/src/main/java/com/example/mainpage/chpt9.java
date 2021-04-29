package com.example.mainpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class chpt9 extends AppCompatActivity {

    public com.google.android.material.textview.MaterialTextView chap9;
    public com.google.android.material.textview.MaterialTextView C9Q1;
    public com.google.android.material.textview.MaterialTextView C9Q2;
    public com.google.android.material.textview.MaterialTextView C9Q3;
    public com.google.android.material.textview.MaterialTextView C9Q4;
    public com.google.android.material.textview.MaterialTextView C9Q5;
    public com.google.android.material.textview.MaterialTextView C9Q6;
    public com.google.android.material.textview.MaterialTextView C9Q7;
    public com.google.android.material.button.MaterialButton C9Fbtn;
    public com.google.android.material.button.MaterialButton C9btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chpt9);


        chap9 = findViewById(R.id.chap9);
        C9Q1 = findViewById(R.id.C9Q1);
        C9Q2 = findViewById(R.id.C9Q2);
        C9Q3 = findViewById(R.id.C9Q3);
        C9Q4 = findViewById(R.id.C9Q4);
        C9Q5= findViewById(R.id.C9Q5);
        C9Q6= findViewById(R.id.C9Q6);
        C9Q7= findViewById(R.id.C9Q7);
        C9Fbtn =findViewById(R.id.C9Fbtn);
        C9btn =findViewById(R.id.C9btn);



        C9btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chpt9.this,chpt10.class);
                startActivity(intent);
            }
        });
        C9Fbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chpt9.this,attemptquiz.class);
                startActivity(intent);
            }
        });
    }
}