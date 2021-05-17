package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.os.PersistableBundle;

import java.util.ArrayList;
import java.util.List;

public class HomeMainActivity3 extends AppCompatActivity {

    private Context context;
    private List<HomeList> apps=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_main3);

        context=this;

        //找到RecyclerView视图
        RecyclerView recyclerView=findViewById(R.id.relativeLayout_home);

        //指定布局控件
        //普通形式
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(context);
        recyclerView.setLayoutManager(linearLayoutManager);

        //2.自定义适配器(adapter)
        HomeAdater homeAdater=new HomeAdater();
        recyclerView.setAdapter(homeAdater);

        //3.数据添加
        initData();

        homeAdater.setData(apps);

    }
    //     模拟数据
    private void initData() {
        HomeList HomeList1 = new HomeList("中国", "微信");
        HomeList HomeList2 = new HomeList("中国", "作业帮");
        HomeList HomeList3 = new HomeList("中国", "抖音");
        HomeList HomeList4 = new HomeList("中国", "酷狗");
        HomeList HomeList5 = new HomeList("中国", "爱奇艺");
        HomeList HomeList6 = new HomeList("中国", "快手");

        apps.add(HomeList1);
        apps.add(HomeList2);
        apps.add(HomeList3);
        apps.add(HomeList4);
        apps.add(HomeList5);
        apps.add(HomeList6);
        }
    }
