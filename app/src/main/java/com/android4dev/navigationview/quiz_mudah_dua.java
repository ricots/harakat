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

public class quiz_mudah_dua extends AppCompatActivity {
    Button btn_next_mudah_dua;
    CheckBox cek_mudah_dua_a;
    CheckBox cek_mudah_dua_b;
    CheckBox cek_mudah_dua_c;
    CheckBox cek_mudah_dua_d;
    SharedPreferences sp;
    SharedPreferences.Editor spe;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_mudah_dua);
        Toolbar toolbar1 = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar1);
        toolbar1.setTitleTextColor(Color.WHITE);
        toolbar1.setSubtitleTextColor(Color.WHITE);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("QUIZ KEDUA");
        sp = getSharedPreferences("skor2", 0);
        spe = sp.edit();
        cek_mudah_dua_a = (CheckBox) findViewById(R.id.cek_mudah_dua_a);
        cek_mudah_dua_b = (CheckBox) findViewById(R.id.cek_mudah_dua_b);
        cek_mudah_dua_c = (CheckBox) findViewById(R.id.cek_mudah_dua_c);
        cek_mudah_dua_d = (CheckBox) findViewById(R.id.cek_mudah_dua_d);
        cek_mudah_dua_a.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (cek_mudah_dua_a.isChecked()) {
                    cek_mudah_dua_b.setEnabled(false);
                    cek_mudah_dua_c.setEnabled(false);
                    cek_mudah_dua_d.setEnabled(false);
                    return;
                }
                cek_mudah_dua_b.setEnabled(true);
                cek_mudah_dua_c.setEnabled(true);
                cek_mudah_dua_d.setEnabled(true);
            }
        });
        cek_mudah_dua_b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (cek_mudah_dua_b.isChecked()) {
                    cek_mudah_dua_a.setEnabled(false);
                    cek_mudah_dua_c.setEnabled(false);
                    cek_mudah_dua_d.setEnabled(false);
                    return;
                }
                cek_mudah_dua_a.setEnabled(true);
                cek_mudah_dua_c.setEnabled(true);
                cek_mudah_dua_d.setEnabled(true);
            }
        });
        cek_mudah_dua_c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (cek_mudah_dua_c.isChecked()) {
                    cek_mudah_dua_b.setEnabled(false);
                    cek_mudah_dua_a.setEnabled(false);
                    cek_mudah_dua_d.setEnabled(false);
                    return;
                }
                cek_mudah_dua_b.setEnabled(true);
                cek_mudah_dua_a.setEnabled(true);
                cek_mudah_dua_d.setEnabled(true);
            }
        });
        cek_mudah_dua_d.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (cek_mudah_dua_d.isChecked()) {
                    cek_mudah_dua_b.setEnabled(false);
                    cek_mudah_dua_c.setEnabled(false);
                    cek_mudah_dua_a.setEnabled(false);
                    return;
                }
                cek_mudah_dua_b.setEnabled(true);
                cek_mudah_dua_c.setEnabled(true);
                cek_mudah_dua_a.setEnabled(true);
            }
        });

        btn_next_mudah_dua = (Button) findViewById(R.id.btn_next_mudah_dua);
        btn_next_mudah_dua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!cek_mudah_dua_a.isChecked() && !cek_mudah_dua_b.isChecked() && !cek_mudah_dua_c.isChecked() && !cek_mudah_dua_d.isChecked()) {
                    Toast.makeText(getApplicationContext(), "harap pilih jawaban terlebih dahulu", Toast.LENGTH_LONG).show();
                } else if (cek_mudah_dua_c.isChecked()) {
                    startActivity(new Intent(quiz_mudah_dua.this, quiz_mudah_tiga.class));
                    spe.putString("skor2", "20");
                    spe.commit();
                } else {
                    startActivity(new Intent(quiz_mudah_dua.this, quiz_mudah_tiga.class));
                    spe.putString("skor2", "0");
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
