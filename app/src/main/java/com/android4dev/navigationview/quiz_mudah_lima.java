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
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class quiz_mudah_lima extends AppCompatActivity {
    Button btn_next_mudah_lima;
    CheckBox cek_mudah_lima_a;
    CheckBox cek_mudah_lima_b;
    CheckBox cek_mudah_lima_c;
    CheckBox cek_mudah_lima_d;
    SharedPreferences sp;
    SharedPreferences.Editor spe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_mudah_lima);
        Toolbar toolbar1 = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar1);
        toolbar1.setTitleTextColor(Color.WHITE);
        toolbar1.setSubtitleTextColor(Color.WHITE);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("QUIZ KELIMA");
        sp = getSharedPreferences("skor5", 0);
        spe = sp.edit();
        cek_mudah_lima_a = (CheckBox) findViewById(R.id.cek_mudah_lima_a);
        cek_mudah_lima_b = (CheckBox) findViewById(R.id.cek_mudah_lima_b);
        cek_mudah_lima_c = (CheckBox) findViewById(R.id.cek_mudah_lima_c);
        cek_mudah_lima_d = (CheckBox) findViewById(R.id.cek_mudah_lima_d);
        cek_mudah_lima_a.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (cek_mudah_lima_a.isChecked()) {
                    cek_mudah_lima_b.setEnabled(false);
                    cek_mudah_lima_c.setEnabled(false);
                    cek_mudah_lima_d.setEnabled(false);
                    return;
                }
                cek_mudah_lima_b.setEnabled(true);
                cek_mudah_lima_c.setEnabled(true);
                cek_mudah_lima_d.setEnabled(true);
            }
        });
        cek_mudah_lima_b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (cek_mudah_lima_b.isChecked()) {
                    cek_mudah_lima_a.setEnabled(false);
                    cek_mudah_lima_c.setEnabled(false);
                    cek_mudah_lima_d.setEnabled(false);
                    return;
                }
                cek_mudah_lima_a.setEnabled(true);
                cek_mudah_lima_c.setEnabled(true);
                cek_mudah_lima_d.setEnabled(true);
            }
        });
        cek_mudah_lima_c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (cek_mudah_lima_c.isChecked()) {
                    cek_mudah_lima_b.setEnabled(false);
                    cek_mudah_lima_a.setEnabled(false);
                    cek_mudah_lima_d.setEnabled(false);
                    return;
                }
                cek_mudah_lima_b.setEnabled(true);
                cek_mudah_lima_a.setEnabled(true);
                cek_mudah_lima_d.setEnabled(true);
            }
        });
        cek_mudah_lima_d.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (cek_mudah_lima_d.isChecked()) {
                    cek_mudah_lima_b.setEnabled(false);
                    cek_mudah_lima_c.setEnabled(false);
                    cek_mudah_lima_a.setEnabled(false);
                    return;
                }
                cek_mudah_lima_b.setEnabled(true);
                cek_mudah_lima_c.setEnabled(true);
                cek_mudah_lima_a.setEnabled(true);
            }
        });
        btn_next_mudah_lima = (Button) findViewById(R.id.btn_next_mudah_lima);
        btn_next_mudah_lima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!cek_mudah_lima_a.isChecked() && !cek_mudah_lima_b.isChecked() && !cek_mudah_lima_c.isChecked() && !cek_mudah_lima_d.isChecked()) {
                    Toast.makeText(getApplicationContext(), "harap pilih jawaban terlebih dahulu", Toast.LENGTH_LONG).show();
                } else if (cek_mudah_lima_d.isChecked()) {
                    startActivity(new Intent(quiz_mudah_lima.this, quiz_mudah_hasil.class));
                    spe.putString("skor5", "20");
                    spe.commit();
                } else {
                    startActivity(new Intent(quiz_mudah_lima.this, quiz_mudah_hasil.class));
                    spe.putString("skor5", "0");
                    spe.commit();
                }
            }
        });
    }

    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if (item.getItemId() == android.R.id.home){
            onBackPressed();
            //return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        menu.findItem(R.id.action_settings).setVisible(false);
        return true;
    }
}
