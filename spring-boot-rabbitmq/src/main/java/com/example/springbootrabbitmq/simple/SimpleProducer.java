package com.example.springbootrabbitmq.simple;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class SimpleProducer {

    final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send() {
        String message = "Hello Spring Boot " + LocalDateTime.now().format(formatter);
        System.out.println(message);
        amqpTemplate.convertAndSend("simple", message);
    }
}
