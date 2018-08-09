package com.xttblog.controller;

import com.xttblog.controller.service.CalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * RibbonController
 *
 * @author xtt
 * @date 2018/8/9 上午10:08
 */
@RestController
public class RibbonController {

    @Autowired
    CalService calService;

    @RequestMapping("/test")
    public String test(@RequestParam Integer a, @RequestParam Integer b){
        return a + "+" + b + "的计算结果为：" + calService.add(a, b);
    }
}
