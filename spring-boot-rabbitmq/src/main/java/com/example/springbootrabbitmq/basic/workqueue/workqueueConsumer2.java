package com.example.springbootrabbitmq.basic.workqueue;

import com.example.springbootrabbitmq.basic.RabbitMqUtils;
import com.rabbitmq.client.*;

import java.io.IOException;

public class workqueueConsumer2 {
    public static void main(String[] args) throws IOException {
        Connection conn = RabbitMqUtils.createConn();
        Channel channel = conn.createChannel();
        channel.queueDeclare("workqueue",false,false,false,null);
        channel.basicConsume("workqueue",true,new DefaultConsumer(channel){
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) {
                System.out.println("消费2：" + new String(body));
            }
        });
    }
}
