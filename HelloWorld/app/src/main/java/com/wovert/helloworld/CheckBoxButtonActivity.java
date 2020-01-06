package com.wovert.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class CheckBoxButtonActivity extends AppCompatActivity {

    private CheckBox mWhite, mBlack, mRed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box_button);

        mWhite = (CheckBox) findViewById(R.id.white);
        mBlack = (CheckBox) findViewById(R.id.black);
        mRed = (CheckBox) findViewById(R.id.red);

        mWhite.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                Toast.makeText(CheckBoxButtonActivity.this, isChecked ? "选中":"未选中", Toast.LENGTH_SHORT).show();
            }
        });



    }
}
