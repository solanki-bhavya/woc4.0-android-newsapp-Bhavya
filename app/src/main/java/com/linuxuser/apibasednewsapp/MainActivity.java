package com.linuxuser.apibasednewsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    Toolbar topbar;
    TabLayout tabLayout;
    TabItem thome,tsports,thealth,tscience,tentertainment,ttechnology;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        topbar=findViewById(R.id.topbar);
        setSupportActionBar(topbar);
        tabLayout=findViewById(R.id.tablayout);

        thome=findViewById(R.id.home);
        tsports=findViewById(R.id.sports);
        thealth=findViewById(R.id.health);
        tscience=findViewById(R.id.science);
        tentertainment=findViewById(R.id.entertainment);
        ttechnology=findViewById(R.id.technology);

        ViewPager viewPager=findViewById(R.id.fragment_container);

        FragmentAdapter fragmentAdapter=new FragmentAdapter(getSupportFragmentManager(),6);
        viewPager.setAdapter(fragmentAdapter);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                if(tab.getPosition()>=0&&tab.getPosition()<6)
                    fragmentAdapter.notifyDataSetChanged();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
    }
}