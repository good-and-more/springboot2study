package com.example.springbootmqtt;

import com.example.springbootmqtt.config.Mqtt2Config;
import com.example.springbootmqtt.mqtt.MqttListener;
import com.example.springbootmqtt.mqtt.MqttUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(Mqtt2Config.class)
@SpringBootApplication
public class SpringBootMqttApplication implements CommandLineRunner {

    @Autowired
    private Mqtt2Config mqtt2Config;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMqttApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //订阅主题test01, 使用MessageListener来处理它的消息
        MqttUtils.subscribe(mqtt2Config.getMsgTopic().getTestTopic(), new MqttListener());
    }
}
