package com.nacos;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Mr.SoftRock
 * @Date 2021/3/1909:03
 **/
@SpringBootApplication
@EnableDubbo(scanBasePackages = "com.nacos.impl")
public class SpringBootNacosApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootNacosApplication.class, args);
    }

}
