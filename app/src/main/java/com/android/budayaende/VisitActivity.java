package com.android.budayaende;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class VisitActivity extends AppCompatActivity {

    Toolbar toolbar;
    CardView cardVisit1, cardVisit2, cardVisit3;

    @Override
    public void onBackPressed() {
        Intent back = new Intent(VisitActivity.this, MenuActivity.class);
        startActivity(back);
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visit);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Visit");
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(VisitActivity.this, MenuActivity.class);
                startActivity(back);
                finish();
            }
        });

        cardVisit1 = findViewById(R.id.cardVisit1);
        cardVisit2 = findViewById(R.id.cardVisit2);
        cardVisit3 = findViewById(R.id.cardVisit3);

        cardVisit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(VisitActivity.this, Visit1Activity.class);
                startActivity(back);
                finish();
            }
        });

        cardVisit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(VisitActivity.this, Visit2Activity.class);
                startActivity(back);
                finish();
            }
        });

        cardVisit3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(VisitActivity.this, Visit3Activity.class);
                startActivity(back);
                finish();
            }
        });
    }
}
