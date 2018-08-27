package com.xttblog.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * XttblogController
 *
 * @author xtt
 * @date 2018/8/13 上午11:10
 */
@RestController
public class XttblogController {

    @Value("${site.url}")
    private String url;
    @Value("${site.active}")
    private String active;

    @RequestMapping("/test")
    public String test(){
        return "test：test config client, url: " + url + ",active: " + active;
    }
}
