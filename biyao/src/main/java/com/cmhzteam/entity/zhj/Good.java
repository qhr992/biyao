package com.cmhzteam.entity.zhj;

//asdasdasdasd
public class Good {
    private int gid;
    private String gname;
    private String gtitle;
    private double cur_price;
    private double old_price;
    private String gimage_url;
    private String gtapy;

    public Good() {
    }

    public Good(int gid, String gname, String gtitle, double cur_price, double old_price, String gimage_url, String gtapy) {
        this.gid = gid;
        this.gname = gname;
        this.gtitle = gtitle;
        this.cur_price = cur_price;
        this.old_price = old_price;
        this.gimage_url = gimage_url;
        this.gtapy = gtapy;
    }

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public String getGtitle() {
        return gtitle;
    }

    public void setGtitle(String gtitle) {
        this.gtitle = gtitle;
    }

    public double getCur_price() {
        return cur_price;
    }

    public void setCur_price(double cur_price) {
        this.cur_price = cur_price;
    }

    public double getOld_price() {
        return old_price;
    }

    public void setOld_price(double old_price) {
        this.old_price = old_price;
    }

    public String getGimage_url() {
        return gimage_url;
    }

    public void setGimage_url(String gimage_url) {
        this.gimage_url = gimage_url;
    }

    public String getGtapy() {
        return gtapy;
    }

    public void setGtapy(String gtapy) {
        this.gtapy = gtapy;
    }

    @Override
    public String toString() {
        return "Good{" +
                "gid=" + gid +
                ", gname='" + gname + '\'' +
                ", gtitle='" + gtitle + '\'' +
                ", cur_price=" + cur_price +
                ", old_price=" + old_price +
                ", gimage_url='" + gimage_url + '\'' +
                ", gtapy='" + gtapy + '\'' +
                '}';
    }
}
