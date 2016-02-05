package com.ascendcorparation.ascend4;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class menu extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Typeface tf1 = Typeface.createFromAsset(getAssets(), "FL.ttf");
        Button bt1 = (Button) findViewById(R.id.bt1);
        bt1.setTypeface(tf1);
        bt1.setOnClickListener(this);
        tf1 = Typeface.createFromAsset(getAssets(), "FL.ttf");
        Button bt2 = (Button) findViewById(R.id.bt2);
        bt2.setTypeface(tf1);
        tf1 = Typeface.createFromAsset(getAssets(), "FL.ttf");
        Button bt3 = (Button) findViewById(R.id.bt3);
        bt3.setTypeface(tf1);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt1:
                Intent intent = new Intent(this, instruction.class);
                startActivity(intent);
                break;
            case R.id.bt2:
                intent = new Intent(this, statistics.class);
                startActivity(intent);
                break;
            case R.id.bt3:
                intent = new Intent(this, play.class);
                startActivity(intent);
                break;
        }
    }
}
