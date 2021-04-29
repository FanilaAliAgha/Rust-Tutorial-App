package com.example.mainpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class compiler extends AppCompatActivity {
    public WebView ccomplier;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compiler);


        ccomplier=findViewById(R.id.ccompiler);

       // WebView ccomplier = (WebView) findViewById(R.id.ccompiler);
        ccomplier.loadUrl("https://play.rust-lang.org/");


        WebSettings ccomplierSettings = ccomplier.getSettings();
        ccomplierSettings.setJavaScriptEnabled(true);
    }
}