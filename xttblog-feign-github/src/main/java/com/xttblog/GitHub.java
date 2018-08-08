package com.xttblog;

import feign.Param;
import feign.RequestLine;

import java.util.List;

/**
 * Github
 *
 * @author xtt
 * @date 2018/8/8 上午9:47
 */
public interface GitHub {
    @RequestLine("GET /repos/{owner}/{repo}/contributors")
    List<Contributor> contributors(@Param("owner") String owner, @Param("repo") String repo);
}
