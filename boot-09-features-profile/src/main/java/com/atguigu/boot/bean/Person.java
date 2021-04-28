package com.atguigu.boot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

public interface Person {

    String getName();
    String getAge();
}
