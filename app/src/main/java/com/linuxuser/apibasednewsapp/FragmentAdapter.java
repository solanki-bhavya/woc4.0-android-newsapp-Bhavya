package com.linuxuser.apibasednewsapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class FragmentAdapter extends FragmentPagerAdapter {
    int tabnumber;
    public FragmentAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    public FragmentAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        tabnumber=behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:return new HomeFragment();
            case 1:return new SportsFragment();
            case 2:return new HealthFragment();
            case 3:return new ScienceFragment();
            case 4:return new EntertainmentFragment();
            case 5:return new TechnologyFragment();
            default:return new HomeFragment();
        }
    }

    @Override
    public int getCount() {
        return tabnumber;
    }
}
