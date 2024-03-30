package com.example.webviewapp
/*
In Android development with Kotlin, a WebView is a component that allows you to
display web pages or HTML content within your Android application. It
essentially embeds a browser component into your app, allowing users to
interact with web content without leaving the app.
 */
import android.os.Build
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    //@RequiresApi() resolves the issue of API24 and API26 difference:
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Setup WebView:
        val webViewVariable = findViewById<WebView>(R.id.webView);
        webViewSetup(webViewVariable);
    }
    //Creating a function to setup the webview:
    @RequiresApi(Build.VERSION_CODES.O)
    private fun webViewSetup(webViewVar: WebView) {
        //Setup WebView Client:
        webViewVar.webViewClient = WebViewClient();
        //Give the settings implementation/Application of webview:
        webViewVar.apply {
            //Configure a few settings:
            settings.javaScriptEnabled = true;
            settings.safeBrowsingEnabled = true;
            //Inside loadUrl write the url of the website which you want to display as a webview of app
            loadUrl("https://argang05.github.io/Sundown-Co-Frontend./")
        }
    }
}