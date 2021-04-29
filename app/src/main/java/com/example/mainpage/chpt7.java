package com.example.mainpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class chpt7 extends AppCompatActivity {

    public com.google.android.material.textview.MaterialTextView chap7;
    public com.google.android.material.textview.MaterialTextView C7Q1;
    public com.google.android.material.textview.MaterialTextView C7Q2;
    public com.google.android.material.textview.MaterialTextView C7Q3;
    public com.google.android.material.textview.MaterialTextView C7Q4;
    public com.google.android.material.textview.MaterialTextView C7Q5;
    public com.google.android.material.textview.MaterialTextView C7Q6;
    public com.google.android.material.textview.MaterialTextView C7Q7;
    public com.google.android.material.textview.MaterialTextView C7Q8;
    public com.google.android.material.textview.MaterialTextView C7Q9;
    public com.google.android.material.textview.MaterialTextView C7Q10;
    public com.google.android.material.button.MaterialButton C7btn;
    public com.google.android.material.button.MaterialButton C7Fbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chpt7);


        chap7 = findViewById(R.id.chap7);
        C7Q1 = findViewById(R.id.C7Q1);
        C7Q2 = findViewById(R.id.C7Q2);
        C7Q3 = findViewById(R.id.C7Q3);
        C7Q4 = findViewById(R.id.C7Q4);
        C7Q5= findViewById(R.id.C7Q5);
        C7Q6= findViewById(R.id.C7Q6);
        C7Q7= findViewById(R.id.C7Q7);
        C7Q8= findViewById(R.id.C7Q8);
        C7Q9= findViewById(R.id.C7Q9);
        C7Q10= findViewById(R.id.C7Q10);
        C7btn =findViewById(R.id.C7btn);
        C7btn =findViewById(R.id.C7btn);

        C7btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chpt7.this,chpt8.class);
                startActivity(intent);
            }
        });



        C7Fbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chpt7.this,attemptquiz.class);
                startActivity(intent);
            }
        });
    }
}