package com.xttblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * HystrixTurbineApplication
 *
 * @author xtt
 * @date 2018/8/10 上午9:56
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrixDashboard
//@EnableTurbineStream
@EnableTurbine
public class HystrixTurbineApplication {
    public static void main(String[] args) {
        SpringApplication.run(HystrixTurbineApplication.class, args);
    }
}
