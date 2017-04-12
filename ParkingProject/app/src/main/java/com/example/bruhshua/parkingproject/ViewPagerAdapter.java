package com.example.bruhshua.parkingproject;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.bruhshua.parkingproject.Fragments.ParkingMapFragment;

import java.util.ArrayList;

/**
 * Created by bruhshua on 4/11/17.
 */

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    private String Fragment[] = {"Map","Other"};


    public ViewPagerAdapter(FragmentManager fm) {

        super(fm);
    }


    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                ParkingMapFragment parkingMapFragment = ParkingMapFragment.newInstance();
                return parkingMapFragment;

            case 1:
//                ParkingMapFragment parkingMapFragment1 = ParkingMapFragment.newInstance();
//                return parkingMapFragment1;

            default:
                return null;
        }

    }

    @Override
    public CharSequence getPageTitle(int position) {
        return Fragment[position];
    }

    @Override
    public int getCount() {
        return Fragment.length;
    }
}
