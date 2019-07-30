package com.android.budayaende;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ViewListener;

public class TarianActivity extends AppCompatActivity {

    Toolbar toolbar;
    CarouselView carouselView;
    int[] carouselMenu = {
            R.drawable.tarian1, R.drawable.tarian2
    };

    @Override
    public void onBackPressed() {
        Intent back = new Intent(TarianActivity.this, BudayaActivity.class);
        startActivity(back);
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarian);

        carouselView = findViewById(R.id.carouselView);
        carouselView.setViewListener(viewListener);
        carouselView.setPageCount(carouselMenu.length);
        carouselView.setSlideInterval(4000);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Tarian Adat");
        toolbar.setNavigationIcon(R.drawable.ic_event_available_24dp);
    }

    ViewListener viewListener = new ViewListener() {
        @Override
        public View setViewForPosition(int position) {
            View carouselSet = getLayoutInflater().inflate(R.layout.viewing, null);

            ImageView carouselImage = carouselSet.findViewById(R.id.carouselImage);
            carouselImage.setImageResource(carouselMenu[position]);
            carouselView.setIndicatorGravity(Gravity.CENTER_HORIZONTAL| Gravity.TOP);

            return carouselSet;
        }
    };
}
