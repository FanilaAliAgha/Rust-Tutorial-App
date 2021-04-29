package com.example.mainpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class chpt8 extends AppCompatActivity {
    public com.google.android.material.textview.MaterialTextView chap8;
    public com.google.android.material.textview.MaterialTextView C8Q1;
    public com.google.android.material.textview.MaterialTextView C8Q2;
    public com.google.android.material.textview.MaterialTextView C8Q3;
    public com.google.android.material.textview.MaterialTextView C8Q4;
    public com.google.android.material.textview.MaterialTextView C8Q5;
    public com.google.android.material.textview.MaterialTextView C8Q6;
    public com.google.android.material.textview.MaterialTextView C8Q7;
    public com.google.android.material.textview.MaterialTextView C8Q8;
    public com.google.android.material.textview.MaterialTextView C8Q9;
    public com.google.android.material.textview.MaterialTextView C8Q10;
    public com.google.android.material.button.MaterialButton C8btn;
    public com.google.android.material.button.MaterialButton C8Fbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chpt8);


        chap8 = findViewById(R.id.chap8);
        C8Q1 = findViewById(R.id.C8Q1);
        C8Q2 = findViewById(R.id.C8Q2);
        C8Q3 = findViewById(R.id.C7Q3);
        C8Q4 = findViewById(R.id.C8Q4);
        C8Q5= findViewById(R.id.C8Q5);
        C8Q6= findViewById(R.id.C8Q6);
        C8Q7= findViewById(R.id.C8Q7);
        C8Q8= findViewById(R.id.C8Q8);
        C8Q9= findViewById(R.id.C8Q9);
        C8Q10= findViewById(R.id.C8Q10);
        C8btn =findViewById(R.id.C7btn);
        C8btn =findViewById(R.id.C7Fbtn);

        C8btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chpt8.this,chpt9.class);
                startActivity(intent);
            }
        });



        C8Fbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chpt8.this,attemptquiz.class);
                startActivity(intent);
            }
        });
    }
}