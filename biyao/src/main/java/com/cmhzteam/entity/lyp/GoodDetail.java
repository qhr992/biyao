package com.cmhzteam.entity.lyp;

import com.cmhzteam.entity.zhj.Good;

import java.util.List;

/**
 * 商品详情表
 * 此表连商品表，需要商品表good_host的各字段
 * 此表与商品属性、商品详细图片分离
 */
public class GoodDetail {
    private int gdid;
    private Good good;
    private String promise;//承诺
    private double express;//邮费
    private String description;//商品详情描述

    private List<GoodImage> imageList;//商品详情的图片


    public GoodDetail() {
    }

    public GoodDetail(int gdid, Good good, String promise, double express, String description, List<GoodImage> imageList) {
        this.gdid = gdid;
        this.good = good;
        this.promise = promise;
        this.express = express;
        this.description = description;
        this.imageList = imageList;
    }

    public int getGdid() {
        return gdid;
    }

    public void setGdid(int gdid) {
        this.gdid = gdid;
    }

    public Good getGood() {
        return good;
    }

    public void setGood(Good good) {
        this.good = good;
    }

    public String getPromise() {
        return promise;
    }

    public void setPromise(String promise) {
        this.promise = promise;
    }

    public double getExpress() {
        return express;
    }

    public void setExpress(double express) {
        this.express = express;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<GoodImage> getImageList() {
        return imageList;
    }

    public void setImageList(List<GoodImage> imageList) {
        this.imageList = imageList;
    }

    @Override
    public String toString() {
        return "GoodDetail{" +
                "gdid=" + gdid +
                ", good=" + good +
                ", promise='" + promise + '\'' +
                ", express=" + express +
                ", description='" + description + '\'' +
                ", imageList=" + imageList +
                '}';
    }
}
