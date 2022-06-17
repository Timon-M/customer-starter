package com.starter.timon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Timon
 * @date 2022/6/17 11:45
 */
@Configuration
@ConditionalOnProperty(value = "timon.hello.name")
@EnableConfigurationProperties(HelloProperties.class)
public class HelloAutoConfitguration {

    @Autowired
    HelloProperties helloProperties;

    @Bean
    public IndexController indexController() {
        return new IndexController(helloProperties);
    }
}
