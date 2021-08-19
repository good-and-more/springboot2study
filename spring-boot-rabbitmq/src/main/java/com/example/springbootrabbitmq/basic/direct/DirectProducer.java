package com.example.springbootrabbitmq.basic.direct;

import com.example.springbootrabbitmq.basic.RabbitMqUtils;
import com.rabbitmq.client.BuiltinExchangeType;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;

import java.io.IOException;

public class DirectProducer {
    public static void main(String[] args) throws IOException {
        Connection conn = RabbitMqUtils.createConn();
        Channel channel = conn.createChannel();
        final String exchange = "logs-direct";
        /**
         * @String 交换机名称
         * @BuiltinExchangeType  direct 直接类型
         * 声明direct交换机(不存在时会创建)
         */
        channel.exchangeDeclare(exchange, BuiltinExchangeType.DIRECT);

        /**
         * @String exchange，交换机名称
         * @String routingKey，路由key，在fanout模式下指定也没有作用，在direct模式下就要指定了
         * 发送消息
         */
        String routingKey1 = "error";
        String routingKey2 = "info";
        channel.basicPublish(exchange,routingKey1,null,("指定的route key["+routingKey1+"]的消息，"+routingKey1+"级别的日志打印").getBytes());
        channel.basicPublish(exchange,routingKey2,null,("指定的route key["+routingKey2+"]的消息，"+routingKey2+"级别的日志打印").getBytes());

        RabbitMqUtils.closeConn(channel,conn);
    }
}
