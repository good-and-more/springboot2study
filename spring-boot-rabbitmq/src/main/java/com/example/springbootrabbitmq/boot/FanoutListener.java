package com.example.springbootrabbitmq.boot;

import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class FanoutListener {
    @RabbitListener(bindings = {
            @QueueBinding(value = @Queue, exchange = @Exchange(value = "fanout-boot-exchange", type = "fanout"))  //创建临时队列，绑定交换机
    })
    public void fanoutStr(String message){
        System.out.println("消费消息-1：" + message);
    }

    @RabbitListener(bindings = {
            @QueueBinding(value = @Queue, exchange = @Exchange(value = "fanout-boot-exchange", type = "fanout"))  //绑定交换机
    })
    public void fanoutStr2(String message){
        System.out.println("消费消息-2：" + message);
    }
}
