package xttblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * EurekaClientApplication
 *
 * @author xtt
 * @date 2018/8/5 下午1:54
 */
@SpringBootApplication
@EnableDiscoveryClient
public class XttblogProducerApplication {
    public static void main(String[] args) {
        SpringApplication.run(XttblogProducerApplication.class, args);
    }
}
