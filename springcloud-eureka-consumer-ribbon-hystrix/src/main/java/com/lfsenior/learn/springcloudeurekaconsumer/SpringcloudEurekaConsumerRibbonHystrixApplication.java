package com.lfsenior.learn.springcloudeurekaconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @EnableDiscoveryClient注解用来将当前应用加入到服务治理体系中。
 */
@EnableDiscoveryClient
@EnableCircuitBreaker
@SpringBootApplication
public class SpringcloudEurekaConsumerRibbonHystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEurekaConsumerRibbonHystrixApplication.class, args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
