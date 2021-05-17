package com.example.myapplication;

import android.os.Parcel;
import android.os.Parcelable;

public class Account implements Parcelable {
    private String iphone;
    private String pwd;

    public String getIphone() {
        return iphone;
    }

    public void setIphone(String iphone) {
        this.iphone = iphone;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.iphone);
        dest.writeString(this.pwd);
    }

    @Override
    public String toString() {
        return "Account{" +
                "iphone='" + iphone + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }

    public void readFromParcel(Parcel source) {
        this.iphone = source.readString();
        this.pwd = source.readString();
    }

    public Account() {
    }

    protected Account(Parcel in) {
        this.iphone = in.readString();
        this.pwd = in.readString();
    }

    public static final Parcelable.Creator<Account> CREATOR = new Parcelable.Creator<Account>() {
        @Override
        public Account createFromParcel(Parcel source) {
            return new Account(source);
        }

        @Override
        public Account[] newArray(int size) {
            return new Account[size];
        }
    };
}
