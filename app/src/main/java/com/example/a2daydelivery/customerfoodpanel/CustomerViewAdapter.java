package com.example.a2daydelivery.customerfoodpanel;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class CustomerViewAdapter extends FragmentStatePagerAdapter {
    public CustomerViewAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);

    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new CustomerHomeFragment();
            case 1:
                return new CustomerCartFragmnet();
            case 2:
                return new CustomerOrdersFragment();
            case 3:
                return new CustomerProfileFragment();
            default:
                return new CustomerHomeFragment();
        }

    }

    @Override
    public int getCount() {
        return 4;
    }

}
