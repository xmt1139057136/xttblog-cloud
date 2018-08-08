package com.xttblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * EurekaClientApplication
 *
 * @author xtt
 * @date 2018/8/5 下午1:54
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class XttblogConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(XttblogConsumerApplication.class, args);
    }
}
