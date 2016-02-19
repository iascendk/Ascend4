package com.ascendcorparation.ascend4;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

import java.util.List;


public class play extends AppCompatActivity {
    int minteger = 0;
    private TextView mCount;
    private TextView que;
    List<Question> quesList;
    int score=0;
    int qid=0;
    Question currentQ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        mCount = (TextView) findViewById(R.id.mCount);
        que = (TextView) findViewById(R.id.que);
        DbHelper db=new DbHelper(this);

        currentQ = quesList.get(qid);
        setQuestionView();




        new CountDownTimer(30000, 1000) {

            //Здесь обновляем текст счетчика обратного отсчета с каждой секундой
            public void onTick(long millisUntilFinished) {
                mCount.setText(
                        String.valueOf((int) (+millisUntilFinished / 1000)));
            }

            //Задаем действия после завершения отсчета:
            public void onFinish() {
                Intent intent = new Intent(play.this, score.class);
                Bundle b = new Bundle();
                b.putInt("score", score); //Your score
                intent.putExtras(b);
                startActivity(intent);
            }
        }
                .start();


    }
    public void increaseInteger(View view) {
        minteger = minteger + 1;
        display(minteger);

    }public void decreaseInteger(View view) {
        minteger = minteger - 1;
        display(minteger);
    }

    private void display(int number) {
        TextView score = (TextView) findViewById(
                R.id.score);
        score.setText("" + number);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
// Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_play, menu);
        return true;
    }
    private void setQuestionView()
    {
        que.setText(currentQ.getQUESTION());
        qid++;
    }

    }



