package com.example.mainpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class chpt3 extends AppCompatActivity {

    public com.google.android.material.textview.MaterialTextView chap3;
    public com.google.android.material.textview.MaterialTextView C3Q1;
    public com.google.android.material.textview.MaterialTextView C3Q2;
    public com.google.android.material.textview.MaterialTextView C3Q3;
    public com.google.android.material.textview.MaterialTextView C3Q4;
    public com.google.android.material.textview.MaterialTextView C3Q5;
    public com.google.android.material.button.MaterialButton C3btn;
    public com.google.android.material.button.MaterialButton C3Fbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chpt3);

        //casting
        chap3 = findViewById(R.id.chap3);
        C3Q5 = findViewById(R.id.C3Q5);
        C3Q4 = findViewById(R.id.C3Q4);
        C3Q3 = findViewById(R.id.C3Q3);
        C3Q2 = findViewById(R.id.C3Q2);
        C3Q1 = findViewById(R.id.C3Q1);
        C3btn = findViewById(R.id.C3btn);
        C3Fbtn = findViewById(R.id.C3Fbtn);


       C3btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
          Intent intent = new Intent(chpt3.this,chpt4.class);
               startActivity(intent);
            }
       });


        C3Fbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(chpt3.this,attemptquiz.class);
                startActivity(intent);


            }
        });




    }
}