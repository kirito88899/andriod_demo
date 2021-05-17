package com.example.myapplication;

//List数据列表创建
public class Appbean {
    String AppName;
    String Image;

    public Appbean(String appName, String image) {
        AppName = appName;
        Image = image;
    }

    public String getAppName() {
        return AppName;
    }

    public void setAppName(String appName) {
        AppName = appName;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }
}
