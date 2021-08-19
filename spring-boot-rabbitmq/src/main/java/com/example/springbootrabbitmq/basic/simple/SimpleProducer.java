package com.example.springbootrabbitmq.basic.simple;

import com.example.springbootrabbitmq.basic.RabbitMqUtils;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;

import java.io.IOException;

/**
 * @author learn_and_think
 */
public class SimpleProducer {
    public static void main(String[] args) throws IOException {
        // 通过工具类获取连接，通过连接获取通道
        Connection conn = RabbitMqUtils.createConn();
        Channel channel = conn.createChannel();
        /**
         * 参数1：String queue 队列名称 如果队列不存在会自动创建
         * 参数2：boolean durable  队列是否持久化 true 持久化 false 不持久化  队列的声明默认是存放到内存中的，如果rabbitmq重启会丢失，如果想重启之后还存在就要使队列持久化，
         * 参数3：boolean exclusive 是否独占队列 true 独占队列 false 不独占
         * 参数4：boolean autoDelete 当最后一个消费者断开连接之后队列是否自动被删除  true 自动删除，
         * 参数5：Map<String, Object> arguments  额外附加参数
         */
        //通道绑定消息队列
        channel.queueDeclare("hello-1",false,false,false,null);

        /**
         * 参数1：String exchange  交换机名称
         * 参数2：String routingKey  队列名称
         * 参数3：BasicProperties props  传递消息额外参数
         * 参数4：byte[] body  消息的具体内容
         */
        //发布消息
        byte[] body = "hello rabbitmq".getBytes();
        for (byte b : body) {
            System.out.println(b);
        }
        System.out.println(body);
        channel.basicPublish("","hello-1",null, body);

        //关闭连接
        RabbitMqUtils.closeConn(channel,conn);
    }
}
