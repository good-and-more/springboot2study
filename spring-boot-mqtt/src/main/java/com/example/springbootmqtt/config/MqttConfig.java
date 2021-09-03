//package com.example.springbootmqtt.config;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class MqttConfig {
//
//    @Value("${mqtt.host}")
//    private String mqttHost;
//
//    @Value("${mqtt.username}")
//    private String mqttUsername;
//
//    @Value("${mqtt.version}")
//    private String mqttVersion;
//
//    @Value("${mqtt.password}")
//    private String mqttPassword;
//
//    @Value("${mqtt.connectAttemptsMax}")
//    private long mqttConnectAttemptsMax;
//
//    @Value("${mqtt.reconnectAttemptsMax}")
//    private long mqttReconnectAttemptsMax;
//
//    //是否开启mqtt功能
//    @Value("${mqtt.enable}")
//    private boolean mqttEnabled;
//
//    public String getMqttHost() {
//        return mqttHost;
//    }
//
//    public void setMqttHost(String mqttHost) {
//        this.mqttHost = mqttHost;
//    }
//
//    public String getMqttUsername() {
//        return mqttUsername;
//    }
//
//    public void setMqttUsername(String mqttUsername) {
//        this.mqttUsername = mqttUsername;
//    }
//
//    public String getMqttVersion() {
//        return mqttVersion;
//    }
//
//    public void setMqttVersion(String mqttVersion) {
//        this.mqttVersion = mqttVersion;
//    }
//
//    public String getMqttPassword() {
//        return mqttPassword;
//    }
//
//    public void setMqttPassword(String mqttPassword) {
//        this.mqttPassword = mqttPassword;
//    }
//
//    public long getMqttConnectAttemptsMax() {
//        return mqttConnectAttemptsMax;
//    }
//
//    public void setMqttConnectAttemptsMax(long mqttConnectAttemptsMax) {
//        this.mqttConnectAttemptsMax = mqttConnectAttemptsMax;
//    }
//
//    public long getMqttReconnectAttemptsMax() {
//        return mqttReconnectAttemptsMax;
//    }
//
//    public void setMqttReconnectAttemptsMax(long mqttReconnectAttemptsMax) {
//        this.mqttReconnectAttemptsMax = mqttReconnectAttemptsMax;
//    }
//
//    public boolean isMqttEnabled() {
//        return mqttEnabled;
//    }
//
//    public void setMqttEnabled(boolean mqttEnabled) {
//        this.mqttEnabled = mqttEnabled;
//    }
//}
