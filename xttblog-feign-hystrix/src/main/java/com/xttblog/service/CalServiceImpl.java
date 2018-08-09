package com.xttblog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * CalServiceImpl
 *
 * @author xtt
 * @date 2018/8/7 下午5:29
 */
@Service
public class CalServiceImpl implements CalService{

    @Autowired
    private RestTemplate restTemplate;

    @Bean
    //@LoadBalanced//启用ribbon负载均衡调用服务
    public RestTemplate cteateRestTemplate(){
        return new RestTemplate();
    }

    @Override
    public String add(Integer a, Integer b) {
        String url = "http://localhost:8888/cal/add?a=" + a + "&b=" + b;
        ResponseEntity responseEntity = restTemplate.getForEntity(url,String.class);
        return responseEntity.getBody().toString();
    }
}
