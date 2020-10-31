package com.example.homework1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class RankingActivity extends AppCompatActivity {

    private Long time;
    private long backKeyPressedTime = 0;
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

        Intent intent = getIntent();
        time = intent.getExtras().getLong("Time");

        tv_etime1.setText(time.toString());
    }

    public void onBackPressed(){
        if (System.currentTimeMillis() > backKeyPressedTime + 3000) {
            backKeyPressedTime = System.currentTimeMillis();
            Toast.makeText(this, "홈으로 가시겠습니까?", Toast.LENGTH_LONG).show();
            return;
        }
        if (System.currentTimeMillis() <= backKeyPressedTime + 3000) {
            finish();
            startActivity(new Intent(RankingActivity.this, MainActivity.class));
        }
    }
}