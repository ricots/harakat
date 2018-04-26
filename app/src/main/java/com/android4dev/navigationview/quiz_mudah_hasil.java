package com.android4dev.navigationview;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class quiz_mudah_hasil extends AppCompatActivity {
    TextView hasil_skor_mudah;
    TextView jwb_mudah1;
    TextView jwb_mudah2;
    TextView jwb_mudah3;
    TextView jwb_mudah4;
    TextView jwb_mudah5;
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
    Button btn_finis_mudah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_mudah_hasil);
        Toolbar toolbar1 = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar1);
        toolbar1.setTitleTextColor(Color.WHITE);
        toolbar1.setSubtitleTextColor(Color.WHITE);
        getSupportActionBar().setTitle("HASIL");
        hasil_skor_mudah = (TextView) findViewById(R.id.hasil_skor_mudah);
        jwb_mudah2 = (TextView) findViewById(R.id.jwb_mudah2);
        jwb_mudah1 = (TextView) findViewById(R.id.jwb_mudah1);
        jwb_mudah3 = (TextView) findViewById(R.id.jwb_mudah3);
        jwb_mudah4 = (TextView) findViewById(R.id.jwb_mudah4);
        jwb_mudah5 = (TextView) findViewById(R.id.jwb_mudah5);
        
        sp = getSharedPreferences("skor1", 0);
        spe = sp.edit();
        jwb_mudah1.setText(sp.getString("skor1", ""));

        sp1 = getSharedPreferences("skor2", 0);
        spe1 = sp1.edit();
        jwb_mudah2.setText(sp1.getString("skor2", ""));

        sp2 = getSharedPreferences("skor3", 0);
        spe2 = sp2.edit();
        jwb_mudah3.setText(sp2.getString("skor3", ""));

        sp3 = getSharedPreferences("skor4", 0);
        spe3 = sp3.edit();
        jwb_mudah4.setText(sp3.getString("skor4", ""));

        sp4 = getSharedPreferences("skor5", 0);
        spe4 = sp4.edit();
        jwb_mudah5.setText(sp4.getString("skor5", ""));
        soal1 = Integer.parseInt(jwb_mudah1.getText().toString());
        soal2 = Integer.parseInt(jwb_mudah2.getText().toString());
        soal3 = Integer.parseInt(jwb_mudah3.getText().toString());
        soal4 = Integer.parseInt(jwb_mudah4.getText().toString());
        soal5 = Integer.parseInt(jwb_mudah5.getText().toString());
        total = soal1 + soal2 + soal3 + soal4 + soal5;
        hasil_skor_mudah.setText("" + total);

        btn_finis_mudah = (Button) findViewById(R.id.btn_finis_mudah);
        btn_finis_mudah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(quiz_mudah_hasil.this, quiz.class));
            }
        });
    }

//    public void onBackPressed() {
//        super.onBackPressed();
//    }
//
//    public boolean onOptionsItemSelected(MenuItem item) {
//        if (item.getItemId() != 16908332) {
//            return super.onOptionsItemSelected(item);
//        }
//        onBackPressed();
//        return true;
//    }
//
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        menu.findItem(R.id.action_settings).setVisible(false);
//        return true;
//    }
}
