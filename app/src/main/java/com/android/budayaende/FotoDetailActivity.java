package com.android.budayaende;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class FotoDetailActivity extends AppCompatActivity {

    Toolbar toolbar;
    ImageView imageView;
    TextView txtKeterangan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foto_detail);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Detail Foto");

        imageView = findViewById(R.id.imageDetail);
        txtKeterangan = findViewById(R.id.txtKeterangan);

        Intent intent = getIntent();
        imageView.setImageResource(intent.getIntExtra("image",0));
        txtKeterangan.setText(intent.getIntExtra("keterangan",0));
    }
}
