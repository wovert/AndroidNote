package com.wovert.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class ImageViewActivity extends AppCompatActivity {

    private ImageView mIv4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);

        mIv4 = (ImageView) findViewById(R.id.img4);

        // glide: 加载网路图片
        String img = "http://img02.tooopen.com/images/20160614/tooopen_sy_165054478519.jpg";
        Glide.with(this).load(img).into(mIv4);

    }
}
