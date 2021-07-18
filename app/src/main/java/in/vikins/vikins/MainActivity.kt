package `in`.vikins.vikins

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.Touch.scrollTo
import android.view.KeyEvent
import android.view.MotionEvent
import android.view.View
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myWebView: WebView = findViewById(R.id.webview)
        myWebView.loadUrl("http://www.vikins.in")
        WebView.SCROLL_INDICATOR_TOP
        myWebView.settings.javaScriptEnabled = true
        myWebView.settings.allowFileAccessFromFileURLs = true
        myWebView.webViewClient = WebViewClient()
        myWebView.canGoBack()
        myWebView.setOnKeyListener(View.OnKeyListener
        {v,keyCode,event->
            if (keyCode == KeyEvent.KEYCODE_BACK && event.action == MotionEvent.ACTION_UP && myWebView.canGoBack()){
                myWebView.goBack()
                return@OnKeyListener true
            }
            false
        })

    }
}