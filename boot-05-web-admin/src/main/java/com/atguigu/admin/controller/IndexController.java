package com.atguigu.admin.controller;

import com.atguigu.admin.bean.Account;
import com.atguigu.admin.bean.City;
import com.atguigu.admin.bean.User;
import com.atguigu.admin.service.AccountService;
import com.atguigu.admin.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;

@Controller
public class IndexController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    AccountService accountService;

    @Autowired
    CityService cityService;

    @GetMapping("/city")
    @ResponseBody
    public City getCityById(Long id){
        return cityService.getById(id);
    }

    @PostMapping("/city")
    @ResponseBody
    public City saveCity(City city){
        cityService.saveCity(city);
        return city;
    }

    @GetMapping("/acct")
    @ResponseBody
    public Account getAccountById(Long id){
        return accountService.getAcctById(id);
    }

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
     * @param user
     * @param session
     * @return
     */
    @PostMapping("/login")
    public String main(User user, HttpSession session, Model model){
        if (!StringUtils.isEmpty(user.getUserName()) && "123456".equals(user.getPassword())) {
            //把登录成功的用户保存起来
            session.setAttribute("loginUser",user);
            //登录成功，重定向到main.html，重定向防止表单重复提交
            return "redirect:/main.html";
        }
        model.addAttribute("msg", "账号密码错误");
        return "login";

    }

    /**
     *
     * @return
     */
    @GetMapping("/main.html")
    public String mainPage(HttpSession session, Model model){
        //必须判断是否登录，不然用户直接访问main页面即可进入后台
        //是否登录，以后通过拦截器判断
        Object loginUser = session.getAttribute("loginUser");
        if(loginUser != null) {
            return "main";
        } else {
            model.addAttribute("msg", "请重新登录");
            return "login";
        }
    }

    @ResponseBody
    @GetMapping("query")
    public String queryFromDb(){
        Long aLong = jdbcTemplate.queryForObject("select count(*) from gdu_app_installed", Long.class);
        return aLong.toString();
    }
}
