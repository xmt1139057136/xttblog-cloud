package com.xttblog.service;

import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * XttblogClient
 *
 * @author xtt
 * @date 2018/8/8 下午3:19
 */
@FeignClient("test")
public interface XttblogClient extends XttblogService {

}
