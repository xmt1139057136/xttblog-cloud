package com.xttblog.controller;

import com.xttblog.service.CalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.xttblog.service.CalRemoteService;

/**
 * ConsumerController
 *
 * @author xtt
 * @date 2018/8/7 下午5:25
 */
@RestController
@RequestMapping("/test")
public class ConsumerController {

    @Autowired
    private CalService calService;

    @Autowired
    private CalRemoteService calRemoteService;

    @RequestMapping("/add")
    public String add(@RequestParam Integer a, @RequestParam Integer b){
        return a + "+" + b + "的RestTemplate调用结果为：" + calService.add(a, b);
    }

    @RequestMapping("/radd")
    public String rAdd(@RequestParam Integer a, @RequestParam Integer b){
        return a + "+" + b + "的Cloud调用结果为：" + calRemoteService.add(a, b);
    }
}
