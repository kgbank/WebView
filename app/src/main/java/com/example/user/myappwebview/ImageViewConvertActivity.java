package com.example.user.myappwebview;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class ImageViewConvertActivity extends Activity implements View.OnClickListener{
    ImageView imageView;
    Button btPrevImage, btNextImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view_convert);

        imageView = (ImageView) findViewById(R.id.ivPicture);
        btNextImage = (Button) findViewById(R.id.btNextImage);
        btNextImage.setOnClickListener(this);
        btPrevImage = (Button) findViewById(R.id.btPrevImage);
        btPrevImage.setOnClickListener(this);
//        btPrevImage.setVisibility(View.INVISIBLE);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btPrevImage:
                imageView.setImageResource(R.drawable.jellyfish);
//                btPrevImage.setVisibility(View.INVISIBLE);
//                btNextImage.setVisibility(View.VISIBLE);
                break;
            case R.id.btNextImage:
                imageView.setImageResource(R.drawable.tulips);
//                btPrevImage.setVisibility(View.VISIBLE);
//                btNextImage.setVisibility(View.INVISIBLE);
                break;
        }
    }
}
