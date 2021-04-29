package com.example.mainpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class chpt6 extends AppCompatActivity {


    public com.google.android.material.textview.MaterialTextView chap6;
    public com.google.android.material.textview.MaterialTextView C6Q1;
    public com.google.android.material.textview.MaterialTextView C6Q2;
    public com.google.android.material.textview.MaterialTextView C6Q3;
    public com.google.android.material.textview.MaterialTextView C6Q4;
    public com.google.android.material.textview.MaterialTextView C6Q5;
    public com.google.android.material.button.MaterialButton C6btn;
    public com.google.android.material.button.MaterialButton C6Fbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chpt6);

        chap6 = findViewById(R.id.chap6);
        C6Q1 = findViewById(R.id.C6Q1);
        C6Q2 = findViewById(R.id.C6Q2);
        C6Q3 = findViewById(R.id.C6Q3);
        C6Q4 = findViewById(R.id.C6Q4);
        C6Q5= findViewById(R.id.C6Q5);
        C6btn =findViewById(R.id.C6btn);
        C6Fbtn =findViewById(R.id.C6Fbtn);

        C6btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chpt6.this,chpt7.class);
                startActivity(intent);
            }
        });

        C6Fbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chpt6.this,attemptquiz.class);
                startActivity(intent);
            }
        });
    }
}