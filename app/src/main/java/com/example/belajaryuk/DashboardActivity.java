package com.example.belajaryuk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class DashboardActivity extends AppCompatActivity implements View.OnClickListener {
    ImageButton imgMtk, imgFisika, imgSejarah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        getSupportActionBar().setTitle("Dashboard");
        imgMtk = (ImageButton) findViewById(R.id.img_mtk);
        imgMtk.setOnClickListener(this);

        imgFisika = (ImageButton) findViewById(R.id.img_fisika);
        imgFisika.setOnClickListener(this);

        imgSejarah = (ImageButton) findViewById(R.id.img_sejarah);
        imgSejarah.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.img_mtk:
                Intent intentMtk = new Intent(DashboardActivity.this, MtkActivity.class);
                startActivity(intentMtk);
                break;
            case R.id.img_fisika:
                Intent intentFisika = new Intent(DashboardActivity.this, FisikaActivity.class);
                startActivity(intentFisika);
                break;
            case R.id.img_sejarah:
                Intent intentsejarah = new Intent(DashboardActivity.this, SejarahActivity.class);
                startActivity(intentsejarah);
                break;
        }

    }
}
