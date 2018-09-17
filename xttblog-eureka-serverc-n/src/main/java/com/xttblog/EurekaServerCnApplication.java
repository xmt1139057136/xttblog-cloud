package com.xttblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * EurekaServerCnApplication
 *
 * @author xtt
 * @date 2018/9/17 下午5:56
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerCnApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerCnApplication.class, args);
    }
}
