package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Handler;


public class ListBottomMainActivity extends AppCompatActivity {

    private ViewPager vpid;
    private RadioButton shouye;
    private RadioButton liebiao;
    private RadioButton wode;
    private RadioGroup rg;
    private List<Fragment> list;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_bottom_main);

        init();
        setOnListener();


        list=new ArrayList<>();
        list.add(new ViewFragment());
        list.add(new ViewFragment2());
        list.add(new ViewFragment3());
        vpid.setAdapter(new FragmentStatePagerAdapter(getSupportFragmentManager()) {
            @NonNull
            @Override
            public Fragment getItem(int position) {
                return list.get(position);

            }
            @Override
            public int getCount() {
                return list.size();
            }
        });



        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                switch (i){
                    case R.id.shouye:
                        vpid.setCurrentItem(0);
                        break;
                    case R.id.liebiao:

                        vpid.setCurrentItem(1);
                        break;
                    case R.id.wode:
                        vpid.setCurrentItem(2);
                        break;
                }
            }
        });



    }





    private void setOnListener() {
        vpid.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            //重写ViewPager页面切换的处理方法
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {


                switch (position) {
                    case 0:
                        rg.check(R.id.shouye);
                        break;
                    case 1:
                        rg.check(R.id.liebiao);
                        break;
                    case 2:
                        rg.check(R.id.wode);
                        break;
                }



            }

            @Override
            public void onPageScrollStateChanged(int state) {
                //state的状态有三个，0表示什么都没做，1正在滑动，2滑动完毕

            }
        });
    }





    private void init() {

        vpid = findViewById(R.id.pager_view);
        shouye = findViewById(R.id.shouye);
        liebiao = findViewById(R.id.liebiao);
        wode = findViewById(R.id.wode);
        rg = findViewById(R.id.rg);



    }




}