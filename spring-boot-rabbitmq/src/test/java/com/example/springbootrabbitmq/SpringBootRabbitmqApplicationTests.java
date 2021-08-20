package com.example.springbootrabbitmq;

import org.junit.jupiter.api.Test;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootRabbitmqApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    RabbitTemplate rabbitTemplate;

    @Test
    void testHello() {
        /**
         * 参数一：队列名称
         * 参数二：消息内容
         */
        rabbitTemplate.convertAndSend("hello-boot","hello boot");
    }

    @Test
    void testWorkQueue() {
        /**
         * 参数一：队列名称
         * 参数二：消息内容
         */
        for (int i = 0; i < 10; i++) {
            rabbitTemplate.convertAndSend("work-boot","work-boot " + i);
        }
    }

    @Test
    void testFanout() {
        /**
         * 参数一：交换机名称
         * 参数三：消息内容
         */
        for (int i = 0; i < 10; i++) {
            rabbitTemplate.convertAndSend("fanout-boot-exchange","","fanout-boot " + i);
        }
    }

    @Test
    void testDirect() {
        /**
         * 参数一：交换机名称
         * 参数二：路由
         */
        rabbitTemplate.convertAndSend("direct-boot-exchange","error","direct-boot-error");
        rabbitTemplate.convertAndSend("direct-boot-exchange","info","direct-boot-info");
    }

    @Test
    void testTopic() {
        /**
         * 参数一：交换机名称
         * 参数二：路由
         */
        rabbitTemplate.convertAndSend("topic-boot-exchange","user.role.query","topic boot user.role.query");
        rabbitTemplate.convertAndSend("topic-boot-exchange","user.role","topic boot user.role");
    }
}
