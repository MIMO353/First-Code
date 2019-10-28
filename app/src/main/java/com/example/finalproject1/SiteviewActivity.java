package com.example.finalproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class SiteviewActivity extends AppCompatActivity {

    //تعریف شی وب ویو
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siteview);

        //اتصال به لایه xml
        webView = findViewById(R.id.web_view);
        //تعریف آدرس مرورگر
        webView.loadUrl("https://www.google.com");

    }
}
