package com.ascendcorparation.ascend4;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class menu extends AppCompatActivity implements View.OnClickListener {
    protected Button bt1, bt2, bt3;
    protected Typeface tf1;
    protected Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        bt1 = (Button) findViewById(R.id.bt1);
        bt2 = (Button) findViewById(R.id.bt2);
        bt3 = (Button) findViewById(R.id.bt3);

        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);

        tf1 = Typeface.createFromAsset(getAssets(), "FL.ttf");
        bt1.setTypeface(tf1);
        bt2.setTypeface(tf1);
        bt3.setTypeface(tf1);


    }

    @Override
    public void onClick(View v){
        switch (v.getId()) {
            case R.id.bt1:
                intent = new Intent(menu.this, instruction.class);
                startActivity(intent);
                break;
            case R.id.bt2:
                intent = new Intent(menu.this, statistics.class);
                startActivity(intent);
                break;
            case R.id.bt3:
                intent = new Intent(menu.this, play.class);
                startActivity(intent);
                break;
        }
    }
}
