package com.xttblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * RibbonApplication
 *
 * @author xtt
 * @date 2018/8/9 上午10:04
 */
@SpringBootApplication
@EnableDiscoveryClient
//开启断路器功能
@EnableCircuitBreaker
public class RibbonHystrixApplication {

    //开启软均衡负载
    @LoadBalanced
    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(RibbonHystrixApplication.class, args);
    }
}
