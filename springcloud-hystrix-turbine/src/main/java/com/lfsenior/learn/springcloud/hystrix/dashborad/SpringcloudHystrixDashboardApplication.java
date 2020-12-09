package com.lfsenior.learn.springcloud.hystrix.dashborad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
import org.springframework.context.annotation.Configuration;

/**
 * @EnableDiscoveryClient注解用来将当前应用加入到服务治理体系中。
 */
@Configuration
@EnableAutoConfiguration
@EnableTurbine
@EnableDiscoveryClient
public class SpringcloudHystrixDashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudHystrixDashboardApplication.class, args);
    }
}
