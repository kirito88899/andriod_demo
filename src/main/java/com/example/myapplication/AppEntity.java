package com.example.myapplication;

public class AppEntity {
    private String AppName;
    private int rank;
    private String downloadCount;
    private String Size;
    private int status;
    private int Image;

    public AppEntity(int i, String qq, int s, String Size, String downloadCount) {
        this.rank=i;
        this.AppName=qq;
        this.status=s;
        this.Size=Size;
        this.downloadCount=downloadCount;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public String getAppName() {
        return AppName;
    }

    public void setAppName(String appName) {
        AppName = appName;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getDownloadCount() {
        return downloadCount;
    }

    public void setDownloadCount(String downloadCount) {
        this.downloadCount = downloadCount;
    }


    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        Size = size;
    }
}
