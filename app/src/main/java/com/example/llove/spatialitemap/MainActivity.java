package com.example.llove.spatialitemap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webview = new WebView(this);
        setContentView(webview);
        WebView.setWebContentsDebuggingEnabled(true);
        webview.getSettings().setJavaScriptEnabled(true);


        webview.loadUrl("file:///android_asset/index.html");
    }
}
