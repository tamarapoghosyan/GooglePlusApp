package com.example.lenovo.googleplusapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by LENOVO on 17.05.2017.
 */
public class MyViewPagerAdapter extends FragmentStatePagerAdapter {

    public MyViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return Fragment5.newInstance("aaaaa");
            case 1:
                return Fragment6.newInstance("bbbbb");
            case 2:
                return Fragment7.newInstance("gggggg");
                   }

        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
