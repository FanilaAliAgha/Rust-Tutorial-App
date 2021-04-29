package com.example.mainpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class chpt1 extends AppCompatActivity {

    public com.google.android.material.button.MaterialButton C1btn;
    public com.google.android.material.button.MaterialButton C1Fbtn;
    public com.google.android.material.textview.MaterialTextView chap1;
    public com.google.android.material.textview.MaterialTextView C1Q1;
    public com.google.android.material.textview.MaterialTextView C1Q2;
    public com.google.android.material.textview.MaterialTextView C1Q3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chpt1);


        //Casting
        chap1 = findViewById(R.id.chap1);
        C1Q3 = findViewById(R.id.C1Q3);
        C1Q1 = findViewById(R.id.C1Q1);
        C1Q2 = findViewById(R.id.C1Q2);
        C1btn = findViewById(R.id.C1btn);
        C1Fbtn = findViewById(R.id.C1Fbtn);

        C1btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(chpt1.this,chpt2.class);
                startActivity(intent);


            }
        });


        C1Fbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(chpt1.this,attemptquiz.class);
                startActivity(intent);


            }
        });


    }
}