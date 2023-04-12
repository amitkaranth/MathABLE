package com.amit.finaltarp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

class Adapter extends FragmentStateAdapter {

    public Adapter(FragmentManager fragmentManager,Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0: return new Shape2dFragment();
            case 1: return new Shape3dFragment();

        }
        return new Shape2dFragment();
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
