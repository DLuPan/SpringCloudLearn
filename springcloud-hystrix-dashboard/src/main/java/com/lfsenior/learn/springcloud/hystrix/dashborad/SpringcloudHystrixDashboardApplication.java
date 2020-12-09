package com.lfsenior.learn.springcloud.hystrix.dashborad;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @EnableDiscoveryClient注解用来将当前应用加入到服务治理体系中。
 */
@EnableHystrixDashboard
@SpringCloudApplication
public class SpringcloudHystrixDashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudHystrixDashboardApplication.class, args);
    }
}
