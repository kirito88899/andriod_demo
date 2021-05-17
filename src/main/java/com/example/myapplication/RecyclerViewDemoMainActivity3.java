package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewDemoMainActivity3 extends AppCompatActivity {


    //随机数生成
    public static int RandMain(int Max, int Min)
    {
        int ran2 = (int) (Math.random()*(Max - Min)+ Min);
        return ran2;
    }


    //上下文
    private Context context;
    private List<AppEntity>apps=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_demo_main3);

        context=this;
        //找到RecyclerVier控件
        RecyclerView recyclerview=findViewById(R.id.RecyclerView);
        //1.指定布局管理器
        //普通形式
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(context);
        recyclerview.setLayoutManager(linearLayoutManager);

        //网格形式
//        GridLayoutManager gridLayoutManager=new GridLayoutManager(context,2);
//        recyclerview.setLayoutManager(gridLayoutManager);


        //2.自定义适配器(adapter)
        Mydapter mydapter=new Mydapter();
        recyclerview.setAdapter(mydapter);


        //3.数据添加
        initData();

        mydapter.setData(apps);

    }
//     模拟数据
    private void initData()
    {
//        for (int i=1;i <= 13;i++){
//            int s = RandMain(2,0);
//            int Size=RandMain(100,1);
//            int Down=RandMain(10,1);
//            AppEntity appEntityi = new AppEntity(i, "QQ"+i,s,Size+"MB",Down+"亿");
//            appEntityi.setImage(R.drawable.back_img0);
//            apps.add(appEntityi);
//        }

        AppEntity appEntity2 = new AppEntity(2, "微信",1,"69.78MB","12亿");
        appEntity2.setImage(R.drawable.back_img1);
        AppEntity appEntity3 = new AppEntity(3, "作业帮",0,"49.78MB","13亿");
        appEntity3.setImage(R.drawable.back_img0);
        AppEntity appEntity4 = new AppEntity(4, "抖音",0,"80.78MB","14亿");
        appEntity4.setImage(R.drawable.back_img0);
        AppEntity appEntity5 = new AppEntity(5, "酷狗",1,"56.78MB","18亿");
        appEntity5.setImage(R.drawable.back_img0);
        AppEntity appEntity6 = new AppEntity(6, "爱奇艺",0,"56.78MB","18亿");
        appEntity6.setImage(R.drawable.back_img0);
        AppEntity appEntity7 = new AppEntity(7, "快手",0,"56.78MB","18亿");
        appEntity7.setImage(R.drawable.back_img1);
        AppEntity appEntity8 = new AppEntity(8, "拼多多",0,"56.78MB","18亿");
        appEntity8.setImage(R.drawable.back_img1);

        apps.add(appEntity2);
        apps.add(appEntity3);
        apps.add(appEntity4);
        apps.add(appEntity5);
        apps.add(appEntity6);
        apps.add(appEntity6);
        apps.add(appEntity6);
        apps.add(appEntity6);
        apps.add(appEntity7);
        apps.add(appEntity8);
        apps.add(appEntity8);
        apps.add(appEntity8);
        apps.add(appEntity8);
        apps.add(appEntity8);
    }
}