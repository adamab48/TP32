package com.example.recyclerview.model;

public class Recipe {


    private String rTitle;
    private String sDesc;
    private int sPhoto;

    public String getrTitle() {
        return rTitle;
    }

    public void setrTitle(String rTitle) {
        this.rTitle = rTitle;
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

    public Recipe(String rTitle, String sDesc, int sPhoto) {
        this.rTitle = rTitle;
        this.sDesc = sDesc;
        this.sPhoto = sPhoto;
    }


}
