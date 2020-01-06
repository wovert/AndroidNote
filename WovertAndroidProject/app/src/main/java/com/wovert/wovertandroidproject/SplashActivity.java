package com.wovert.wovertandroidproject;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.sql.Time;

public class SplashActivity extends AppCompatActivity {

    public static final String TITLE = "title";
    public static final String USER_INFO = "userInfo";
    public static final int REQUEST_CODE = 9999;
    Handler mHandler = new Handler();
    private Button mEnterButton;

    private static final String TAG = SplashActivity.class.getSimpleName();

    private View.OnClickListener mOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.enter_button:
                    // 跳转到其他页面, 意图
                    Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                    startActivity(intent);
                    break;
            }
        }
    };
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // findViewById 返回view，所以强制类型转换
        mEnterButton = (Button)findViewById(R.id.enter_button);

        // 点击跳转到页面
        mEnterButton.setOnClickListener(mOnClickListener);

        // 获取标签
        mTextView = (TextView)findViewById(R.id.title_text_view);
        final String title = mTextView.getText().toString();

        // 自动延迟跳转
        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                // 跳转到其他页面, 意图
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);

                // 传递数据到另一个activity
                intent.putExtra(TITLE, title);

                // 对象序列化传递
                UserInfo userInfo = new UserInfo("C罗", 34);
                intent.putExtra(USER_INFO, userInfo);

//                startActivity(intent);
                // 发送请求码，与onActivityResult对应
                startActivityForResult(intent, REQUEST_CODE);


            }
        }, 1000); // 1s后自动跳转

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.i(TAG, "requestCode:" + requestCode + ", resultCode=" + resultCode);

        // 标记从哪里回来的
        if (requestCode == REQUEST_CODE && resultCode == MainActivity.RESULT_CODE) {
            // 收到礼物
            Log.i(TAG, "data:" + data);
            if (data != null) {
                String title = data.getStringExtra(TITLE);
                Log.i(TAG, "title:" + title);
                mTextView.setText(title);
            }
        }
    }
}
