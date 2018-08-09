package com.xttblog.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * CalRemoteServiceHystrixImpl
 *
 * @author xtt
 * @date 2018/8/9 下午1:52
 */
@Component
public class CalRemoteHystrixImpl implements CalRemoteService{
    @Override
    public String add(@RequestParam(value = "a") Integer a, @RequestParam("b") Integer b) {
        return "服务熔断，-10086";
    }
}
