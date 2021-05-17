package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewDemoMainActivity4 extends AppCompatActivity {

    private Context context;
    private List<Appbean>apps=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_demo_main4);

        context=this;

        //获取当前页面的recyclerview
        RecyclerView recyclerView=findViewById(R.id.RecyclerView);

        //开始设置显示布局
        GridLayoutManager gridLayoutManager=new GridLayoutManager(context,2);
        recyclerView.setLayoutManager(gridLayoutManager);

        //开始设置数据适配器
        Amydater amydater=new Amydater();
        recyclerView.setAdapter(amydater);

        //数据添加
        inintData();
        amydater.setData(apps);


    }

    private void inintData(){
        Appbean appbean=new Appbean("QQ","@drawable/back_img");
        Appbean appbean2=new Appbean("QQ1","@drawable/left");
        Appbean appbean3=new Appbean("QQ2","@drawable/left");
        Appbean appbean4=new Appbean("QQ3","@drawable/back_img");
        Appbean appbean5=new Appbean("QQ4","@drawable/left");
        Appbean appbean6=new Appbean("QQ5","@drawable/left");
        Appbean appbean7=new Appbean("QQ6","@drawable/left");

        apps.add(appbean);
        apps.add(appbean2);
        apps.add(appbean3);
        apps.add(appbean4);
        apps.add(appbean5);
        apps.add(appbean6);
        apps.add(appbean7);
    }
}