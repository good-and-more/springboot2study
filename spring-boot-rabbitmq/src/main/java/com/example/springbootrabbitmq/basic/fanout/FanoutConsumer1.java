package com.example.springbootrabbitmq.basic.fanout;

import com.example.springbootrabbitmq.basic.RabbitMqUtils;
import com.rabbitmq.client.*;

import java.io.IOException;

public class FanoutConsumer1 {
    public static void main(String[] args) throws IOException {
        Connection conn = RabbitMqUtils.createConn();
        Channel channel = conn.createChannel();
        //通道绑定交换机
        channel.exchangeDeclare("logs-fanout", BuiltinExchangeType.FANOUT);
        // 临时队列
        String queueName = channel.queueDeclare().getQueue();
        //绑定交换机和队列
        channel.queueBind(queueName,"logs-fanout","");
        //消费消息
        channel.basicConsume(queueName,true,new DefaultConsumer(channel){
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) {
                System.out.println("消费者-1：" + new String(body));
            }
        });
    }
}
