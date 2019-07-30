package com.android.budayaende;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BudayaActivity extends AppCompatActivity {

    Toolbar toolbar;
    CardView cardUpacara, cardTari, cardRumah, cardPakaian, cardMusik;

    @Override
    public void onBackPressed() {
        Intent back = new Intent(BudayaActivity.this, MenuActivity.class);
        startActivity(back);
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_budaya);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Menu Kebudayaan");
        toolbar.setNavigationIcon(R.drawable.ic_event_available_24dp);

        cardUpacara = findViewById(R.id.cardUpacara);
        cardTari = findViewById(R.id.cardTari);
        cardRumah = findViewById(R.id.cardRumah);
        cardPakaian = findViewById(R.id.cardPakaian);
        cardMusik = findViewById(R.id.cardMusik);

        cardUpacara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent upacara = new Intent(BudayaActivity.this, UpacaraActivity.class);
                startActivity(upacara);
                finish();
            }
        });

        cardTari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tari = new Intent(BudayaActivity.this, TarianActivity.class);
                startActivity(tari);
                finish();
            }
        });

        cardRumah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rumah = new Intent(BudayaActivity.this, RumahActivity.class);
                startActivity(rumah);
                finish();
            }
        });

        cardPakaian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pakaian = new Intent(BudayaActivity.this, PakaianActivity.class);
                startActivity(pakaian);
                finish();
            }
        });

        cardMusik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent musik = new Intent(BudayaActivity.this, MusikActivity.class);
                startActivity(musik);
                finish();
            }
        });
    }
}
