package com.android.budayaende;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;

public class UpacaraActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    public void onBackPressed() {
        Intent back = new Intent(UpacaraActivity.this, BudayaActivity.class);
        startActivity(back);
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upacara);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Upacara Adat");
        toolbar.setNavigationIcon(R.drawable.ic_event_available_24dp);
    }
}
