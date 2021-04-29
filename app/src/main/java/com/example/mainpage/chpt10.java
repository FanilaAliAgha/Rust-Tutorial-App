package com.example.mainpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class chpt10 extends AppCompatActivity {

    public com.google.android.material.textview.MaterialTextView chap10;
    public com.google.android.material.textview.MaterialTextView C10Q1;
    public com.google.android.material.textview.MaterialTextView C10Q2;
    public com.google.android.material.textview.MaterialTextView C10Q3;
    public com.google.android.material.textview.MaterialTextView C10Q4;
    public com.google.android.material.textview.MaterialTextView C10Q5;
    public com.google.android.material.textview.MaterialTextView C10Q6;
    public com.google.android.material.textview.MaterialTextView C10Q7;
    public com.google.android.material.button.MaterialButton C10Fbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chpt10);


        chap10 = findViewById(R.id.chap10);
        C10Q1 = findViewById(R.id.C10Q1);
        C10Q2 = findViewById(R.id.C10Q2);
        C10Q3 = findViewById(R.id.C10Q3);
        C10Q4 = findViewById(R.id.C10Q4);
        C10Q5= findViewById(R.id.C10Q5);
        C10Q6= findViewById(R.id.C10Q6);
        C10Q7= findViewById(R.id.C10Q7);
        C10Fbtn =findViewById(R.id.C10Fbtn);


        C10Fbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chpt10.this,attemptquiz.class);
                startActivity(intent);
            }
        });
    }
}