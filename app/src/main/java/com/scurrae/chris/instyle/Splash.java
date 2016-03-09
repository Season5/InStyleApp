package com.scurrae.chris.instyle;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.content.ContextCompat;

import io.saeid.fabloading.LoadingView;

/**
 * Created by chris on 3/8/16.
 */
public class Splash extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        LoadingView mLoadingView = (LoadingView) findViewById(R.id.loading_view);
        mLoadingView.addAnimation(000000,
                R.drawable.pb1, LoadingView.FROM_BOTTOM);
        mLoadingView.addAnimation(444444,
                R.drawable.pb2, LoadingView.FROM_TOP);
        mLoadingView.addAnimation(777777,
                R.drawable.pb3, LoadingView.FROM_LEFT);
        mLoadingView.addAnimation(999999,
                R.drawable.pb4, LoadingView.FROM_RIGHT);


        mLoadingView.startAnimation();


        int timer = 5000;

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getBaseContext(), MainIntroActivity2.class));

                finish();
            }
        }, timer);
    }
}
