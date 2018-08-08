package com.xttblog.service;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * XttblogService
 *
 * @author xtt
 * @date 2018/8/8 下午3:17
 */
public interface XttblogService {
    @RequestMapping(method = RequestMethod.GET, value ="/page/{id}")
    List<String> getPage(@PathVariable("id") long id);
}
