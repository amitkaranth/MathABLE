package com.amit.finaltarp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class shapes extends AppCompatActivity {
    String tabTitle[] = {"2D Shapes","3D Shapes"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shapes);

        TabLayout tl =  findViewById(R.id.tabLayout);
        ViewPager2 pager = findViewById(R.id.viewPager2);
        pager.setOffscreenPageLimit(2);
        pager.setAdapter(new Adapter(getSupportFragmentManager(),getLifecycle()));
        TabLayoutMediator tm = new TabLayoutMediator(tl,pager, true,
        (tab, position) -> {
            tab.setText(tabTitle[position]);
        });
        tm.attach();

    }
}