package com.android.budayaende;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    Toolbar toolbar;
    CardView cardSejarah, cardVisit, cardKebudayaan, cardGaleri, cardTentang;

    @Override
    public void onBackPressed() {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert
                .setMessage("Apakah anda mau menutup Aplikasi ?")
                .setCancelable(false)
                .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        MenuActivity.this.finish();
                    }
                })
                .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
        AlertDialog alertDialog = alert.create();
        alertDialog.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        cardSejarah = findViewById(R.id.cardSejarah);
        cardVisit = findViewById(R.id.cardVisit);
        cardKebudayaan = findViewById(R.id.cardKebudayaan);
        cardGaleri = findViewById(R.id.cardGaleri);
        cardTentang = findViewById(R.id.cardTentang);

        cardSejarah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sejarah = new Intent(MenuActivity.this, SejarahActivity.class);
                startActivity(sejarah);
                finish();
            }
        });

        cardVisit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent visit = new Intent(MenuActivity.this, VisitActivity.class);
                startActivity(visit);
                finish();
            }
        });

        cardKebudayaan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kebudayaan = new Intent(MenuActivity.this, BudayaActivity.class);
                startActivity(kebudayaan);
                finish();
            }
        });

        cardGaleri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent galeri = new Intent(MenuActivity.this, GaleriActivity.class);
                startActivity(galeri);
                finish();
            }
        });

        cardTentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tentang = new Intent(MenuActivity.this, AboutActivity.class);
                startActivity(tentang);
                finish();
            }
        });

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Kebudayaan Ende");
        toolbar.setNavigationIcon(R.drawable.ic_event_available_24dp);
    }
}
