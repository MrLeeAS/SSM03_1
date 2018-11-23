package com.springmvc.entity;

import java.util.Date;

public class Loginfo {
    private Integer id;

    private String boyd;

    private Date addtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBoyd() {
        return boyd;
    }

    public void setBoyd(String boyd) {
        this.boyd = boyd;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
}