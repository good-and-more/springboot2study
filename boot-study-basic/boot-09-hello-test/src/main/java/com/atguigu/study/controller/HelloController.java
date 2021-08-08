package com.atguigu.study.controller;

import com.atguigu.hello.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping
    public String sayHello() {
        String hello = helloService.sayHello("张三");
        return hello;
    }
}
