package com.example.springbootmqtt.controller;

import com.example.springbootmqtt.config.MqttConfig;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "生产者控制器")
@RestController("/producer")
public class ProducerController {

    @Autowired
    private MqttConfig mqttConfig;

    @ApiOperation("测试接口是否正常")
    @GetMapping("/index")
    public String test() {
        return "hello world";
    }

    @ApiOperation("测试获取配置项是否正常")
    @GetMapping("/testConfig")
    public MqttConfig testConfig() {
        return mqttConfig;
    }
}
