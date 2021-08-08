package com.atguigu.study.controller;

import com.atguigu.study.model.HospitalSet;
import com.atguigu.study.service.HospitalSetService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags = "测试进入主页的hello")
@RequestMapping("/index")
public class IndexController {

    @Autowired
    private HospitalSetService hospitalService;

    @ApiOperation("测试主页helloworld功能")
    @GetMapping("/hello")
    public String hello() {
        return "hello world";
    }

    @ApiOperation("查询hospitalSet表所有内容")
    @GetMapping("/getHospitalSet")
    public List<HospitalSet> getHospitalSet() {
        List<HospitalSet> list = hospitalService.selectAll();
        return list;
    }

}
