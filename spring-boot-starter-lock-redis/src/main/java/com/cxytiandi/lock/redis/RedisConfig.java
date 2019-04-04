package com.cxytiandi.lock.redis;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "spring.redis")
@Data
public class RedisConfig {
    private String host;
    private int port;
    private String password;
    private int maxActive = 50;
    private int maxIdle = 50;
    private int minIdle = 10;
    private int maxWait = 10000;
}
