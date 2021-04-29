package com.example.mainpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class login extends AppCompatActivity {
    public com.google.android.material.textfield.TextInputLayout username;
    public com.google.android.material.textfield.TextInputLayout password;
    public com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton logintbn;
    public com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton guestbtn;
    public com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton forgotpass;
    public Button createnewA;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        logintbn = findViewById(R.id.loginbtn);
        forgotpass=findViewById(R.id.forgotpass);
        createnewA = findViewById(R.id.createnewA);
        guestbtn = findViewById(R.id.guest_btn);


        createnewA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(login.this , singup.class);
                startActivity(intent);
            }
        });




        guestbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(login.this , gdashboard.class);
                startActivity(intent);
            }
        });



        logintbn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(login.this , dashboard.class);
                startActivity(intent);
            }
        });

        forgotpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(login.this , forgotpassword.class);
                startActivity(intent);

            }
        });

    }
}