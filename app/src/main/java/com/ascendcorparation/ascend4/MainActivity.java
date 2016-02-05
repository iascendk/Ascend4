package com.ascendcorparation.ascend4;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ProgressBar progressBar;
    private MyProgressBar pb;
    private int progressStatus = 0;
    private Handler handler = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Typeface tf1 = Typeface.createFromAsset(getAssets(), "FL.ttf");
        TextView tv1 = (TextView) findViewById(R.id.tv1);
        tv1.setTypeface(tf1);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        pb = new MyProgressBar(this);
        new Thread(new Runnable() {
            public void run() {
                while (progressStatus < 100) {
                    progressStatus += 5;

                    handler.post(new Runnable() {
                        public void run() {
                            progressBar.setProgress(progressStatus);
                            pb.setProgress(progressStatus);
                        }
                    });
                    try {

                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }

    class MyProgressBar extends ProgressBar
    {
        public MyProgressBar(Context context) {
            super(context);
        }

        @Override
        public void setProgress(int progress)
        {
            super.setProgress(progress);
            if(progress == this.getMax())
            {

                Intent intent = new Intent(MainActivity.this, menu.class);
                startActivity(intent);
            }
        }
    }
    }
