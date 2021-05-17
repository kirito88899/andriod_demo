package com.example.myapplication;

import java.io.Serializable;

public class User implements Serializable {
    private String user_name;
    private String pwd;

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
