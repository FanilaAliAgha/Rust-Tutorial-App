package com.example.mainpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class passwordupdated extends AppCompatActivity {
public com.google.android.material.button.MaterialButton containedButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passwordupdated);

        containedButton = findViewById(R.id.containedButton);


        containedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(passwordupdated.this , login.class);
                startActivity(intent);
            }
        });
    }
}