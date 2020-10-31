package com.example.homework1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{


    Button btn_easy, btn_normal, btn_hard;
    Button btn_rk;
    TableLayout tb_card;
    private long backKeyPressedTime = 0;

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

    public void onBackPressed(){
        if (System.currentTimeMillis() > backKeyPressedTime + 3000) {
            backKeyPressedTime = System.currentTimeMillis();
            Toast.makeText(this, "종료하려면 뒤로가기버튼을 한번더 누르세요", Toast.LENGTH_LONG).show();
            return;
        }
        // 마지막으로 뒤로 가기 버튼을 눌렀던 시간에 2.5초를 더해 현재 시간과 비교 후
        // 마지막으로 뒤로 가기 버튼을 눌렀던 시간이 2.5초가 지나지 않았으면 종료
        if (System.currentTimeMillis() <= backKeyPressedTime + 3000) {
            finish();
        }
    }
}