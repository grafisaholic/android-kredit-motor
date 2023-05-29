package com.example.a1fo_khabiburrokhman_kreditmotor.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.a1fo_khabiburrokhman_kreditmotor.R;
import com.example.a1fo_khabiburrokhman_kreditmotor.ui.about.AboutFragment;
import com.example.a1fo_khabiburrokhman_kreditmotor.ui.home.HomeFragment;
import com.example.a1fo_khabiburrokhman_kreditmotor.ui.transaksi.TransaksiFragment;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2, R.string.tab_text_3};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return HomeFragment.newInstance("","");
        }else if (position == 1) {
            return TransaksiFragment.newInstance("","");
        }else {
            return AboutFragment.newInstance("","");
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return TAB_TITLES.length;
    }
}