package com.example.mainpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class chpt2 extends AppCompatActivity {

    public com.google.android.material.textview.MaterialTextView chap2;
    public com.google.android.material.textview.MaterialTextView C2Q1;
    public com.google.android.material.textview.MaterialTextView C2Q2;
    public com.google.android.material.textview.MaterialTextView C2Q3;
    public com.google.android.material.button.MaterialButton C2btn;
    public com.google.android.material.button.MaterialButton C2Fbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_chpt2);

        C2btn = findViewById(R.id.C2btn);
        C2Fbtn = findViewById(R.id.C2Fbtn);

        C2btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chpt2.this,chpt3.class);
                startActivity(intent);
            }
        });


        C2Fbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(chpt2.this,attemptquiz.class);
                startActivity(intent);


            }
        });


    }
}