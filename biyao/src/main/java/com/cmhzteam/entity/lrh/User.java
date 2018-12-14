package com.cmhzteam.entity.lrh;

public class User {
    private int userid;
    private String phone;
    private String password;
    private int status;
    private int role;

    public User() {
    }

    public User(int userid, String phone, String password, int status, int role) {
        this.userid = userid;
        this.phone = phone;
        this.password = password;
        this.status = status;
        this.role = role;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

}
