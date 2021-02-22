package com.atguigu.admin.controller;

import com.atguigu.admin.bean.User;
import com.atguigu.admin.service.UserService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@Controller
public class TableController {

    @Autowired
    UserService userService;

    @GetMapping("/basic_table")
    public String basicTable(){
        return "table/basic_table";
    }

    @GetMapping("/dynamic_table")
    public String dynamicTable(@RequestParam(value = "pn",defaultValue = "1")Integer pn, Model model){
        //表格内容的遍历
//        List<User> users = Arrays.asList(new User("zhangsan", "123456"),
//                new User("lisi","123444"),
//                new User("wangwu","111111"),
//                new User("haha","223344"),
//                new User("zhaoliu","554433"));
//        model.addAttribute("users", users);
        List<User> list = userService.list();
        model.addAttribute("users", list);
        //分页查询数据
        Page<User> userPage = new Page<>(pn, 2);
        //分页查询的结果
        Page<User> page = userService.page(userPage, null);
        model.addAttribute("page", page);


        return "table/dynamic_table";
    }

    @GetMapping("/user/delete/{id}")
    public String deleteUser(@PathVariable("id") Long id,
                             @RequestParam(value = "pn",defaultValue = "1")Integer pn,
                             RedirectAttributes redirectAttributes) {

        boolean b = userService.removeById(id);
        redirectAttributes.addAttribute("pn", pn);
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
