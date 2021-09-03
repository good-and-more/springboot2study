package com.example.springbootmqtt.mqtt;

import org.eclipse.paho.client.mqttv3.IMqttMessageListener;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author learn_and_think
 */
public class MqttListener implements IMqttMessageListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(MqttListener.class);

    /**
     * 处理消息
     * @param topic 主题 
     * @param mqttMessage 消息 
     */
    @Override
    public void messageArrived(String topic, MqttMessage mqttMessage) {
        LOGGER.info(String.format("MQTT: 订阅主题[%s]发来消息[%s]", topic, new String(mqttMessage.getPayload())));
    }
}
