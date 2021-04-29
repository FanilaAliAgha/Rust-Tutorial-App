package com.example.mainpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class singup extends AppCompatActivity {
    public com.google.android.material.textfield.TextInputLayout Namebox;
    public com.google.android.material.textfield.TextInputLayout Emailbox;
    public com.google.android.material.textfield.TextInputLayout passwordbox;
    public com.google.android.material.textfield.TextInputLayout confirmpassword;
    public com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton signupbtn;
    public com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton cancelbtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singup);
        Namebox = findViewById(R.id.Namebox);
        Emailbox = findViewById(R.id.Emailbox);
        passwordbox = findViewById(R.id.passwordbox);
        confirmpassword = findViewById(R.id.confirmpassword);
        signupbtn = findViewById(R.id.signupbtn);
        cancelbtn = findViewById(R.id.cancelbtn);

        signupbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(singup.this, login.class);
                startActivity(intent);
            }
        });

        cancelbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(singup.this, MainActivity.class);
                startActivity(intent);

            }
        });

    }
}