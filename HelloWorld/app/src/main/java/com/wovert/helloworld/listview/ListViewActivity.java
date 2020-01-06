package com.wovert.helloworld.listview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;

import com.wovert.helloworld.R;

public class ListViewActivity extends Activity {
    private ListView mLv1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        mLv1 = (ListView) findViewById(R.id.lv_1);

    }
}
