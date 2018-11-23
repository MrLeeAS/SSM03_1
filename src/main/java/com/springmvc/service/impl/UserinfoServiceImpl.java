package com.springmvc.service.impl;

import com.springmvc.dao.UserinfoMapper;
import com.springmvc.entity.Userinfo;
import com.springmvc.service.UserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserinfoServiceImpl implements UserinfoService {
    @Autowired
    private UserinfoMapper mapper;
    public int insert(Userinfo record) {
        return mapper.insert(record);
    }

    public Userinfo selectSelective(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    public Userinfo selectByUserName(String username) {
        return mapper.selectByUserName(username);
    }
}
