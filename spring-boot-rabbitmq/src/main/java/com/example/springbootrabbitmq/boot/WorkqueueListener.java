package com.example.springbootrabbitmq.boot;

import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class WorkqueueListener {
    @RabbitListener(queuesToDeclare = @Queue("work-boot"))
    public void work1(String message){
        System.out.println("消费消息-1：" + message);
    }

    @RabbitListener(queuesToDeclare = @Queue("work-boot"))
    public void work2(String message){
        System.out.println("消费消息-2：" + message);
    }
}
