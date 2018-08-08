package com.xttblog.service;

import com.xttblog.model.Contributor;
import config.XttblogFeignConfiguration;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * FeignService
 *
 * @author xtt
 * @date 2018/8/8 下午2:11
 */
@FeignClient(value = "xttblog-cloud-producer", configuration = XttblogFeignConfiguration.class)
//@FeignClient(name = "xttblog-cloud-producer") 和上面的意思一样
public interface FeignService {
    @RequestMapping(value = "/cal/add")
    public String add(@RequestParam(value="a") Integer a, @RequestParam("b") Integer b);
}