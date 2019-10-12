package com.wovert.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class ButtonActivity extends AppCompatActivity {
    private Button btn3;
    private TextView textBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);

        // 点击事件绑定处理函数
        btn3 = (Button) findViewById(R.id.btn_3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ButtonActivity.this, "btn3被点击了", Toast.LENGTH_SHORT).show();
            }
        });

        textBtn = (TextView) findViewById(R.id.text_btn);
        textBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ButtonActivity.this, "文本被点击了", Toast.LENGTH_SHORT).show();
            }
        });

    }
    
    public void showToast(View view) {
        Toast.makeText(this, "btn_shadow我被点击了", Toast.LENGTH_SHORT).show();
    }
}
