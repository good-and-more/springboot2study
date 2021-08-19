package com.example.springbootrabbitmq.basic.direct;

import com.example.springbootrabbitmq.basic.RabbitMqUtils;
import com.rabbitmq.client.*;

import java.io.IOException;

public class DirectConsumer2 {
    public static void main(String[] args) throws IOException {
        Connection conn = RabbitMqUtils.createConn();
        Channel channel = conn.createChannel();
        final String exchange = "logs-direct";
        //通道绑定交换机
        channel.exchangeDeclare(exchange, BuiltinExchangeType.DIRECT);
        // 临时队列
        String queueName = channel.queueDeclare().getQueue();
        //绑定交换机和队列
        channel.queueBind(queueName,exchange,"info");
        //消费消息
        channel.basicConsume(queueName,true,new DefaultConsumer(channel){
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) {
                System.out.println("消费者-2-info级别日志打印：" + new String(body));
            }
        });
    }
}
