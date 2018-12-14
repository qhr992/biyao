package com.cmhzteam.entity.lyp;

public class GoodImage {
    private int giid;
    private int gid;
    private String image_url;

    public GoodImage() {
    }

    public GoodImage(int giid, int gid, String image_url) {
        this.giid = giid;
        this.gid = gid;
        this.image_url = image_url;
    }

    public int getGiid() {
        return giid;
    }

    public void setGiid(int giid) {
        this.giid = giid;
    }

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    @Override
    public String toString() {
        return "GoodImage{" +
                "giid=" + giid +
                ", gid=" + gid +
                ", image_url='" + image_url + '\'' +
                '}';
    }
}
