package com.example.springbootrabbitmq.basic.fanout;

import com.example.springbootrabbitmq.basic.RabbitMqUtils;
import com.rabbitmq.client.BuiltinExchangeType;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;

import java.io.IOException;

public class FanoutProducer {
    public static void main(String[] args) throws IOException {
        Connection conn = RabbitMqUtils.createConn();
        Channel channel = conn.createChannel();
        /**
         * @String 交换机名称
         * @BuiltinExchangeType  fanout 广播类型
         * 声明fanout交换机(不存在时会创建)
         */
        channel.exchangeDeclare("logs-fanout", BuiltinExchangeType.FANOUT);

        /**
         * @String exchange，交换机名称
         * @String routingKey，队列名称，在fanout模式下指定也没有作用
         * 发送消息
         */
        //
        channel.basicPublish("logs-fanout","",null,"hello logs-fanout".getBytes());

        RabbitMqUtils.closeConn(channel,conn);
    }
}
