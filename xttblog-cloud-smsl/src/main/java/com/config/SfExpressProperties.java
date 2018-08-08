package com.config;

import org.springframework.beans.factory.annotation.Value;

/**
 * SfExpressProperties
 *
 * @author xtt
 * @date 2018/8/6 下午1:21
 */
public class SfExpressProperties {

    @Value("${sf.server.url}")
    private String serverUrl = "http://bsp-oisp.sf-express.com/bsp-oisp/sfexpressService";

    @Value("${sf.client.code}")
    private String clientCode = "JNXXJS";


    private String checkWord = "nI9pfcOIJGAVzHgrgQoWeilvyJJftgCE";
}
