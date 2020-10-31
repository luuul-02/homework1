package com.example.homework1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.TaskInfo;
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
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class EasyActivity extends AppCompatActivity {

    private long backKeyPressedTime = 0;
    Button btn_rk;
    TextView c1,c2,c3,c4,c5,c6,c7,c8, intentview;
    TableLayout tb_card;
    List<Integer> cnum = new ArrayList<>();
    List<Integer> c_bottom_num = new ArrayList<>();
    Random rnd = new Random();

    boolean click = false;
    String clickTopnum = null;
    String clickBottomnum = null;
    Chronometer chronometer;
    long time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy);

        chronometer = (Chronometer) findViewById(R.id.chronometer);
        btn_rk = (Button)findViewById(R.id.btn_rk);
        tb_card = (TableLayout)findViewById(R.id.tb_card);

        c1 = (TextView)findViewById(R.id.c1);
        c2 = (TextView)findViewById(R.id.c2);
        c3 = (TextView)findViewById(R.id.c3);
        c4 = (TextView)findViewById(R.id.c4);
        c5 = (TextView)findViewById(R.id.c5);
        c6 = (TextView)findViewById(R.id.c6);
        c7 = (TextView)findViewById(R.id.c7);
        c8 = (TextView)findViewById(R.id.c8);

        for(int i=0; i<4; i++){
            cnum.add((int)(Math.random() * ((99-10)+1)+10));
        }
        c_bottom_num.addAll(cnum);
        Collections.shuffle(cnum);
        Collections.shuffle(c_bottom_num);


        btn_rk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chronometer.stop();
                time = (SystemClock.elapsedRealtime()-chronometer.getBase())/1000;
                Intent intent = new Intent(EasyActivity.this, RankingActivity.class);
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
                temp = String.valueOf(cnum.get(0));
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
                temp = String.valueOf(cnum.get(1));
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
                        intentview.setBackgroundColor(Color.parseColor("#FF1100"));
                        intentview = null;
                        click = false;
                        clickBottomnum = null;
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
        c3.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                chronometer.start();

                String temp;
                temp = String.valueOf(cnum.get(2));
                c3.setText(temp);
                if(click == false){
                    click = true;
                    clickTopnum = temp;
                    intentview = c3;
                    return;
                }
                else{
                    if(clickBottomnum == temp){
                        c3.setBackgroundColor(Color.parseColor("#FF1100"));
                        intentview.setBackgroundColor(Color.parseColor("#FF1100"));
                        intentview = null;
                        click = false;
                        clickBottomnum = null;
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
                                c3.setText("");
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
        c4.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                chronometer.start();

                String temp;
                temp = String.valueOf(cnum.get(3));
                c4.setText(temp);
                if(click == false){
                    click = true;
                    clickTopnum = temp;
                    intentview = c4;
                    return;

                }
                else{
                    if(clickBottomnum == temp){
                        c4.setBackgroundColor(Color.parseColor("#FF1100"));
                        intentview.setBackgroundColor(Color.parseColor("#FF1100"));
                        intentview = null;
                        click = false;
                        clickBottomnum = null;
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
                                c4.setText("");
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

        c5.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                chronometer.start();

                String temp;
                temp = String.valueOf(c_bottom_num.get(0));
                c5.setText(temp);
                if(click == false){
                    click = true;
                    clickBottomnum = temp;
                    intentview = c5;
                    return;

                }
                else{
                    if(clickTopnum == temp){
                        c5.setBackgroundColor(Color.parseColor("#FF1100"));
                        intentview.setBackgroundColor(Color.parseColor("#FF1100"));
                        intentview = null;
                        click = false;
                        clickBottomnum = null;
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
                                c5.setText("");
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

        c6.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                chronometer.start();

                String temp;
                temp = String.valueOf(c_bottom_num.get(1));
                c6.setText(temp);
                if(click == false){
                    click = true;
                    clickBottomnum = temp;
                    intentview = c6;
                    return;

                }
                else{
                    if(clickTopnum == temp){
                        c6.setBackgroundColor(Color.parseColor("#FF1100"));
                        intentview.setBackgroundColor(Color.parseColor("#FF1100"));
                        intentview = null;
                        click = false;
                        clickBottomnum = null;
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
                                c6.setText("");
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

        c7.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                chronometer.start();

                String temp;
                temp = String.valueOf(c_bottom_num.get(2));
                c7.setText(temp);
                if(click == false){
                    click = true;
                    clickBottomnum = temp;
                    intentview = c7;
                    return;

                }
                else{
                    if(clickTopnum == temp){
                        c7.setBackgroundColor(Color.parseColor("#FF1100"));
                        intentview.setBackgroundColor(Color.parseColor("#FF1100"));
                        intentview = null;
                        click = false;
                        clickBottomnum = null;
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
                                c7.setText("");
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

        c8.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                chronometer.start();

                String temp;
                temp = String.valueOf(c_bottom_num.get(3));
                c8.setText(temp);
                if(click == false){
                    click = true;
                    clickBottomnum = temp;
                    intentview = c8;
                    return;

                }
                else{
                    if(clickTopnum == temp){
                        c8.setBackgroundColor(Color.parseColor("#FF1100"));
                        intentview.setBackgroundColor(Color.parseColor("#FF1100"));
                        intentview = null;
                        click = false;
                        clickBottomnum = null;
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
                                c8.setText("");
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

        chronometer.stop();
    }
    public void onBackPressed(){
        if (System.currentTimeMillis() > backKeyPressedTime + 3000) {
            backKeyPressedTime = System.currentTimeMillis();
            Toast.makeText(this, "종료하고 홈으로 이동하시겠습니까?.", Toast.LENGTH_LONG).show();
            return;
        }
        if (System.currentTimeMillis() <= backKeyPressedTime + 3000) {
            finish();
        }
    }
}