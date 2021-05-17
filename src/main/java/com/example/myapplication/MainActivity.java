package com.example.myapplication;

import android.content.Context;
import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;




import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

//
//    //随机数生成
//    public static int RandMain(int Max, int Min) {
//        int ran2 = (int) (Math.random() * (Max - Min) + Min);
//        return ran2;
//    }
//    //上下文
//    private Context context;
//    private List<AppEntity> apps = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);




//        context = this;
//        //找到RecyclerVier控件
//        RecyclerView recyclerview = findViewById(R.id.RecyclerView);
//        //1.指定布局管理器
//        //普通形式
//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
//        recyclerview.setLayoutManager(linearLayoutManager);
//
//        //网格形式
////        GridLayoutManager gridLayoutManager=new GridLayoutManager(context,2);
////        recyclerview.setLayoutManager(gridLayoutManager);
//
//
//        //2.自定义适配器(adapter)
//        Mydapter mydapter = new Mydapter();
//        recyclerview.setAdapter(mydapter);
//
//
//        //3.数据添加
//        initData();
//        mydapter.setData(apps);
    }

//    //     模拟数据
//    private void initData() {
//        for (int i = 1; i <= 13; i++) {
//            int s = RandMain(1, 0);
//            int Size = RandMain(100, 1);
//            int Down = RandMain(10, 1);
//            AppEntity appEntityi = new AppEntity(i, "QQ" + i, s, Size + "MB", Down + "亿");
//            appEntityi.setImage(R.drawable.back_img0);
//            apps.add(appEntityi);
//        }
//    }
}