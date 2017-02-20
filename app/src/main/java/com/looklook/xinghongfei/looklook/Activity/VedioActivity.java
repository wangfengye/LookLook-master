package com.looklook.xinghongfei.looklook.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

import com.looklook.xinghongfei.looklook.R;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class VedioActivity extends AppCompatActivity {

    @InjectView(R.id.web)
    WebView mWeb;
    private String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vedio);
        ButterKnife.inject(this);
        initialData();
        initView();
    }

    private void initView() {

        mWeb.loadUrl(url);
    }

    private void initialData() {
       url= getIntent().getStringExtra("url");
    }
}
