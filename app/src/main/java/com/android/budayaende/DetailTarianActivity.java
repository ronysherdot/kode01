package com.android.budayaende;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.tabs.TabLayout;

public class DetailTarianActivity extends AppCompatActivity {

    Toolbar toolbar;
    ViewPager viewPager;

    @Override
    public void onBackPressed() {
        Intent back = new Intent(DetailTarianActivity.this, BudayaActivity.class);
        startActivity(back);
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_tarian);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Tarian Tradisional");
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(DetailTarianActivity.this, BudayaActivity.class);
                startActivity(back);
                finish();
            }
        });

        viewPager = findViewById(R.id.viewPager);
        setupViewPage(viewPager);

        TabLayout tabLayout = findViewById(R.id.tablayout);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPage(ViewPager viewPager) {
        PagerAdapter pagerAdapter = new PageAdapter(getSupportFragmentManager());
        ((PageAdapter) pagerAdapter).addFragment(new Tarian1Activity(), getString(R.string.judulTarian1));
        ((PageAdapter) pagerAdapter).addFragment(new Tarian2Activity(), getString(R.string.judulTarian2));
        viewPager.setAdapter(pagerAdapter);
    }
}
