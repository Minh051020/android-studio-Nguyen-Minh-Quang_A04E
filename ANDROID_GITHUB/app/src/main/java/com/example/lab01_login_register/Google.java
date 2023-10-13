package com.example.lab01_login_register;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class Google extends AppCompatActivity {

    private WebView google;

    Button btn_google;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google);

        google = findViewById(R.id.google);
//        String  gg ="<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";
//        google.loadData(gg, "text/html", "utf-8");
//        google.getSettings().setJavaScriptEnabled(true);
//        google.setWebChromeClient(new WebChromeClient());


//        String url = "https://www.google.com";
//        google.setWebViewClient(new WebViewClient());
        google.loadUrl("https://www.youtube.com/watch?v=R3pd6U1YKqQ");

//        Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bing.com/search?q=www.+https%3A%2F%2Fwww.google.com&cvid=e6d65f53d1eb40c5b42757cee0127c31&gs_lcrp=EgZjaHJvbWUqBAgCEAAyBggAEEUYOjIGCAEQRRg5MgQIAhAAMgQIAxAAMgQIBBAAMgQIBRAAMgQIBhAAMgYIBxBFGEDSAQg3MzI5ajBqNKgCALACAA&FORM=ANAB01&PC=DCTS"));
//        startActivity(intent);





        btn_google = findViewById(R.id.btn_google);
        btn_google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Google.this,MainActivity.class);
                startActivity(intent);
            }
        });


    }

}