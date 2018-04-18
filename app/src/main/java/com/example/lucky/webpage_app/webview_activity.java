package com.example.lucky.webpage_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
public class webview_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview_activity);
        String url="https://google.com";
        WebView webView=(WebView)findViewById(R.id.webview);
        webView.loadUrl(url);
    }
}
