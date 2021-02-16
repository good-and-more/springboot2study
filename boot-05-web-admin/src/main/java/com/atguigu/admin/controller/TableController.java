package com.atguigu.admin.controller;

import com.atguigu.admin.bean.User;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@Controller
public class TableController {
    @GetMapping("/basic_table")
    public String basicTable(){
        return "table/basic_table";
    }

    @GetMapping("/dynamic_table")
    public String dynamicTable(Model model){
        //表格内容的遍历
        List<User> users = Arrays.asList(new User("zhangsan", "123456"),
                new User("lisi","123444"),
                new User("wangwu","111111"),
                new User("haha","223344"),
                new User("zhaoliu","554433"));
        model.addAttribute("users", users);
        return "table/dynamic_table";
    }

    @GetMapping("/responsive_table")
    public String responsiveTable(){
        return "table/responsive_table";
    }

    @GetMapping("/editable_table")
    public String editableTable(){
        return "table/editable_table";
    }
}
