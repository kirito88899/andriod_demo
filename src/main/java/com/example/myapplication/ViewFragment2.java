package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.BinderThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;




public class ViewFragment2 extends Fragment   {


    private RecyclerView mrecyc;
    private Mydapter mydapter;
    private List<AppEntity>appEntityList;

    //随机数生成
    public static int RandMain(int Max, int Min)
    {
        int ran2 = (int) (Math.random()*(Max - Min)+ Min);
        return ran2;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.activity_recycler_view_demo_main3,container,false);
        mrecyc=view.findViewById(R.id.RecyclerView);
        initData();

        return view;
    }

    private void initData() {

        appEntityList = new ArrayList<AppEntity>();
        for (int i = 1; i <= 13; i++) {
            int s = RandMain(2, 0);
            int Size = RandMain(100, 1);
            int Down = RandMain(10, 1);
            AppEntity appEntityi = new AppEntity(i, "QQ" + i, s, Size + "MB", Down + "亿");

            appEntityList.add(appEntityi);
        }
        mydapter=new Mydapter(getActivity(),appEntityList);
        //设置布局管理器
        mrecyc.setLayoutManager(new LinearLayoutManager(getActivity()));
        //设置adapter
        mrecyc.setAdapter(mydapter);


    }

}
