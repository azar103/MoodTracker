package com.zarrouk.anis.moodtracker.Views;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.zarrouk.anis.moodtracker.Controllers.Fragments.disapointFragment;
import com.zarrouk.anis.moodtracker.Controllers.Fragments.happyFragment;
import com.zarrouk.anis.moodtracker.Controllers.Fragments.normalFragment;
import com.zarrouk.anis.moodtracker.Controllers.Fragments.sadFragment;
import com.zarrouk.anis.moodtracker.Controllers.Fragments.veryHappyFragment;

/**
 * Created by Anis Zarrouk on 07/08/2019
 */
public class MyAdapter extends FragmentPagerAdapter {
    public MyAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new sadFragment();
            case 1:
                return  new disapointFragment();
            case 2:
                return  new normalFragment();
            case 3:
                return  new happyFragment();
            case 4:
                return new veryHappyFragment();
            default:
                return  null;
        }

    }

    @Override
    public int getCount() {
        return (5);
    }
}
