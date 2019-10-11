package com.wovert.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class TextViewActivity extends AppCompatActivity {

    public TextView mTv4, mTv5, mTv6, tvDeviceName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);

        // 获取文本控件
        mTv4 = (TextView) findViewById(R.id.text_view_4);

        // 中划线
        mTv4.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);

        // 去除锯齿
        mTv4.getPaint().setAntiAlias(true);

        mTv5 = (TextView) findViewById(R.id.text_view_5);

        // 下划线
        mTv5.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);

        mTv6 = (TextView) findViewById(R.id.text_view_6);
        mTv6.setText("Hello world");
        mTv6.setText(Html.fromHtml("<u>HTML下划线效果</u>"));

        // 跑马灯效果
        tvDeviceName = (TextView) findViewById(R.id.tv_device_name);
        tvDeviceName.setSelected(true);

    }
}
