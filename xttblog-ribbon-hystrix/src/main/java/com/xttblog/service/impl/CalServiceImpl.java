package com.xttblog.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.xttblog.service.CalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * CalServiceImpl
 *
 * @author xtt
 * @date 2018/8/9 上午10:11
 */
@Service
public class CalServiceImpl implements CalService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Override
    //指定断路后的回调方法（回调方法必须与原方法参数类型相同、返回值类型相同、方法名可以不同）
    @HystrixCommand(fallbackMethod="hystrixFallback")
    public Integer add(Integer a, Integer b) {
        String reqURL = "http://com.xttblog-cloud-producer/cal/add?a=" + a + "&b=" + b;
        test();
        return restTemplate.getForEntity(reqURL, Integer.class).getBody();
    }

    public Integer hystrixFallback(Integer a, Integer b){
        System.out.println("服务熔断了。。。。");
        return -1024;
    }

    private void test(){
        ServiceInstance serviceInstance = loadBalancerClient.choose("com.xttblog-cloud-producer");
        System.out.println("Host：" + serviceInstance.getHost()
                + "，ServiceId：" + serviceInstance.getServiceId()
                + "，Port：" + serviceInstance.getPort());
    }
}
