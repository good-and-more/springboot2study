package com.example.springbootrabbitmq.basic.workqueue;


import com.example.springbootrabbitmq.basic.RabbitMqUtils;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;

import java.io.IOException;

public class workqueueProducer {
    public static void main(String[] args) throws IOException {
        Connection conn = RabbitMqUtils.createConn();
        Channel channel = conn.createChannel();
        //通道绑定消息队列
        channel.queueDeclare("workqueue",false,false,false,null);
        for (int i = 0; i < 30; i++) {
            channel.basicPublish("","workqueue",null, ("rabbitmq workqueue message" + i).getBytes());
        }
        RabbitMqUtils.closeConn(channel, conn);
    }
}
