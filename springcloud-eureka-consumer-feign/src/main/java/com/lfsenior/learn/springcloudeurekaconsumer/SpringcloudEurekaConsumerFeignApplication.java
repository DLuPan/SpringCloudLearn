package com.lfsenior.learn.springcloudeurekaconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @EnableDiscoveryClient注解用来将当前应用加入到服务治理体系中。
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class SpringcloudEurekaConsumerFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEurekaConsumerFeignApplication.class, args);
    }
}
