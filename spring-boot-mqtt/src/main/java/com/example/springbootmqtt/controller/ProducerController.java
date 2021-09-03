package com.example.springbootmqtt.controller;

import com.example.springbootmqtt.config.Mqtt2Config;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "生产者控制器")
@RestController("/producer")
public class ProducerController {

    //@Autowired
    //private MqttConfig mqttConfig;

    @Autowired
    private Mqtt2Config mqtt2Config;

    @ApiOperation("测试接口是否正常")
    @GetMapping("/index")
    public String test() {
        return "hello world";
    }

    //@ApiOperation("测试获取配置项是否正常")
    //@GetMapping("/testConfig")
    //public MqttConfig testConfig() {
    //    MqttConfig result = new MqttConfig();
    //    // 这里很莫名要转一下，据说是因为原对象是代理类生成的，无法直接返回
    //    BeanUtils.copyProperties(mqttConfig,result);
    //    return result;
    //}

    @ApiOperation("测试通过前缀获取配置项是否正常")
    @GetMapping("/testMqtt2Config")
    public Mqtt2Config testMqtt2Config() {
        return mqtt2Config;
    }
}
