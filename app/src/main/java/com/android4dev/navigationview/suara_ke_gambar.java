package com.android4dev.navigationview;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Locale;

public class suara_ke_gambar extends AppCompatActivity {
    private final int REQ_CODE_SPEECH_INPUT = 100;
    ImageView img;
    private TextView speakButton;
    private TextView voiceInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suara_ke_gambar);
        Toolbar toolbar1 = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar1);
        toolbar1.setTitleTextColor(Color.WHITE);
        toolbar1.setSubtitleTextColor(Color.WHITE);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("SUARA KE GAMBAR");
        voiceInput = (TextView) findViewById(R.id.voiceInput);
        speakButton = (TextView) findViewById(R.id.btnSpeak);
        img = (ImageView) findViewById(R.id.img);

        speakButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                askSpeechInput();
            }
        });

        voiceInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (suara_ke_gambar.this.voiceInput.getText().toString().equalsIgnoreCase("alif")) {
                    suara_ke_gambar.this.img.setImageResource(R.drawable.alif);
                } else if (suara_ke_gambar.this.voiceInput.getText().toString().equalsIgnoreCase("ain")) {
                    suara_ke_gambar.this.img.setImageResource(R.drawable.ain);
                } else if (suara_ke_gambar.this.voiceInput.getText().toString().equalsIgnoreCase("mbak")) {
                    suara_ke_gambar.this.img.setImageResource(R.drawable.ba);
                } else if (suara_ke_gambar.this.voiceInput.getText().toString().equalsIgnoreCase("dal")) {
                    suara_ke_gambar.this.img.setImageResource(R.drawable.dal);
                } else if (suara_ke_gambar.this.voiceInput.getText().toString().equalsIgnoreCase("dha")) {
                    suara_ke_gambar.this.img.setImageResource(R.drawable.dha);
                } else if (suara_ke_gambar.this.voiceInput.getText().toString().equalsIgnoreCase("dhad")) {
                    suara_ke_gambar.this.img.setImageResource(R.drawable.dhad);
                } else if (suara_ke_gambar.this.voiceInput.getText().toString().equalsIgnoreCase("fa")) {
                    suara_ke_gambar.this.img.setImageResource(R.drawable.fa);
                } else if (suara_ke_gambar.this.voiceInput.getText().toString().equalsIgnoreCase("goin")) {
                    suara_ke_gambar.this.img.setImageResource(R.drawable.goin);
                } else if (suara_ke_gambar.this.voiceInput.getText().toString().equalsIgnoreCase("hak")) {
                    suara_ke_gambar.this.img.setImageResource(R.drawable.hak);
                } else if (suara_ke_gambar.this.voiceInput.getText().toString().equalsIgnoreCase("hamzah")) {
                    suara_ke_gambar.this.img.setImageResource(R.drawable.hamzah);
                } else if (suara_ke_gambar.this.voiceInput.getText().toString().equalsIgnoreCase("ho")) {
                    suara_ke_gambar.this.img.setImageResource(R.drawable.ho);
                } else if (suara_ke_gambar.this.voiceInput.getText().toString().equalsIgnoreCase("jim")) {
                    suara_ke_gambar.this.img.setImageResource(R.drawable.jim);
                } else if (suara_ke_gambar.this.voiceInput.getText().toString().equalsIgnoreCase("kaf")) {
                    suara_ke_gambar.this.img.setImageResource(R.drawable.kaf);
                } else if (suara_ke_gambar.this.voiceInput.getText().toString().equalsIgnoreCase("lam")) {
                    suara_ke_gambar.this.img.setImageResource(R.drawable.lam);
                } else if (suara_ke_gambar.this.voiceInput.getText().toString().equalsIgnoreCase("mim")) {
                    suara_ke_gambar.this.img.setImageResource(R.drawable.mim);
                } else if (suara_ke_gambar.this.voiceInput.getText().toString().equalsIgnoreCase("nun")) {
                    suara_ke_gambar.this.img.setImageResource(R.drawable.nun);
                } else if (suara_ke_gambar.this.voiceInput.getText().toString().equalsIgnoreCase("kof")) {
                    suara_ke_gambar.this.img.setImageResource(R.drawable.qof);
                } else if (suara_ke_gambar.this.voiceInput.getText().toString().equalsIgnoreCase("rok")) {
                    suara_ke_gambar.this.img.setImageResource(R.drawable.ra);
                } else if (suara_ke_gambar.this.voiceInput.getText().toString().equalsIgnoreCase("sod")) {
                    suara_ke_gambar.this.img.setImageResource(R.drawable.shad);
                } else if (suara_ke_gambar.this.voiceInput.getText().toString().equalsIgnoreCase("sin")) {
                    suara_ke_gambar.this.img.setImageResource(R.drawable.sin);
                } else if (suara_ke_gambar.this.voiceInput.getText().toString().equalsIgnoreCase("tak")) {
                    suara_ke_gambar.this.img.setImageResource(R.drawable.ta);
                } else if (suara_ke_gambar.this.voiceInput.getText().toString().equalsIgnoreCase("tok")) {
                    suara_ke_gambar.this.img.setImageResource(R.drawable.to);
                } else if (suara_ke_gambar.this.voiceInput.getText().toString().equalsIgnoreCase("sa")) {
                    suara_ke_gambar.this.img.setImageResource(R.drawable.tsa);
                } else if (suara_ke_gambar.this.voiceInput.getText().toString().equalsIgnoreCase("wawu")) {
                    suara_ke_gambar.this.img.setImageResource(R.drawable.wawu);
                } else if (suara_ke_gambar.this.voiceInput.getText().toString().equalsIgnoreCase("za")) {
                    suara_ke_gambar.this.img.setImageResource(R.drawable.za);
                } else {
                    Toast.makeText(suara_ke_gambar.this.getApplicationContext(), "tidak ada harokat", Toast.LENGTH_LONG).show();
                    suara_ke_gambar.this.img.setImageResource(R.drawable.noimage);
                }
            }
        });
    }

    private void askSpeechInput() {
        Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
        intent.putExtra("android.speech.extra.LANGUAGE", new Locale("in", "in_ID"));
        intent.putExtra("android.speech.extra.PROMPT", "Hi speak something");
        try {
            startActivityForResult(intent, 100);
        } catch (ActivityNotFoundException e) {
        }
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case 100:
                if (resultCode == -1 && data != null) {
                    this.voiceInput.setText((CharSequence) data.getStringArrayListExtra("android.speech.extra.RESULTS").get(0));
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() != 16908332) {
            return super.onOptionsItemSelected(item);
        }
        onBackPressed();
        return true;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        menu.findItem(R.id.action_settings).setVisible(false);
        return true;
    }
}
