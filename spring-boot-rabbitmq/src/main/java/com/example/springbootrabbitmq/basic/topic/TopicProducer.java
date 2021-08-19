package com.example.springbootrabbitmq.basic.topic;

import com.example.springbootrabbitmq.basic.RabbitMqUtils;
import com.rabbitmq.client.BuiltinExchangeType;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;

import java.io.IOException;

public class TopicProducer {
    public static void main(String[] args) throws IOException {
        Connection conn = RabbitMqUtils.createConn();
        Channel channel = conn.createChannel();
        final String exchange = "logs-topic";
        /**
         * @String 交换机名称
         * @BuiltinExchangeType  topic
         * 声明topic交换机(不存在时会创建)
         */
        channel.exchangeDeclare(exchange, BuiltinExchangeType.TOPIC);

        /**
         * @String exchange，交换机名称
         * @String routingKey，路由key
         * 发送消息
         */
        String routingKey = "user.";
        channel.basicPublish(exchange,routingKey,null,("动态路由模式的消息 routing key: ["+routingKey + "]").getBytes());

        RabbitMqUtils.closeConn(channel,conn);
    }
}
