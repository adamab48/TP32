package com.example.recyclerview.model;

public class School {

    private String sName;
    private String sDesc;

    private int sPhoto;

    public String getmWebsite() {
        return mWebsite;
    }

    public void setmWebsite(String mWebsite) {
        this.mWebsite = mWebsite;
    }

    private String mWebsite;

    public School(String sName, String sDesc, int sPhoto , String mWebsite) {
        this.sName = sName;
        this.sDesc = sDesc;
        this.sPhoto = sPhoto;
        this.mWebsite = mWebsite;
        }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsDesc() {
        return sDesc;
    }

    public void setsDesc(String sDesc) {
        this.sDesc = sDesc;
    }

    public int getsPhoto() {
        return sPhoto;
    }

    public void setsPhoto(int sPhoto) {
        this.sPhoto = sPhoto;
    }
}
