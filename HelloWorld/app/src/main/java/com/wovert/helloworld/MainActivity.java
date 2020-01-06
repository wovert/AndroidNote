package com.wovert.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.wovert.helloworld.listview.ListViewActivity;

public class MainActivity extends AppCompatActivity {

    private Button mBtnTextView, mBtn, mBtnEditText, mRadioBtn, mCheckBoxBtn, mBtnImageView, mBtnListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 设置内容视图
        setContentView(R.layout.activity_main);

        // 获取按钮控件
        mBtnTextView = (Button) findViewById(R.id.btn_textview);

        // 按钮出发点击事件
//        mBtnTextView.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v) {
//                // 跳转到TextView演示界面
//                Intent intent = new Intent(MainActivity.this, TextViewActivity.class);
//                startActivity(intent);
//            }
//        });

        mBtn = (Button) findViewById(R.id.btn_1);
//        mBtn.setOnClickListener(new View.OnClickListener() {
//            // 跳转到 button演示界面
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, ButtonActivity.class);
//                startActivity(intent);
//            }
//        });

        mBtnEditText = (Button) findViewById(R.id.btn_edit_text);
//        mBtnEditText.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(MainActivity.this, EditTextActivity.class);
//                startActivity(intent);
//            }
//        });

        // radio button
        mRadioBtn = (Button) findViewById(R.id.radio_btn);

        // checkbox button
        mCheckBoxBtn = (Button) findViewById(R.id.checkbox_btn);

        mBtnImageView = (Button) findViewById(R.id.image_view_btn);
        mBtnListView = (Button) findViewById(R.id.list_view_btn);
        this.setListeners();
    }

    private void setListeners() {
        OnClick onClick = new OnClick();
        mBtnTextView.setOnClickListener(onClick);
        mBtn.setOnClickListener(onClick);
        mBtnEditText.setOnClickListener(onClick);
        mRadioBtn.setOnClickListener(onClick);
        mCheckBoxBtn.setOnClickListener(onClick);
        mBtnImageView.setOnClickListener(onClick);
        mBtnListView.setOnClickListener(onClick);
    }

    private class OnClick implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            Intent intent = null;
            switch(view.getId()) {
                case R.id.btn_edit_text:
                    intent = new Intent(MainActivity.this, EditTextActivity.class);
                    break;
                case R.id.btn_1:
                    intent = new Intent(MainActivity.this, ButtonActivity.class);
                    break;
                case R.id.btn_textview:
                    intent = new Intent(MainActivity.this, TextViewActivity.class);
                    break;
                case R.id.radio_btn:
                    intent = new Intent(MainActivity.this, RadioButtonActivity.class);
                    break;
                case R.id.checkbox_btn:
                    intent = new Intent(MainActivity.this, CheckBoxButtonActivity.class);
                    break;
                case R.id.image_view_btn:
                    intent = new Intent(MainActivity.this, ImageViewActivity.class);
                    break;
                case R.id.list_view_btn:
                    intent = new Intent(MainActivity.this, ListViewActivity.class);
                    break;
                default:
                    break;
            }
            startActivity(intent);
        }
    }
}
