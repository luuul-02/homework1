package com.example.homework1;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class RankingActivity extends AppCompatActivity {

    TextView tv_etime1,tv_etime2,tv_etime3,tv_ntime1,tv_ntime2,tv_ntime3,tv_htime1,tv_htime2,tv_htime3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ranking);


        tv_etime1 = (TextView)findViewById(R.id.tv_etime1);
        tv_etime2 = (TextView)findViewById(R.id.tv_etime2);
        tv_etime3 = (TextView)findViewById(R.id.tv_etime3);
        tv_ntime1 = (TextView)findViewById(R.id.tv_ntime2);
        tv_ntime2 = (TextView)findViewById(R.id.tv_ntime2);
        tv_ntime3 = (TextView)findViewById(R.id.tv_ntime3);
        tv_htime1 = (TextView)findViewById(R.id.tv_htime1);
        tv_htime2 = (TextView)findViewById(R.id.tv_htime2);
        tv_htime3 = (TextView)findViewById(R.id.tv_htime3);


    }
}
