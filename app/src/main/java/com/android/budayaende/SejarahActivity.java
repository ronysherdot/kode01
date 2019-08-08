package com.android.budayaende;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ViewListener;
import com.uncopt.android.widget.text.justify.JustifiedTextView;

public class SejarahActivity extends AppCompatActivity {

    Toolbar toolbar;
    CarouselView carouselView;
    int[] carouselMenu = {
            R.drawable.sejarah1, R.drawable.sejarah2
    };

    JustifiedTextView txtSejarah1, txtSejarah2, txtSejarah3, txtSejarah4;

    @Override
    public void onBackPressed() {
        Intent back = new Intent(SejarahActivity.this, MenuActivity.class);
        startActivity(back);
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sejarah);

        txtSejarah1 = findViewById(R.id.txtSejarah1);
        txtSejarah2 = findViewById(R.id.txtSejarah2);
        txtSejarah3 = findViewById(R.id.txtSejarah3);

        carouselView = findViewById(R.id.carouselView);
        carouselView.setViewListener(viewListener);
        carouselView.setPageCount(carouselMenu.length);
        carouselView.setSlideInterval(4000);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Sejarah");
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(SejarahActivity.this, MenuActivity.class);
                startActivity(back);
                finish();
            }
        });
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
