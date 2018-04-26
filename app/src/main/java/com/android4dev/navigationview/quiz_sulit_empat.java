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

public class quiz_sulit_empat extends AppCompatActivity {
    Button btn_next_sulit_empat;
    CheckBox cek_sulit_empat_a;
    CheckBox cek_sulit_empat_b;
    CheckBox cek_sulit_empat_c;
    CheckBox cek_sulit_empat_d;
    SharedPreferences sp;
    SharedPreferences.Editor spe;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_sulit_empat);
        Toolbar toolbar1 = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar1);
        toolbar1.setTitleTextColor(Color.WHITE);
        toolbar1.setSubtitleTextColor(Color.WHITE);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("QUIZ KEEMPAT");
        sp = getSharedPreferences("skor4", 0);
        spe = sp.edit();
        cek_sulit_empat_a = (CheckBox) findViewById(R.id.cek_sulit_empat_a);
        cek_sulit_empat_b = (CheckBox) findViewById(R.id.cek_sulit_empat_b);
        cek_sulit_empat_c = (CheckBox) findViewById(R.id.cek_sulit_empat_c);
        cek_sulit_empat_d = (CheckBox) findViewById(R.id.cek_sulit_empat_d);
        cek_sulit_empat_a.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (cek_sulit_empat_a.isChecked()) {
                    cek_sulit_empat_b.setEnabled(false);
                    cek_sulit_empat_c.setEnabled(false);
                    cek_sulit_empat_d.setEnabled(false);
                    return;
                }
                cek_sulit_empat_b.setEnabled(true);
                cek_sulit_empat_c.setEnabled(true);
                cek_sulit_empat_d.setEnabled(true);
            }
        });
        cek_sulit_empat_b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (cek_sulit_empat_b.isChecked()) {
                    cek_sulit_empat_a.setEnabled(false);
                    cek_sulit_empat_c.setEnabled(false);
                    cek_sulit_empat_d.setEnabled(false);
                    return;
                }
                cek_sulit_empat_a.setEnabled(true);
                cek_sulit_empat_c.setEnabled(true);
                cek_sulit_empat_d.setEnabled(true);
            }
        });
        cek_sulit_empat_c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (cek_sulit_empat_c.isChecked()) {
                    cek_sulit_empat_b.setEnabled(false);
                    cek_sulit_empat_a.setEnabled(false);
                    cek_sulit_empat_d.setEnabled(false);
                    return;
                }
                cek_sulit_empat_b.setEnabled(true);
                cek_sulit_empat_a.setEnabled(true);
                cek_sulit_empat_d.setEnabled(true);
            }
        });
        cek_sulit_empat_d.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (cek_sulit_empat_d.isChecked()) {
                    cek_sulit_empat_b.setEnabled(false);
                    cek_sulit_empat_c.setEnabled(false);
                    cek_sulit_empat_a.setEnabled(false);
                    return;
                }
                cek_sulit_empat_b.setEnabled(true);
                cek_sulit_empat_c.setEnabled(true);
                cek_sulit_empat_a.setEnabled(true);
            }
        });
        btn_next_sulit_empat = (Button) findViewById(R.id.btn_next_empat_empat);
        btn_next_sulit_empat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!cek_sulit_empat_a.isChecked() && !cek_sulit_empat_b.isChecked() && !cek_sulit_empat_c.isChecked() && !cek_sulit_empat_d.isChecked()) {
                    Toast.makeText(getApplicationContext(), "harap pilih jawaban terlebih dahulu", Toast.LENGTH_LONG).show();
                } else if (cek_sulit_empat_a.isChecked()) {
                    startActivity(new Intent(quiz_sulit_empat.this, quiz_sulit_lima.class));
                    spe.putString("skor4", "20");
                    spe.commit();
                } else {
                    startActivity(new Intent(quiz_sulit_empat.this, quiz_sulit_lima.class));
                    spe.putString("skor4", "0");
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

