package com.wjl.swipebacklayout.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.CompoundButton;
import android.widget.RadioButton;

import com.wjl.swipebacklayout.R;
import com.wjl.swipelibrary.SwipeBackLayout;


/**
 * author: WuJinLi
 * time  : 17/9/1
 * desc  :
 */

public abstract class BaseSwipeBackActivity extends BaseToolBarActivity implements CompoundButton.OnCheckedChangeListener {
    protected SwipeBackLayout mSwipeBackLayout;
    protected RadioButton fromLeftRb;
    protected RadioButton fromTopRb;
    protected RadioButton fromRightRb;
    protected RadioButton fromBottomRb;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mSwipeBackLayout = (SwipeBackLayout) findViewById(R.id.swipeBackLayout);
        fromLeftRb = (RadioButton) findViewById(R.id.fromLeftRb);
        fromLeftRb.setOnCheckedChangeListener(this);
        fromTopRb = (RadioButton) findViewById(R.id.fromTopRb);
        fromTopRb.setOnCheckedChangeListener(this);
        fromRightRb = (RadioButton) findViewById(R.id.fromRightRb);
        fromRightRb.setOnCheckedChangeListener(this);
        fromBottomRb = (RadioButton) findViewById(R.id.fromBottomRb);
        fromBottomRb.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (isChecked) {
            switch (buttonView.getId()) {
                case R.id.fromLeftRb:
                    mSwipeBackLayout.setDirectionMode(SwipeBackLayout.FROM_LEFT);
                    break;
                case R.id.fromTopRb:
                    mSwipeBackLayout.setDirectionMode(SwipeBackLayout.FROM_TOP);
                    break;
                case R.id.fromRightRb:
                    mSwipeBackLayout.setDirectionMode(SwipeBackLayout.FROM_RIGHT);
                    break;
                case R.id.fromBottomRb:
                    mSwipeBackLayout.setDirectionMode(SwipeBackLayout.FROM_BOTTOM);
                    break;
            }
        }
    }
}

