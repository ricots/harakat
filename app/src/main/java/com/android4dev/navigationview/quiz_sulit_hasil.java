package com.android4dev.navigationview;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class quiz_sulit_hasil extends AppCompatActivity {
    TextView hasil_skor_sulit;
    TextView jwb_sulit1;
    TextView jwb_sulit2;
    TextView jwb_sulit3;
    TextView jwb_sulit4;
    TextView jwb_sulit5;
    int soal1;
    int soal2;
    int soal3;
    int soal4;
    int soal5;
    SharedPreferences sp;
    SharedPreferences sp1;
    SharedPreferences sp2;
    SharedPreferences sp3;
    SharedPreferences sp4;
    SharedPreferences.Editor spe;
    SharedPreferences.Editor spe1;
    SharedPreferences.Editor spe2;
    SharedPreferences.Editor spe3;
    SharedPreferences.Editor spe4;
    int total;
    Button btn_finis_sulit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_sulit_hasil);
        Toolbar toolbar1 = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar1);
        toolbar1.setTitleTextColor(Color.WHITE);
        toolbar1.setSubtitleTextColor(Color.WHITE);
        getSupportActionBar().setTitle("HASIL");
        hasil_skor_sulit = (TextView) findViewById(R.id.hasil_skor_sulit);
        jwb_sulit2 = (TextView) findViewById(R.id.jwb_sulit2);
        jwb_sulit1 = (TextView) findViewById(R.id.jwb_sulit1);
        jwb_sulit3 = (TextView) findViewById(R.id.jwb_sulit3);
        jwb_sulit4 = (TextView) findViewById(R.id.jwb_sulit4);
        jwb_sulit5 = (TextView) findViewById(R.id.jwb_sulit5);

        sp = getSharedPreferences("skor1", 0);
        spe = sp.edit();
        jwb_sulit1.setText(sp.getString("skor1", ""));

        sp1 = getSharedPreferences("skor2", 0);
        spe1 = sp1.edit();
        jwb_sulit2.setText(sp1.getString("skor2", ""));

        sp2 = getSharedPreferences("skor3", 0);
        spe2 = sp2.edit();
        jwb_sulit3.setText(sp2.getString("skor3", ""));

        sp3 = getSharedPreferences("skor4", 0);
        spe3 = sp3.edit();
        jwb_sulit4.setText(sp3.getString("skor4", ""));

        sp4 = getSharedPreferences("skor5", 0);
        spe4 = sp4.edit();
        jwb_sulit5.setText(sp4.getString("skor5", ""));
        soal1 = Integer.parseInt(jwb_sulit1.getText().toString());
        soal2 = Integer.parseInt(jwb_sulit2.getText().toString());
        soal3 = Integer.parseInt(jwb_sulit3.getText().toString());
        soal4 = Integer.parseInt(jwb_sulit4.getText().toString());
        soal5 = Integer.parseInt(jwb_sulit5.getText().toString());
        total = soal1 + soal2 + soal3 + soal4 + soal5;
        hasil_skor_sulit.setText("" + total);

        btn_finis_sulit = (Button) findViewById(R.id.btn_finis_sulit);
        btn_finis_sulit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(quiz_sulit_hasil.this, quiz.class));
            }
        });
    }
}
