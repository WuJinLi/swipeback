package com.wjl.swipebacklayout.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.wjl.swipebacklayout.R;


/**
 * author: WuJinLi
 * time  : 17/9/1
 * desc  :
 */

public abstract class BaseToolBarActivity extends AppCompatActivity {
    protected final String TAG = getClass().getSimpleName();
    protected Toolbar toolbar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        setTitle(TAG);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    protected abstract int getLayoutId();

}
