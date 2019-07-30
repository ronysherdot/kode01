package com.android.budayaende;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class KebudayaanActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    Toolbar toolbar;

    @Override
    public void onBackPressed() {
        Intent back = new Intent(KebudayaanActivity.this, MenuActivity.class);
        startActivity(back);
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kebudayaan);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Aneka Ragam Kebudayaan Ende");

//        loadFragment(new UpacaraActivity());
//        bottomNavigationView = findViewById(R.id.bottomNavigation);
//        bottomNavigationView.setOnNavigationItemSelectedListener(this);
    }

//    private boolean loadFragment(Fragment fragment){
//        if (fragment != null) {
//            getSupportFragmentManager().beginTransaction()
//                    .replace(R.id.contentKebudayaan, fragment)
//                    .commit();
//            return true;
//        }
//        return false;
//    }
//
//    @Override
//    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//        Fragment fragment = null;
//        switch (item.getItemId()){
//            case R.id.menuUpacara:
//                fragment = new UpacaraActivity();
//                break;
//            case R.id.menuTarian:
//                fragment = new TarianActivity();
//                break;
//            case R.id.menuRumah:
//                fragment = new RumahActivity();
//                break;
//            case R.id.menuPakaian:
//                fragment = new PakaianActivity();
//                break;
//            case R.id.menuMusik:
//                fragment = new MusikActivity();
//                break;
//        }
//        return loadFragment(fragment);
//    }
}
