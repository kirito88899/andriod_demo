package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.List;

public class ViewFragmentAdater extends FragmentPagerAdapter {
    private FragmentManager mfragmentManager;
    private List<Fragment> mlist;

    public ViewFragmentAdater(@NonNull FragmentManager fm, List<Fragment>mlist) {
        super(fm);
        this.mlist=mlist;
    }

    //显示几个页面
    @NonNull
    @Override
    public Fragment getItem(int position) {
        return mlist.get(position);
    }

    //获取总共页数
    @Override
    public int getCount() {
        return mlist.size();
    }
}
