package com.oukele.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @RequestMapping("/login")
    public String login(@RequestParam("username") String username, @RequestParam("pwd") String pwd) {
        String forword = null;
        if (username.equals("oukele") && pwd.equals("oukele")) {
            forword = "index";//登录成功跳转到index.jsp
        } else {
            System.out.println("no such user");
            forword = "Login";//登录失败跳转到Login.jsp继续登录操作
        }
        return forword;
    }

}
