package com.atguigu.boot10request.controller;

import com.atguigu.boot10request.entity.UserDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@RestController
@RequestMapping("index")
public class IndexController {

    @GetMapping("/index")
    public String hello() {
        return "hello world";
    }

    //1.通过HttpServletRequest对象获取对应的参数
    @GetMapping("get1")
    public String get1(HttpServletRequest request) {
        log.info("request:{}", request.toString());
        return request.getParameter("user") + " and " + request.getParameter("password");
    }

    //2.方法参数名直接对应url参数名,完全一致
    @GetMapping("get2")
    public String get2(String user, String password) {
        return user + " and " + password;
    }

    //3.@RequestParam注解获取参数
    @GetMapping("get3")
    public String get3(@RequestParam("user") String username, @RequestParam("password") String pwd) {
        return username + " and " + pwd;
    }

    //4.通过Bean方式,get传bean可以直接在url里对应参数即可
    @GetMapping("get4")
    public String get4(UserDTO userDTO) {
        return userDTO.toString();
    }

    //5.通过path参数而非请求参数获取
    @GetMapping("get5/{user}/{password}")
    public String get5(@PathVariable(name = "user") String username,
                       @PathVariable(name = "password") String pwd) {
        return username + " and " + pwd;
    }

    //1.post请求通过HttpServletRequest获取参数,前端要用form-data提交
    @PostMapping("post1")
    public String post1(HttpServletRequest request) {
        return request.getParameter("user") + " and " + request.getParameter("password");
    }

    //2.post请求通过方法获取参数,如果url中有同名参数优先用url中的
    @PostMapping("post2")
    public String post2(String user, String password) {
        return user + " and " + password;
    }

    //3.post请求通过@RequestParam注解获取参数,如果url中有同名参数会跟在后面拼成一个字符串
    @PostMapping("post3")
    public String post3(@RequestParam(value = "user",required = false) String username, @RequestParam(value = "password",required = false) String pwd) {
        return username + " and " + pwd;
    }

    //4.post请求通过Bean获取参数
    @PostMapping("post4")
    public String post4(UserDTO userDTO) {
        return userDTO.toString();
    }

    //5.post请求通过Bean获取参数,加上@RequestBody注解
    @PostMapping("post5")
    public String post5(@RequestBody UserDTO userDTO) {
        return userDTO.toString();
    }
}
