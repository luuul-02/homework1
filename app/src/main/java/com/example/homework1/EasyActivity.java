package com.example.homework1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TextView;

import java.util.Random;

public class EasyActivity extends AppCompatActivity {

    Button btn_easy, btn_normal, btn_hard;
    Button btn_rk;
    TextView c1,c2,c3,c4,c5,c6,c7,c8;
    TableLayout tb_card;
    int cnum[] = new int[4];
    Random rnd = new Random();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy);

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
            cnum[i] = rnd.nextInt(98)+10;
        }

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                while(true){
                    int num = rnd.nextInt(3);
                    String temp;
                    if(cnum[num] == 0){
                        return;
                    }
                    temp = String.valueOf(cnum[num]);
                    c1.setText(temp);
                    c1.setBackground(R.drawable.card_img2);
                    break;
                }


            }
        });

        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                while(true){
                    int num = rnd.nextInt(3);
                   String temp;
                    if(cnum[num] == 0){
                        return;
                    }
                    temp = String.valueOf(cnum[num]);
                    c2.setText(temp);
                    cnum[num] = 0;
                    break;

                }


            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                while(true){
                    int num = rnd.nextInt(3);
                    String temp;
                    if(cnum[num] == 0){
                        return;
                    }
                    temp = String.valueOf(cnum[num]);
                    c3.setText(temp);
                    cnum[num] = 0;
                    break;

                }


            }
        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                while(true){
                    int num = rnd.nextInt(3);
                    String temp;
                    if(cnum[num] == 0){
                        return;
                    }
                    temp = String.valueOf(cnum[num]);
                    c4.setText(temp);
                    cnum[num] = 0;
                    break;

                }


            }
        });

    }
}