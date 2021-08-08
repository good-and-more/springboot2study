package com.example.springbootrabbitmq;

import com.example.springbootrabbitmq.simple.SimpleProducer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootRabbitmqApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    SimpleProducer simpleProducer;

    @Test
    public void simpleSend() throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            simpleProducer.send();
            Thread.sleep(3000);
        }
    }
}
