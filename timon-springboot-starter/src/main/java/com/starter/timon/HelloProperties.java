package com.starter.timon;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Timon
 * @date 2022/6/17 11:38
 */
@ConfigurationProperties("timon.hello")
public class HelloProperties {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
