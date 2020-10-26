package com.example.homework1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TableLayout;

public class HardActivity extends AppCompatActivity {

    Button btn_easy, btn_normal, btn_hard;
    Button btn_rk;
    Button c1,c2,c3,c4,c5,c6,c7,c8;
    TableLayout tb_card;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hard);

        btn_rk = (Button)findViewById(R.id.btn_rk);

        tb_card = (TableLayout)findViewById(R.id.tb_card);

        c1 = (Button)findViewById(R.id.c1);
        c2 = (Button)findViewById(R.id.c2);
        c3 = (Button)findViewById(R.id.c3);
        c4 = (Button)findViewById(R.id.c4);
        c5 = (Button)findViewById(R.id.c5);
        c6 = (Button)findViewById(R.id.c6);
        c7 = (Button)findViewById(R.id.c7);
        c8 = (Button)findViewById(R.id.c8);

    }
}