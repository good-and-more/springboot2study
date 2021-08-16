package com.example.springbootrabbitmq.basic;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

/**
 * 练习：不使用SpringBoot的方法实现rabbitmq各种工作模式
 * 在基本的连接中，使用的是amqp-client这个依赖，它在引入spring-boot-starter-amqp时就同时引入了，所以连接工厂肯定要使用amqp-client的连接工厂
 */
public class RabbitMqUtils {
    /**
     * 创建连接
     * @return
     */
    public static Connection createConn() {
        try{
            // 创建连接工厂
            ConnectionFactory connectionFactory = new ConnectionFactory();
            connectionFactory.setHost("192.168.220.130");
            connectionFactory.setPort(5672);
            // 设置连接哪个虚拟主机
            connectionFactory.setVirtualHost("/");
            connectionFactory.setUsername("root");
            connectionFactory.setPassword("root");
            Connection connection = connectionFactory.newConnection();
            return connection;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 关闭连接
     * @param channel
     * @param connection
     */
    public static void closeConn(Channel channel, Connection connection) {
        try{
            if (channel != null){
                channel.close();
            }
            if(connection != null){
                connection.close();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
