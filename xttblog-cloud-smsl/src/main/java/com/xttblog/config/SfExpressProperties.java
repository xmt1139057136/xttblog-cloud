package com.xttblog.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.beans.ConstructorProperties;

/**
 * SfExpressProperties
 *
 * @author xtt
 * @date 2018/8/6 下午1:21
 */
@Component
public class SfExpressProperties {

    @Value("${sf.server.url}")
    private String serverUrl = "http://bsp-oisp.sf-express.com/bsp-oisp/sfexpressService";

    @Value("${sf.client.code}")
    private String clientCode = "JNXXJS";


    private String checkWord = "nI9pfcOIJGAVzHgrgQoWeilvyJJftgCE";
}
