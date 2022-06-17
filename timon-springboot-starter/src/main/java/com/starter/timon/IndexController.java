package com.starter.timon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Timon
 * @date 2022/6/17 11:40
 */
@RestController
public class IndexController {

    HelloProperties helloProperties;

    public IndexController(HelloProperties helloProperties) {
        this.helloProperties = helloProperties;
    }

    @RequestMapping("/")
    public String index() {
        return helloProperties.getName() + "欢迎";
    }
}
