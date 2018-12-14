package com.cmhzteam.entity.lyp;

import com.cmhzteam.entity.lrh.User;

import java.util.Date;

public class Comment {
    private int cid;
    private int gid;
    private User user;
    private String content;
    private int level;
    private Date time;

    public Comment() {
    }

    public Comment(int cid, int gid, User user, String content, int level, Date time) {
        this.cid = cid;
        this.gid = gid;
        this.user = user;
        this.content = content;
        this.level = level;
        this.time = time;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "cid=" + cid +
                ", gid=" + gid +
                ", user=" + user +
                ", content='" + content + '\'' +
                ", level=" + level +
                ", time=" + time +
                '}';
    }
}
