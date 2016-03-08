package com.scurrae.chris.instyle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * Created by chris on 3/8/16.
 */
public class Splash extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        int timer = 2500;

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getBaseContext(), MainIntroActivity2.class));
            }
        }, timer);
    }

    @Override
    protected void onStop() {
        super.onStop();
        finish();
    }
}
