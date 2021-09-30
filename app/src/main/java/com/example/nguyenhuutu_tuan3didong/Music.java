package com.example.nguyenhuutu_tuan3didong;

public class Music {
    private int img;
    private String tencs;
    private String tenbaihat;


    public Music(int img, String tencs, String tenbaihat) {
        this.img = img;
        this.tencs = tencs;
        this.tenbaihat = tenbaihat;
    }

    public String getTenbaihat() {
        return tenbaihat;
    }

    public void setTenbaihat(String tenbaihat) {
        this.tenbaihat = tenbaihat;
    }

    public String getTencs() {
        return tencs;
    }

    public void setTencs(String tencs) {
        this.tencs = tencs;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
