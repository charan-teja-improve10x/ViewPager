package com.example.viewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private ViewPager2 whatsappViewPager;
    private WhatsappViewPagerAdapter whatsappViewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        createAdapter();
        connectAdapter();
    }

    private void connectAdapter() {
        whatsappViewPager.setAdapter(whatsappViewPagerAdapter);
    }

    private void createAdapter() {
        whatsappViewPagerAdapter = new WhatsappViewPagerAdapter(this);
    }

    private void initViews() {
        whatsappViewPager = findViewById(R.id.whatsapp_vp);
    }
}