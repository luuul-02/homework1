package com.example.homework1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int array[] = new int[];
    Button btn_easy, btn_normal, btn_hard;
    Button btn_rk;
    Button c1,c2,c3,c4,c5,c6,c7,c8;
    TableLayout tb_card;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_easy = (Button)findViewById(R.id.btn_easy);
        btn_normal = (Button)findViewById(R.id.btn_normal);
        btn_hard = (Button)findViewById(R.id.btn_hard);
        btn_rk = (Button)findViewById(R.id.btn_rk);
        c1 = (Button)findViewById(R.id.c1);
        c2 = (Button)findViewById(R.id.c2);
        c3 = (Button)findViewById(R.id.c3);
        c4 = (Button)findViewById(R.id.c4);
        c5 = (Button)findViewById(R.id.c5);
        c6 = (Button)findViewById(R.id.c6);
        c7 = (Button)findViewById(R.id.c7);
        c8 = (Button)findViewById(R.id.c8);

        tb_card = (TableLayout)findViewById(R.id.tb_card);

        btn_easy.setOnClickListener(this);
        btn_normal.setOnClickListener(this);
        btn_hard.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        tb_card.setVisibility(View.INVISIBLE);

        if( v == btn_easy){
            tb_card.setVisibility(View.VISIBLE);
            btn_easy.setVisibility(View.INVISIBLE);
            btn_normal.setVisibility(View.INVISIBLE);
            btn_hard.setVisibility(View.INVISIBLE);
        } else if(v == btn_normal){
            tb_card.setVisibility(View.VISIBLE);
            btn_easy.setVisibility(View.INVISIBLE);
            btn_normal.setVisibility(View.INVISIBLE);
            btn_hard.setVisibility(View.INVISIBLE);
        } else if(v == btn_hard) {
            tb_card.setVisibility(View.VISIBLE);
            btn_easy.setVisibility(View.INVISIBLE);
            btn_normal.setVisibility(View.INVISIBLE);
            btn_hard.setVisibility(View.INVISIBLE);
        }
    }
}