package com.pedaily.yc.mescrollview;

import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.pedaily.yc.mescrollview.first.FirstActivity;
import com.pedaily.yc.mescrollview.five.FiveActivity;
import com.pedaily.yc.mescrollview.four.FourActivity;
import com.pedaily.yc.mescrollview.second.SecondActivity;
import com.pedaily.yc.mescrollview.six.SixActivity;
import com.pedaily.yc.mescrollview.third.ThirdActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        }
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        findViewById(R.id.tv_1).setOnClickListener(this);
        findViewById(R.id.tv_2).setOnClickListener(this);
        findViewById(R.id.tv_3).setOnClickListener(this);
        findViewById(R.id.tv_4).setOnClickListener(this);
        findViewById(R.id.tv_5).setOnClickListener(this);
        findViewById(R.id.tv_6).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.tv_1:
                startActivity(new Intent(this, FirstActivity.class));
                break;
            case R.id.tv_2:
                startActivity(new Intent(this, SecondActivity.class));
                break;
            case R.id.tv_3:
                startActivity(new Intent(this, ThirdActivity.class));
                break;
            case R.id.tv_4:
                startActivity(new Intent(this, FourActivity.class));
                break;
            case R.id.tv_5:
                startActivity(new Intent(this, FiveActivity.class));
                break;
            case R.id.tv_6:
                startActivity(new Intent(this, SixActivity.class));
                break;
        }
    }
}
