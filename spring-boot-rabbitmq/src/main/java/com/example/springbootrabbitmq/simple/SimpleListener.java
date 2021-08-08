package com.example.springbootrabbitmq.simple;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "simple")
public class SimpleListener {

    @RabbitHandler
    public void process(String message) {
        System.out.println("Receive: " + message);
    }
}
