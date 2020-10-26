package com.example.homework1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;

public class MainActivity extends AppCompatActivity{


    Button btn_easy, btn_normal, btn_hard;
    Button btn_rk;
    TableLayout tb_card;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_easy = (Button)findViewById(R.id.btn_easy);
        btn_normal = (Button)findViewById(R.id.btn_normal);
        btn_hard = (Button)findViewById(R.id.btn_hard);
        btn_rk = (Button)findViewById(R.id.btn_rk);


        btn_easy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, EasyActivity.class);
                startActivity(intent);
            }
        });
        btn_normal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NormalActivity.class);
                startActivity(intent);
            }
        });
        btn_hard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HardActivity.class);
                startActivity(intent);
            }
        });

    }
}