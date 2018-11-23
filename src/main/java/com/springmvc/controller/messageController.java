package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class messageController {

    @RequestMapping("message/go")
    public String goLogin(){
        return "login";
    }

    //&sex={sex}&age={age}
    //, @PathVariable String sex, @PathVariable String age
    @RequestMapping("message/detail/{uname}/{sex}/{age}")
    public String showDetail(@PathVariable String uname, Model model, @PathVariable String sex, @PathVariable String age){
        model.addAttribute("uname",uname);
        model.addAttribute("sex",sex);
        model.addAttribute("age",age);
        return "detail";
    }

    @RequestMapping("/message/confirmInfo")
    public String showDetail2(HttpServletRequest request,Model model) {
        String username=request.getParameter("uname");
        String sex=request.getParameter("sex");
        String age=request.getParameter("age");

        model.addAttribute("uname",username);
        model.addAttribute("sex",sex);
        model.addAttribute("age",age);
        model.addAttribute("formType",request.getMethod());

        return "detail";
    }

    @RequestMapping("/message/confirmInfo2")
    public String showDetail3(HttpServletRequest request,Model model) {
        String username=request.getParameter("uname");
        String sex=request.getParameter("sex");
        String age=request.getParameter("age");

        model.addAttribute("uname",username);
        model.addAttribute("sex",sex);
        model.addAttribute("age",age);
        model.addAttribute("formType",request.getMethod());

        return "detail";
    }
}
