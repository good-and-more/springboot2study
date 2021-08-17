package com.example.springbootrabbitmq.basic.direct;

import com.example.springbootrabbitmq.basic.RabbitMqUtils;
import com.rabbitmq.client.*;

import java.io.IOException;

/**
 * @author learn_and_think
 */
public class DirectConsumer {
    public static void main(String[] args) throws IOException {
        Connection conn = RabbitMqUtils.createConn();
        Channel channel = conn.createChannel();

        //通道绑定消息队列,参数要跟生产者那边一致
        channel.queueDeclare("hello-1",false,false,false,null);

        /**
         * 参数1：String queue 队列名称
         * 参数2：boolean autoAck 开启消息的自动确认机制，一般都选true，不然消息被消费后会unacked，下次消费者重启时会再消费一次
         * 参数3：Consumer callback  消费时回调接口
         */
        //消费消息
        channel.basicConsume("hello-1",true,new DefaultConsumer(channel) {
            /**
             * @param consumerTag
             * @param envelope
             * @param properties
             * @param body 消息队列中取出的消息
             * @throws IOException
             */
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                System.out.println("消费消息：" + new String(body));
            }
        });
    }
}
