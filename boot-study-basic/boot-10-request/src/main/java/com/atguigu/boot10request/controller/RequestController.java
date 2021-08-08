package com.atguigu.boot10request.controller;

import com.atguigu.boot10request.entity.UserDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@Slf4j
@RestController
public class RequestController {
    private static String UPLOAD_FOLDER = "F:\\java_practise\\springboot2study\\boot-10-request\\src\\main\\resources\\static\\";

    //1.通过HttpServletRequest对象获取对应的参数,优先url中的参数,post中form-data x-www-form-urlencoded都可以,json格式只能获取null
    @RequestMapping(value = "request1",method = {RequestMethod.GET,RequestMethod.POST})
    public String request1(HttpServletRequest request) {
        return request.getParameter("user") + " and " + request.getParameter("password");
    }

    //2.方法参数名直接对应url参数名,完全一致,优先url中的参数,post中form-data x-www-form-urlencoded都可以,json格式只能获取null
    @RequestMapping(value = "request2",method = {RequestMethod.GET,RequestMethod.POST})
    public String request2(String user, String password) {
        return user + " and " + password;
    }

    //2.5.通过path参数而非请求参数获取,只能在get中
    @GetMapping("get5/{user}/{password}")
    public String get5(@PathVariable(name = "user") String username,
                       @PathVariable(name = "password") String pwd) {
        return username + " and " + pwd;
    }

    //3.@RequestParam注解获取参数,优先url中的参数,post中form-data x-www-form-urlencoded都可以,json格式只能获取null
    @RequestMapping(value = "request3",method = {RequestMethod.GET,RequestMethod.POST})
    public String request3(@RequestParam("user") String username, @RequestParam("password") String pwd) {
        return username + " and " + pwd;
    }

    //4.通过Bean方式,优先url中的参数,post中form-data x-www-form-urlencoded都可以,json格式只能获取null
    @RequestMapping(value = "request4",method = {RequestMethod.GET,RequestMethod.POST})
    public String request4(UserDTO userDTO) {
        return userDTO.toString();
    }

    //5.post请求通过Bean获取参数,加上@RequestBody注解,content-type只能指定application/json,别的不行
    @PostMapping("post5")
    public String post5(@RequestBody UserDTO userDTO) {
        return userDTO.toString();
    }

    //6.post请求上传参数和多个文件
    @PostMapping("uploadFile")
    public String uploadFile(UserDTO userDTO, MultipartFile file) {
        String filename = file.getOriginalFilename();
        String filePath = UPLOAD_FOLDER + filename;
        File dest = new File(filePath);
        try {
            file.transferTo(dest);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return userDTO.getUser() + " and " + userDTO.getPassword();
    }
}
