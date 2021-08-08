package com.atguigu.boot.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("test")
@ConfigurationProperties("person")
@Component
@Data
public class Worker implements Person{

    private String name;
    private String age;

}
