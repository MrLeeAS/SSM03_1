package com.springmvc.service;

import com.springmvc.entity.Userinfo;

import java.util.ArrayList;

public interface UserinfoService  {
    //<editor-fold desc="折叠">
    int insert(Userinfo record);

    Userinfo selectSelective(Integer id);

    Userinfo selectByUserName(String username);
    //</editor-fold>
}
