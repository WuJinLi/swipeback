package com.wjl.swipebacklayout.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.wjl.swipebacklayout.R;
import com.wjl.swipebacklayout.base.BaseSwipeBackActivity;
import com.wjl.swipelibrary.SwipeBackLayout;


/**
 * author: WuJinLi
 * time  : 17/9/1
 * desc  :
 */

public class CommonActivity extends BaseSwipeBackActivity {

    @Override
    protected int getLayoutId() {
        return R.layout.activity_common;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        switch (mSwipeBackLayout.getDirectionMode()) {
            case SwipeBackLayout.FROM_LEFT:
                fromLeftRb.setChecked(true);
                break;
            case SwipeBackLayout.FROM_TOP:
                fromTopRb.setChecked(true);
                break;
            case SwipeBackLayout.FROM_RIGHT:
                fromRightRb.setChecked(true);
                break;
            case SwipeBackLayout.FROM_BOTTOM:
                fromBottomRb.setChecked(true);
                break;
        }
    }
}
