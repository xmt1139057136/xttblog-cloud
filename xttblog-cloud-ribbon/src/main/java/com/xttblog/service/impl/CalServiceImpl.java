package com.xttblog.service.impl;

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
    public Integer add(Integer a, Integer b) {
        String reqURL = "http://xttblog-cloud-producer/cal/add?a=" + a + "&b=" + b;
        test();
        return restTemplate.getForEntity(reqURL, Integer.class).getBody();
    }

    private void test(){
        ServiceInstance serviceInstance = loadBalancerClient.choose("xttblog-cloud-producer");
        System.out.println("Host：" + serviceInstance.getHost()
                + "，ServiceId：" + serviceInstance.getServiceId()
                + "，Port：" + serviceInstance.getPort());
    }
}
