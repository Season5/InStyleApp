package com.scurrae.chris.instyle;

import android.app.Activity;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.victor.loading.newton.NewtonCradleLoading;
import com.victor.loading.rotate.RotateLoading;

/**
 * Created by grace on 3/9/16.
 */
public class Landing extends Activity {


    private NewtonCradleLoading newtonCradleLoading;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.landingpage);
        newtonCradleLoading = (NewtonCradleLoading) findViewById(R.id.newton_cradle_loading);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (newtonCradleLoading.isStart()) {
                    button.setText(R.string.start);
                    newtonCradleLoading.stop();
                } else {
                    button.setText(R.string.stop);
                    newtonCradleLoading.start();
                }
            }
        });
    }
}
