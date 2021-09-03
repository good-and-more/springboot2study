package com.example.springbootmqtt.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "mqtt")
public class Mqtt2Config {
    private String host;
    private String version;
    private String username;
    private String password;
    private MsgTopic msgTopic = new MsgTopic();

    public static class MsgTopic {
        private String testTopic;
        private String streamStart;
        private String streamStop;

        public String getTestTopic() {
            return testTopic;
        }

        public void setTestTopic(String testTopic) {
            this.testTopic = testTopic;
        }

        public String getStreamStart() {
            return streamStart;
        }

        public void setStreamStart(String streamStart) {
            this.streamStart = streamStart;
        }

        public String getStreamStop() {
            return streamStop;
        }

        public void setStreamStop(String streamStop) {
            this.streamStop = streamStop;
        }
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public MsgTopic getMsgTopic() {
        return msgTopic;
    }

    public void setMsgTopic(MsgTopic msgTopic) {
        this.msgTopic = msgTopic;
    }
}
