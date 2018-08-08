package com.xttblog;

import feign.Feign;
import feign.gson.GsonDecoder;
import java.util.List;

/**
 * FeignTest
 *
 * @author xtt
 * @date 2018/8/8 上午9:50
 */
public class FeignTest {
    public static void main(String... args) {
        //GsonDecoder
        GitHub github = Feign.builder()
                .decoder(new GsonDecoder())
                .target(GitHub.class, "https://api.github.com");

        // Fetch and print a list of the contributors to this library.
        List<Contributor> contributors = github.contributors("OpenFeign", "feign");
        for (Contributor contributor : contributors) {
            System.out.println(contributor.login + " (" + contributor.contributions + ")");
        }
    }
}
