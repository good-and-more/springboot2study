package com.example.springbootredis.controller;

import com.example.springbootredis.entity.User;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


@RestController
@RequestMapping("/testRedis")
public class RedisTestController {
    @Resource
    private RedisTemplate redisTemplate;

    @GetMapping("/get")
    public Object getByKey(String key) {
        return redisTemplate.opsForValue().get(key);
    }

    @GetMapping("/set")
    public String setValueByKey(String key, String value) {
        /**
         * key=mytest,value=hello
         * 在redis里显示的却是\xac\xed\x00\x05t\x00\x06mytest，\xac\xed\x00\x05t\x00\x05hello
         * RedisTemplate的afterPropertiesSet方法里有指定默认序列化器是jdk序列化器，前面看不懂的字符就来自于该序列化器
         */
        redisTemplate.opsForValue().set(key, value);
        return "success";
    }

    @GetMapping("/test")
    public String test() {
        return "hello world";
    }

    @PostMapping("/saveUser")
    public String saveUser(@RequestBody User user) {
        redisTemplate.opsForValue().set("user123", user);
        return "success";
    }
}
