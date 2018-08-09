package com.xttblog.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * CalRemoteService
 *
 * @author xtt
 * @date 2018/8/7 下午6:09
 */
@FeignClient(name= "com.xttblog-cloud-producer")
public interface CalRemoteService {
    @RequestMapping(value = "/cal/add")
    public String add(@RequestParam(value="a") Integer a, @RequestParam("b") Integer b);
}
