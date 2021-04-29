package com.example.mainpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class chpt4 extends AppCompatActivity {


    public com.google.android.material.textview.MaterialTextView chap4;
    public com.google.android.material.textview.MaterialTextView C4Q1;
    public com.google.android.material.textview.MaterialTextView C4Q2;
    public com.google.android.material.textview.MaterialTextView C4Q3;
    public com.google.android.material.textview.MaterialTextView C4Q4;
    public com.google.android.material.textview.MaterialTextView C4Q5;
    public com.google.android.material.button.MaterialButton C4btn;
    public com.google.android.material.button.MaterialButton C4Fbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chpt4);

        chap4 = findViewById(R.id.chap4);
        C4Q5 = findViewById(R.id.C4Q5);
        C4Q4 = findViewById(R.id.C4Q4);
        C4Q3 = findViewById(R.id.C4Q3);
        C4Q2 = findViewById(R.id.C4Q2);
        C4Q1 = findViewById(R.id.C4Q1);
        C4btn = findViewById(R.id.C4btn);
        C4Fbtn = findViewById(R.id.C4Fbtn);

        C4btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent (chpt4.this,chpt5.class);
                startActivity(intent);
            }
        });

        C4Fbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(chpt4.this,attemptquiz.class);
                startActivity(intent);


            }
        });

    }
}