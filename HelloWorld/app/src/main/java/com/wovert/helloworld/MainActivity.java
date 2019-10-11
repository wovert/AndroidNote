package com.wovert.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button mBtnTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 设置内容视图
        setContentView(R.layout.activity_main);
        // 获取按钮控件
        mBtnTextView = (Button) findViewById(R.id.btn_textview);

        // 按钮出发点击事件
        mBtnTextView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // 跳转到TextView演示界面
                Intent intent = new Intent(MainActivity.this, TextViewActivity.class);
                startActivity(intent);
            }
        });
    }
}
