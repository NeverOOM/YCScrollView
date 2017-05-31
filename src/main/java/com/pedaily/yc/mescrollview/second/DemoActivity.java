package com.pedaily.yc.mescrollview.second;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.pedaily.yc.mescrollview.R;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;

import java.util.ArrayList;

/**
 * Created by PC on 2017/5/31.
 * 问题：当包裹的布局长度没有填充满整个页面时【即使是match_content也没用】，滑动轮播图没有反应
 */

public class DemoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_demo);
        initBanner();
    }

    private Integer[] images = {R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e};
    private String[] titles = {"第一张","第二张","第三张","第四张","第五张"};
    private void initBanner() {
        Banner banner = (Banner) findViewById(R.id.banner);
        ArrayList<Integer> lists = new ArrayList<>();
        ArrayList<String> titleLists = new ArrayList<>();
        for(int a=0 ; a<images.length ; a++){
            lists.add(images[a]);
        }
        for(int b=0 ; b<titles.length ; b++){
            titleLists.add(titles[b]);
        }
        //设置banner样式
        banner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR_TITLE);
        //设置图片加载器
        banner.setImageLoader(new SecGlideImageLoader());
        //设置图片集合
        banner.setImages(lists);
        //设置banner动画效果
        banner.setBannerAnimation(Transformer.Default);
        //设置标题集合（当banner样式有显示title时）
        banner.setBannerTitles(titleLists);
        //设置自动轮播，默认为true
        banner.isAutoPlay(true);
        //设置轮播时间
        banner.setDelayTime(3000);
        //设置指示器位置（当banner模式中有指示器时）
        banner.setIndicatorGravity(BannerConfig.RIGHT);
        //banner设置方法全部调用完毕时最后调用
        banner.start();
    }
}
