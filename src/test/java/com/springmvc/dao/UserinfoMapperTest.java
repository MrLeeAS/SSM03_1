package com.springmvc.dao;

import com.springmvc.entity.Userinfo;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

import static org.junit.Assert.*;

public class UserinfoMapperTest {

    private ApplicationContext applicationContext;

    @Autowired
    private UserinfoMapper mapper;

    @Before
    public void setUp() throws Exception {
        // 加载spring配置文件
        applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
        // 导入需要测试的
        mapper = applicationContext.getBean(UserinfoMapper.class);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void insert() {

        Userinfo oldUser = mapper.selectByUserName("wangyaozu");
        if (oldUser == null){
            Userinfo userinfo = new Userinfo();
            userinfo.setUsername("wangyaozu");
            userinfo.setPassword("123123");
            userinfo.setAddtime(new Date());
            int result = mapper.insert(userinfo);
            System.out.println(result);
        }
        else{
            System.out.println("User existsed");
        }
        //assert (result == 1);
    }

    @Test
    public void selectByUserName() {
        Userinfo result = mapper.selectByUserName("wangyaozu");
        if (result != null)
            System.out.println(result.getUsername());
        else
            System.out.println("none");
    }
}