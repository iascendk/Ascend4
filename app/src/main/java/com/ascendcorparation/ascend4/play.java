package com.ascendcorparation.ascend4;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


public class play extends AppCompatActivity {

    private TextView mCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        mCount = (TextView) findViewById(R.id.mCount);
        new CountDownTimer(30000, 1000) {

            //Здесь обновляем текст счетчика обратного отсчета с каждой секундой
            public void onTick(long millisUntilFinished) {
                mCount.setText(
                        (int) (+ millisUntilFinished / 1000));
            }
            //Задаем действия после завершения отсчета (высвечиваем надпись "Бабах!"):
            public void onFinish() {
                mCount.setText("Бабах!");
            }
        }
                .start();

    }


}