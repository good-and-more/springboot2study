package com.example.springbootmqtt.mqtt;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MqttFactory {

    private static final Logger LOGGER = LoggerFactory.getLogger(MqttFactory.class);
    // 搞不懂为什么这里为什么无法引入配置类，暂时先用常量字符串代替
    private static final String HOST = "tcp://172.16.1.171:1883";
    private static final String USERNAME = "mocar_easy_01";
    private static final String PASSWORD = "mocar_easy_01";
    private static MqttClient client;

    /**
     *   获取客户端实例
     *   单例模式, 存在则返回, 不存在则初始化
     */
    public static MqttClient getInstance() {
        if (client == null) {
            init();
        }
        return client;
    }

    /**
     *   初始化客户端
     */
    public static void init() {
        try {
            client = new MqttClient(HOST, "client-mqtt-demo");
            // MQTT配置对象
            MqttConnectOptions options = new MqttConnectOptions();
            // 设置自动重连, 其它具体参数可以查看MqttConnectOptions
            options.setUserName(USERNAME);
            options.setPassword(PASSWORD.toCharArray());
            options.setMqttVersion(MqttConnectOptions.MQTT_VERSION_3_1_1);
            options.setAutomaticReconnect(true);

            if (!client.isConnected()) {
                client.connect(options);
            }
        } catch (MqttException e) {
            LOGGER.error(String.format("MQTT: 连接消息服务器[%s]失败", HOST));
        }
    }

}

