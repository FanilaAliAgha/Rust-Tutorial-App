package com.example.mainpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class attemptquiz extends AppCompatActivity {

    public com.google.android.material.textview.MaterialTextView ch1;
    public com.google.android.material.textview.MaterialTextView ch2;
    public com.google.android.material.textview.MaterialTextView ch3;
    public com.google.android.material.textview.MaterialTextView ch4;
    public com.google.android.material.textview.MaterialTextView ch5;
    public com.google.android.material.textview.MaterialTextView ch6;
    public com.google.android.material.textview.MaterialTextView ch7;
    public com.google.android.material.textview.MaterialTextView ch8;
    public com.google.android.material.textview.MaterialTextView ch9;
    public com.google.android.material.textview.MaterialTextView ch10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attemptquiz);
        ch1= findViewById(R.id.ch1);
        ch2= findViewById(R.id.ch2);
        ch3= findViewById(R.id.ch3);
        ch4= findViewById(R.id.ch4);
        ch5= findViewById(R.id.ch5);
        ch6= findViewById(R.id.ch6);
        ch7= findViewById(R.id.ch7);
        ch8= findViewById(R.id.ch8);
        ch9= findViewById(R.id.ch9);
        ch10= findViewById(R.id.ch10);




        ch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(attemptquiz.this,chpt1.class);
                startActivity(intent);


            }
        });

        ch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(attemptquiz.this,chpt2.class);
                startActivity(intent);


            }
        });
        ch3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(attemptquiz.this,chpt3.class);
                startActivity(intent);


            }
        });

        ch4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(attemptquiz.this,chpt4.class);
                startActivity(intent);


            }
        });



        ch5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(attemptquiz.this,chpt5.class);
                startActivity(intent);


            }
        });



        ch6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(attemptquiz.this,chpt6.class);
                startActivity(intent);


            }
        });

        ch7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(attemptquiz.this,chpt7.class);
                startActivity(intent);


            }
        });



        ch8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(attemptquiz.this,chpt8.class);
                startActivity(intent);


            }
        });


        ch9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(attemptquiz.this,chpt9.class);
                startActivity(intent);


            }
        });



        ch10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(attemptquiz.this,chpt10.class);
                startActivity(intent);


            }
        });


    }
}