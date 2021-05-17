package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ViewFragment extends Fragment {
    private RecyclerView recyclerView;
    private List<HomeList> homeLists=new ArrayList<>();
    private HomeAdater homeAdater;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.activity_home_main3,container,false);
        recyclerView=view.findViewById(R.id.relativeLayout_home);

        initData();
        return view;

    }

    private void initData() {
        HomeList homeLists1 = new HomeList("中国", "微信");
        HomeList homeLists2 = new HomeList("中国", "作业帮");
        HomeList homeLists3 = new HomeList("中国", "抖音");
        HomeList homeLists4 = new HomeList("中国", "酷狗");
        HomeList homeLists5 = new HomeList("中国", "爱奇艺");
        HomeList homeLists6 = new HomeList("中国", "快手");

        homeLists.add(homeLists1);
        homeLists.add(homeLists2);
        homeLists.add(homeLists3);
        homeLists.add(homeLists4);
        homeLists.add(homeLists5);
        homeLists.add(homeLists6);


        homeAdater=new HomeAdater(getActivity(),homeLists);
        //设置布局管理器
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        //设置adapter
        recyclerView.setAdapter(homeAdater);

    }
}
