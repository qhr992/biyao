package com.cmhzteam.entity.zhj;

public class Stype {
    private int sub_type_id;
    private int pid;
    private String sub_type_name;

    public Stype() {
    }

    public Stype(int pid, String sub_type_name) {
        this.pid = pid;
        this.sub_type_name = sub_type_name;
    }

    public int getSub_type_id() {
        return sub_type_id;
    }

    public void setSub_type_id(int sub_type_id) {
        this.sub_type_id = sub_type_id;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getSub_type_name() {
        return sub_type_name;
    }

    public void setSub_type_name(String sub_type_name) {
        this.sub_type_name = sub_type_name;
    }

    @Override
    public String toString() {
        return "Stype{" +
                "sub_type_id=" + sub_type_id +
                ", pid=" + pid +
                ", sub_type_name='" + sub_type_name + '\'' +
                '}';
    }
}
