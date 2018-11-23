package com.springmvc.controller;

import com.springmvc.entity.Userinfo;
import com.springmvc.service.UserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by toutou on 2018/5/27.
 */
@Controller
public class userController {
    @Autowired
    private UserinfoService userService;

    @RequestMapping(value="/user/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/user/login", method = RequestMethod.POST)
    public String loginValidate(HttpSession session, Model model, @ModelAttribute Userinfo user) {
        //List<Userinfo> list = new ArrayList<Userinfo>();
        Userinfo userModel = new Userinfo();
        Userinfo record  = new Userinfo();
        record.setUsername(user.getUsername());
        userModel = userService.selectByUserName(user.getUsername());
        if (userModel == null) {
            model.addAttribute("status", 1);
        } else {
            record.setPassword(user.getPassword());
            if (!userModel.getPassword().equals(user.getPassword())) {
                model.addAttribute("status", 2);
            }
            else{
                model.addAttribute("status", 0);
            }
            record = userModel;
            session.setAttribute("userinfo", record);
        }
        return "login";
    }

    @RequestMapping(value="/user/userInfo", method = RequestMethod.GET)
    public String userInfo(Model model, HttpSession session) {
        Userinfo user = (Userinfo) session.getAttribute("userinfo");
        if(user != null){
            model.addAttribute("user", user);
        }
        return "userInfo";
    }

    @RequestMapping(value = "/user/logout", method = RequestMethod.GET)
    public String logout(HttpSession session) {
        session.invalidate();
        //session.removeAttribute("user");
        return "login";
    }
}