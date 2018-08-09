package com.xttblog.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * CalController
 *
 * @author xtt
 * @date 2018/8/7 下午5:14
 */
@RestController
@RequestMapping("/cal")
public class CalController {

    @RequestMapping("/add")
    public Integer add(@RequestParam Integer a, @RequestParam Integer b){
        return a + b;
    }

}
