package com.android4dev.navigationview;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;

public class quiz extends AppCompatActivity {
    LinearLayout mudah;
    LinearLayout sulit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        Toolbar toolbar1 = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar1);
        toolbar1.setTitleTextColor(Color.WHITE);
        toolbar1.setSubtitleTextColor(Color.WHITE);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("QUIZ");
        mudah = (LinearLayout) findViewById(R.id.mudah);
        mudah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quiz.this.startActivity(new Intent(quiz.this, quiz_mudah_satu.class));
            }
        });

        sulit = (LinearLayout) findViewById(R.id.sulit);
        sulit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quiz.this.startActivity(new Intent(quiz.this, quiz_sulit_satu.class));
            }
        });
    }
}
