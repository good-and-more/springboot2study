package com.example.springbootrabbitmq.boot;

import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class SimpleListener {
    // 通过注解创建 hello-boot 队列
    @RabbitListener(queuesToDeclare = {@Queue(value = "hello-boot", durable = "false", autoDelete = "false")})
    public void consumptionStr(String message){
        System.out.println("消费消息：" + message);
    }
}
