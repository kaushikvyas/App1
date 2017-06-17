package com.example.kaushik.app1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Activity1 extends AppCompatActivity {

    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        webView = (WebView)findViewById(R.id.webView);
    }

    public void facebook (View v){
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.facebook.com/");
    }
    public void github (View v){
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://github.com/kaushikvyas");
    }
    public void messenger (View v){
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.facebook.com/messages/t/");
    }
}
