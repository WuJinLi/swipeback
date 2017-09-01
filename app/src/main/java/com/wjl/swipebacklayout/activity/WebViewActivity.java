package com.wjl.swipebacklayout.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.wjl.swipebacklayout.R;
import com.wjl.swipebacklayout.base.BaseSwipeBackActivity;


/**
 * author: WuJinLi
 * time  : 17/9/1
 * desc  :
 */

public class WebViewActivity extends BaseSwipeBackActivity {
    private WebView mWebView;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_webview;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mWebView = (WebView) findViewById(R.id.webView);
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });
        mWebView.loadUrl("https://wap.baidu.com");
    }
}
