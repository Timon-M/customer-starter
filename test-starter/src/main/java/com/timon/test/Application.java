package com.timon.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;

/**
 * @author Timon
 * @date 2022/6/17 11:57
 */
@SpringBootApplication
@ConditionalOnProperty(value = "timon.hello.name")
public class Application {

    public static void main(String[] args) {
        new SpringApplication().run(Application.class);
    }
}
