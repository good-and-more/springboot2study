package com.example.springbootmqtt.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MqttConfig {

    @Value("${mqtt.host}")
    private String mqttHost;

    @Value("${mqtt.userName}")
    private String mqttUsername;

    @Value("${mqtt.version}")
    private String mqttVersion;

    @Value("${mqtt.password}")
    private String mqttPassword;

    @Value("${mqtt.connectAttemptsMax}")
    private long mqttConnectAttemptsMax;

    @Value("${mqtt.reconnectAttemptsMax}")
    private long mqttReconnectAttemptsMax;

    //是否开启mqtt功能
    @Value("${mqtt.enable}")
    private boolean mqttEnabled;

    public String getMqttHost() {
        return mqttHost;
    }

    public String getMqttUsername() {
        return mqttUsername;
    }

    public String getMqttVersion() {
        return mqttVersion;
    }

    public String getMqttPassword() {
        return mqttPassword;
    }

    public long getMqttConnectAttemptsMax() {
        return mqttConnectAttemptsMax;
    }

    public long getMqttReconnectAttemptsMax() {
        return mqttReconnectAttemptsMax;
    }

    public boolean isMqttEnabled() {
        return mqttEnabled;
    }
}
