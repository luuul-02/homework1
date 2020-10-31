package com.example.homework1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TableLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NormalActivity extends AppCompatActivity {

    Button btn_rk;
    TextView c1,c2,c3,c4,c5,c6,c7,c8, c9, c10, c11, c12, c13, c14, c15, c16, intentview;
    TableLayout tb_card;
    List<Integer> cnum1 = new ArrayList<>();
    List<Integer> cnum2 = new ArrayList<>();
    Chronometer chronometer;
    long time;
    boolean click = false;
    String clickTopnum = null;
    String clickBottomnum = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal);

        btn_rk = (Button)findViewById(R.id.btn_rk);

        tb_card = (TableLayout)findViewById(R.id.tb_card);
        chronometer = (Chronometer) findViewById(R.id.chronometer);

        c1 = (TextView)findViewById(R.id.c1);
        c2 = (TextView)findViewById(R.id.c2);
        c3 = (TextView)findViewById(R.id.c3);
        c4 = (TextView)findViewById(R.id.c4);
        c5 = (TextView)findViewById(R.id.c5);
        c6 = (TextView)findViewById(R.id.c6);
        c7 = (TextView)findViewById(R.id.c7);
        c8 = (TextView)findViewById(R.id.c8);
        c9 = (TextView)findViewById(R.id.c9);
        c10 = (TextView)findViewById(R.id.c10);
        c11 = (TextView)findViewById(R.id.c11);
        c12 = (TextView)findViewById(R.id.c12);
        c13 = (TextView)findViewById(R.id.c13);
        c14 = (TextView)findViewById(R.id.c14);
        c15 = (TextView)findViewById(R.id.c15);
        c16 = (TextView)findViewById(R.id.c16);


        for(int i=0; i<8; i++){
            cnum1.add((int)(Math.random() * ((99-10)+1)+10));
        }
        cnum2.addAll(cnum1);
        Collections.shuffle(cnum1);
        Collections.shuffle(cnum2);

        btn_rk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chronometer.stop();
                time = (SystemClock.elapsedRealtime()-chronometer.getBase())/1000;
                Intent intent = new Intent(NormalActivity.this, RankingActivity.class);
                intent.putExtra("Time", time);
                startActivity(intent);
            }
        });

        c1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                chronometer.start();

                String temp;
                temp = String.valueOf(cnum1.get(0));
                c1.setText(temp);
                if(click == false){
                    click = true;
                    clickTopnum = temp;
                    intentview = c1;
                    return;
                }
                else{
                    if(clickBottomnum == temp){
                        c1.setBackgroundColor(Color.parseColor("#FF1100"));
                        click = false;
                        clickBottomnum = null;
                        intentview.setBackgroundColor(Color.parseColor("#FF1100"));
                        intentview = null;
                        chronometer.stop();

                    }
                    else{
                        new Handler().post(new Runnable() {
                            @Override
                            public void run() {
                                try {
                                    Thread.sleep(2000);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                intentview.setText("");
                                c1.setText("");
                                intentview = null;
                                click = false;
                                clickBottomnum = null;
                            }
                        });
                        return;

                    }
                }
            }
        });


        c2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                chronometer.start();

                String temp;
                temp = String.valueOf(cnum1.get(1));
                c2.setText(temp);
                if(click == false){
                    click = true;
                    clickTopnum = temp;
                    intentview = c2;
                    return;
                }
                else{
                    if(clickBottomnum == temp){
                        c2.setBackgroundColor(Color.parseColor("#FF1100"));
                        click = false;
                        clickBottomnum = null;
                        intentview.setBackgroundColor(Color.parseColor("#FF1100"));
                        intentview = null;
                        chronometer.stop();

                    }
                    else{
                        new Handler().post(new Runnable() {
                            @Override
                            public void run() {
                                try {
                                    Thread.sleep(2000);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                intentview.setText("");
                                c2.setText("");
                                intentview = null;
                                click = false;
                                clickBottomnum = null;
                            }
                        });
                        return;

                    }
                }
            }
        });

        c2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                chronometer.start();

                String temp;
                temp = String.valueOf(cnum1.get(1));
                c2.setText(temp);
                if(click == false){
                    click = true;
                    clickTopnum = temp;
                    intentview = c2;
                    return;
                }
                else{
                    if(clickBottomnum == temp){
                        c2.setBackgroundColor(Color.parseColor("#FF1100"));
                        click = false;
                        clickBottomnum = null;
                        intentview.setBackgroundColor(Color.parseColor("#FF1100"));
                        intentview = null;
                        chronometer.stop();

                    }
                    else{
                        new Handler().post(new Runnable() {
                            @Override
                            public void run() {
                                try {
                                    Thread.sleep(2000);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                intentview.setText("");
                                c2.setText("");
                                intentview = null;
                                click = false;
                                clickBottomnum = null;
                            }
                        });
                        return;

                    }
                }
            }
        });


    }
}