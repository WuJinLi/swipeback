package com.wjl.swipebacklayout;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.view.View;
import android.widget.Button;

import com.wjl.swipebacklayout.activity.CommonActivity;
import com.wjl.swipebacklayout.activity.CommonAttachToActivity;
import com.wjl.swipebacklayout.activity.HorizontalScrollViewActivity;
import com.wjl.swipebacklayout.activity.ListViewActivity;
import com.wjl.swipebacklayout.activity.NestedScrollViewActivity;
import com.wjl.swipebacklayout.activity.RecyclerViewActivity;
import com.wjl.swipebacklayout.activity.ScrollViewActivity;
import com.wjl.swipebacklayout.activity.SwipeRefreshLayoutActivity;
import com.wjl.swipebacklayout.activity.ViewPagerActivity;
import com.wjl.swipebacklayout.activity.WebViewActivity;
import com.wjl.swipebacklayout.base.BaseToolBarActivity;

/**
 * author: WuJinLi
 * time  : 17/9/1
 * desc  :
 */
public class MainActivity extends BaseToolBarActivity implements View.OnClickListener {
    private Button btnCommon;
    private Button btnAttachToCommon;
    private Button btnScrollView;
    private Button btnHorizontalScrollView;
    private Button btnNestedScrollView;
    private Button btnRecyclerView;
    private Button btnListView;
    private Button btnViewPager;
    private Button btnWebView;
    private Button btnSwipeRefreshLayout;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        btnCommon = initButton(R.id.btnCommon);
        btnAttachToCommon = initButton(R.id.btnAttachToCommon);
        btnScrollView = initButton(R.id.btnScrollView);
        btnHorizontalScrollView = initButton(R.id.btnHorizontalScrollView);
        btnNestedScrollView = initButton(R.id.btnNestedScrollView);
        btnListView = initButton(R.id.btnListView);
        btnRecyclerView = initButton(R.id.btnRecyclerView);
        btnWebView = initButton(R.id.btnWebView);
        btnViewPager = initButton(R.id.btnViewPager);
        btnSwipeRefreshLayout = initButton(R.id.btnSwipeRefreshLayout);
    }

    private Button initButton(@IdRes int id) {
        Button btn = (Button) findViewById(id);
        btn.setOnClickListener(this);
        return btn;
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnCommon:
                startActivity(CommonActivity.class);
                break;
            case R.id.btnAttachToCommon:
                startActivity(CommonAttachToActivity.class);
                break;
            case R.id.btnScrollView:
                startActivity(ScrollViewActivity.class);
                break;
            case R.id.btnHorizontalScrollView:
                startActivity(HorizontalScrollViewActivity.class);
                break;
            case R.id.btnNestedScrollView:
                startActivity(NestedScrollViewActivity.class);
                break;
            case R.id.btnListView:
                startActivity(ListViewActivity.class);
                break;
            case R.id.btnRecyclerView:
                startActivity(RecyclerViewActivity.class);
                break;
            case R.id.btnViewPager:
                startActivity(ViewPagerActivity.class);
                break;
            case R.id.btnWebView:
                startActivity(WebViewActivity.class);
                break;
            case R.id.btnSwipeRefreshLayout:
                startActivity(SwipeRefreshLayoutActivity.class);
                break;
        }
    }

    public void startActivity(Class<?> clazz) {
        startActivity(new Intent(MainActivity.this, clazz));
    }
}
