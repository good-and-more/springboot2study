package com.atguigu.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IndexController {
    /**
     * 访问登录页
     * @return
     */
    @GetMapping(value = {"/","/login"})
    public String loginPage(){
        return "login";
    }

    /**
     *
     * @param username
     * @param password
     * @return
     */
    @PostMapping("/login")
    public String index(String username,String password){
        return "index";
    }
}
