package com.example.user.myappwebview;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class IntroActivity extends Activity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        findViewById(R.id.btWebView).setOnClickListener(this);
        findViewById(R.id.btImageView).setOnClickListener(this);
        findViewById(R.id.btImageConvert).setOnClickListener(this);
        findViewById(R.id.btListView).setOnClickListener(this);
        findViewById(R.id.btGridView).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btWebView:
                startActivity(new Intent(this, MainActivity.class));
                break;
            case R.id.btImageView:
                startActivity(new Intent(this, ImageViewActivity.class));
                break;
            case R.id.btImageConvert:
                startActivity(new Intent(this, ImageViewConvertActivity.class));
                break;
            case R.id.btListView:
                startActivity(new Intent(this, ImageListActivity.class));
                break;
            case R.id.btGridView:
                startActivity(new Intent(this, ImageGridActivity.class));
                break;
        }
    }
}
