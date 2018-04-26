package com.android4dev.navigationview;

import android.graphics.Color;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Locale;

public class gambar_ke_suara extends AppCompatActivity {
    TextView a_in;
    LinearLayout ain;
    TextView alf;
    LinearLayout alif;
    TextView b_a;
    LinearLayout ba;
    TextView d_al;
    TextView d_zal;
    LinearLayout dal;
    LinearLayout dzal;
    TextView f_a;
    LinearLayout fa;
    TextView g_hoin;
    LinearLayout ghoin;
    TextView h_a;
    TextView h_ak;
    TextView h_ok;
    LinearLayout ha;
    LinearLayout hak;
    LinearLayout hok;
    TextView j_im;
    LinearLayout jim;
    TextView k_af;
    TextView k_of;
    LinearLayout kaf;
    LinearLayout kof;
    TextView l_am;
    LinearLayout lam;
    TextView m_im;
    LinearLayout mim;
    TextView n_un;
    LinearLayout nun;
    TextView r_a;
    LinearLayout ra;
    TextView s_ad;
    TextView s_in;
    TextView s_yin;
    LinearLayout sad;
    LinearLayout sin;
    LinearLayout syin;
    TextToSpeech t1;
    TextView t_a;
    TextView t_ak;
    TextView t_sa;
    LinearLayout ta;
    LinearLayout tak;
    LinearLayout tsa;
    TextView w_awu;
    LinearLayout wawu;
    TextView y_a;
    LinearLayout ya;
    TextView z_a;
    LinearLayout za;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gambar_ke_suara);
        Toolbar toolbar1 = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar1);
        toolbar1.setTitleTextColor(Color.WHITE);
        toolbar1.setSubtitleTextColor(Color.WHITE);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("PEMBELAJARAN HIJAIYAH");
        alf = (TextView) findViewById(R.id.alf);
        b_a = (TextView) findViewById(R.id.b_a);
        t_a = (TextView) findViewById(R.id.t_a);
        t_sa = (TextView) findViewById(R.id.t_sa);
        j_im = (TextView) findViewById(R.id.j_im);
        h_a = (TextView) findViewById(R.id.h_a);
        h_ok = (TextView) findViewById(R.id.h_ok);
        d_al = (TextView) findViewById(R.id.d_al);
        d_zal = (TextView) findViewById(R.id.d_zal);
        r_a = (TextView) findViewById(R.id.r_a);
        z_a = (TextView) findViewById(R.id.z_a);
        s_in = (TextView) findViewById(R.id.s_in);
        s_yin = (TextView) findViewById(R.id.s_yin);
        s_ad = (TextView) findViewById(R.id.s_ad);
        t_ak = (TextView) findViewById(R.id.t_ak);
        a_in = (TextView) findViewById(R.id.a_in);
        g_hoin = (TextView) findViewById(R.id.g_hoin);
        f_a = (TextView) findViewById(R.id.f_a);
        k_of = (TextView) findViewById(R.id.k_af);
        k_af = (TextView) findViewById(R.id.k_af);
        l_am = (TextView) findViewById(R.id.l_am);
        m_im = (TextView) findViewById(R.id.m_im);
        n_un = (TextView) findViewById(R.id.n_un);
        h_ak = (TextView) findViewById(R.id.h_ak);
        w_awu = (TextView) findViewById(R.id.w_awu);
        y_a = (TextView) findViewById(R.id.y_a);
        alif = (LinearLayout) findViewById(R.id.alif);
        ba = (LinearLayout) findViewById(R.id.ba);
        ba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = b_a.getText().toString();
                if (text == null || "".equals(text)) {
                    gambar_ke_suara.this.t1.speak("Content not available", 0, null);
                    return;
                }
                t1.speak(text, 0, null);
            }
        });
        ta = (LinearLayout) findViewById(R.id.ta);
        ta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = t_a.getText().toString();
                if (text == null || "".equals(text)) {
                    gambar_ke_suara.this.t1.speak("Content not available", 0, null);
                    return;
                }
                t1.speak(text, 0, null);
            }
        });
        tsa = (LinearLayout) findViewById(R.id.tsa);
        tsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = t_sa.getText().toString();
                if (text == null || "".equals(text)) {
                    gambar_ke_suara.this.t1.speak("Content not available", 0, null);
                    return;
                }
                t1.speak(text, 0, null);
            }
        });
        jim = (LinearLayout) findViewById(R.id.jim);
        jim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = j_im.getText().toString();
                if (text == null || "".equals(text)) {
                    gambar_ke_suara.this.t1.speak("Content not available", 0, null);
                    return;
                }
                t1.speak(text, 0, null);
            }
        });
        hok = (LinearLayout) findViewById(R.id.hok);
        hok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = h_ok.getText().toString();
                if (text == null || "".equals(text)) {
                    gambar_ke_suara.this.t1.speak("Content not available", 0, null);
                    return;
                }
                t1.speak(text, 0, null);
            }
        });
        ha = (LinearLayout) findViewById(R.id.ha);
        ha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = h_a.getText().toString();
                if (text == null || "".equals(text)) {
                    gambar_ke_suara.this.t1.speak("Content not available", 0, null);
                    return;
                }
                t1.speak(text, 0, null);
            }
        });
        dzal = (LinearLayout) findViewById(R.id.dzal);
        dzal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = d_zal.getText().toString();
                if (text == null || "".equals(text)) {
                    gambar_ke_suara.this.t1.speak("Content not available", 0, null);
                    return;
                }
                t1.speak(text, 0, null);
            }
        });
        dal = (LinearLayout) findViewById(R.id.dal);
        dal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = d_al.getText().toString();
                if (text == null || "".equals(text)) {
                    gambar_ke_suara.this.t1.speak("Content not available", 0, null);
                    return;
                }
                t1.speak(text, 0, null);
            }
        });
        ra = (LinearLayout) findViewById(R.id.ra);

        ra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = r_a.getText().toString();
                if (text == null || "".equals(text)) {
                    gambar_ke_suara.this.t1.speak("Content not available", 0, null);
                    return;
                }
                t1.speak(text, 0, null);
            }
        });
        alif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = alf.getText().toString();
                if (text == null || "".equals(text)) {
                    gambar_ke_suara.this.t1.speak("Content not available", 0, null);
                    return;
                }
                gambar_ke_suara.this.t1.speak(text, 0, null);
            }
        });

        this.syin = (LinearLayout) findViewById(R.id.syin);
        this.syin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String text = gambar_ke_suara.this.s_yin.getText().toString();
                if (text == null || "".equals(text)) {
                    gambar_ke_suara.this.t1.speak("Content not available", 0, null);
                    return;
                }
                gambar_ke_suara.this.t1.speak(text, 0, null);
            }
        });
        this.sin = (LinearLayout) findViewById(R.id.sin);
        this.sin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String text = gambar_ke_suara.this.s_in.getText().toString();
                if (text == null || "".equals(text)) {
                    gambar_ke_suara.this.t1.speak("Content not available", 0, null);
                    return;
                }
                gambar_ke_suara.this.t1.speak(text, 0, null);
            }
        });
        this.sad = (LinearLayout) findViewById(R.id.sad);
        this.sad.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String text = gambar_ke_suara.this.s_ad.getText().toString();
                if (text == null || "".equals(text)) {
                    gambar_ke_suara.this.t1.speak("Content not available", 0, null);
                    return;
                }
                gambar_ke_suara.this.t1.speak(text, 0, null);
            }
        });
        this.tak = (LinearLayout) findViewById(R.id.tak);
        this.tak.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String text = gambar_ke_suara.this.t_ak.getText().toString();
                if (text == null || "".equals(text)) {
                    gambar_ke_suara.this.t1.speak("Content not available", 0, null);
                    return;
                }
                gambar_ke_suara.this.t1.speak(text, 0, null);
            }
        });
        this.za = (LinearLayout) findViewById(R.id.za);
        this.za.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String text = gambar_ke_suara.this.z_a.getText().toString();
                if (text == null || "".equals(text)) {
                    gambar_ke_suara.this.t1.speak("Content not available", 0, null);
                    return;
                }
                gambar_ke_suara.this.t1.speak(text, 0, null);
            }
        });
        this.ain = (LinearLayout) findViewById(R.id.ain);
        this.ain.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String text = gambar_ke_suara.this.a_in.getText().toString();
                if (text == null || "".equals(text)) {
                    gambar_ke_suara.this.t1.speak("Content not available", 0, null);
                    return;
                }
                gambar_ke_suara.this.t1.speak(text, 0, null);
            }
        });
        this.ghoin = (LinearLayout) findViewById(R.id.ghoin);
        this.ghoin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String text = gambar_ke_suara.this.g_hoin.getText().toString();
                if (text == null || "".equals(text)) {
                    gambar_ke_suara.this.t1.speak("Content not available", 0, null);
                    return;
                }
                gambar_ke_suara.this.t1.speak(text, 0, null);
            }
        });
        this.fa = (LinearLayout) findViewById(R.id.fa);
        this.fa.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String text = gambar_ke_suara.this.f_a.getText().toString();
                if (text == null || "".equals(text)) {
                    gambar_ke_suara.this.t1.speak("Content not available", 0, null);
                    return;
                }
                gambar_ke_suara.this.t1.speak(text, 0, null);
            }
        });
        this.kof = (LinearLayout) findViewById(R.id.kaf);
        this.kof.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String text = gambar_ke_suara.this.k_of.getText().toString();
                if (text == null || "".equals(text)) {
                    gambar_ke_suara.this.t1.speak("Content not available", 0, null);
                    return;
                }
                gambar_ke_suara.this.t1.speak(text, 0, null);
            }
        });
        this.kaf = (LinearLayout) findViewById(R.id.kaf);
        this.kaf.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String text = gambar_ke_suara.this.k_af.getText().toString();
                if (text == null || "".equals(text)) {
                    gambar_ke_suara.this.t1.speak("Content not available", 0, null);
                    return;
                }
                gambar_ke_suara.this.t1.speak(text, 0, null);
            }
        });
        this.lam = (LinearLayout) findViewById(R.id.lam);
        this.lam.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String text = gambar_ke_suara.this.l_am.getText().toString();
                if (text == null || "".equals(text)) {
                    gambar_ke_suara.this.t1.speak("Content not available", 0, null);
                    return;
                }
                gambar_ke_suara.this.t1.speak(text, 0, null);
            }
        });
        this.mim = (LinearLayout) findViewById(R.id.mim);
        this.mim.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String text = gambar_ke_suara.this.m_im.getText().toString();
                if (text == null || "".equals(text)) {
                    gambar_ke_suara.this.t1.speak("Content not available", 0, null);
                    return;
                }
                gambar_ke_suara.this.t1.speak(text, 0, null);
            }
        });
        this.nun = (LinearLayout) findViewById(R.id.nun);
        this.nun.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String text = gambar_ke_suara.this.n_un.getText().toString();
                if (text == null || "".equals(text)) {
                    gambar_ke_suara.this.t1.speak("Content not available", 0, null);
                    return;
                }
                gambar_ke_suara.this.t1.speak(text, 0, null);
            }
        });
        this.hak = (LinearLayout) findViewById(R.id.hak);
        this.hak.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String text = gambar_ke_suara.this.h_ak.getText().toString();
                if (text == null || "".equals(text)) {
                    gambar_ke_suara.this.t1.speak("Content not available", 0, null);
                    return;
                }
                gambar_ke_suara.this.t1.speak(text, 0, null);
            }
        });
        this.wawu = (LinearLayout) findViewById(R.id.wawu);
        this.wawu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String text = gambar_ke_suara.this.w_awu.getText().toString();
                if (text == null || "".equals(text)) {
                    gambar_ke_suara.this.t1.speak("Content not available", 0, null);
                    return;
                }
                gambar_ke_suara.this.t1.speak(text, 0, null);
            }
        });
        this.ya = (LinearLayout) findViewById(R.id.ya);
        this.ya.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String text = gambar_ke_suara.this.y_a.getText().toString();
                if (text == null || "".equals(text)) {
                    gambar_ke_suara.this.t1.speak("Content not available", 0, null);
                    return;
                }
                gambar_ke_suara.this.t1.speak(text, 0, null);
            }
        });

        t1 = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            public void onInit(int status) {
                if (status == 0) {
                    int result = gambar_ke_suara.this.t1.setLanguage(new Locale("in", "in_ID"));
                    if (result == -1 || result == -2) {
                        Log.e("error", "This Language is not supported");
                        return;
                    }
                    return;
                }
                Log.e("error", "Initilization Failed!");
            }
        });
    }

    protected void onPause() {
        if (this.t1 != null) {
            this.t1.stop();
            this.t1.shutdown();
        }
        super.onPause();
    }

    private void ConvertTextToSpeech() {
        String text = this.alf.getText().toString();
        if (text == null || "".equals(text)) {
            this.t1.speak("Content not available", 0, null);
            return;
        }
        this.t1.speak(text, 0, null);
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
