package com.xttblog;

import com.xttblog.filter.XttblogTokenFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * ZuulApplication
 *
 * @author xtt
 * @date 2018/8/10 下午2:22
 */
@SpringBootApplication
@EnableZuulProxy
public class ZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class, args);
    }

//    @Bean
//    public XttblogTokenFilter xttblogTokenFilter() {
//        return new XttblogTokenFilter();
//    }
}
