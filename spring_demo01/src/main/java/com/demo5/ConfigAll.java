package com.demo5;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.demo5")
public class ConfigAll {
    public ConfigAll() {
        System.out.println("配置类ConfigAll启动~~~");
    }
}
