package com.lfsenior.learn.springcloudeurekaconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ProjectName: fzuche
 * @Package: com.lfsenior.learn.springcloudeurekaconsumer
 * @ClassName: HiCoontroller
 * @Author: Dinglp
 * @Description:
 * @Date: 2020/11/23 16:31
 * @Version: 1.0
 */
@RestController
public class HiCoontroller {
    @Autowired
    LoadBalancerClient loadBalancerClient;
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/hi")
    public String hi() {
        // 通过loadBalancerClient的choose函数来负载均衡的选出一个eureka-client的服务实例，
        // 这个服务实例的基本信息存储在ServiceInstance中，然后通过这些对象中的信息拼接出访问
        // /hi接口的详细地址，最后再利用RestTemplate对象实现对服务提供者接口的调用。
        ServiceInstance serviceInstance = loadBalancerClient.choose("eureka-client");
        String url = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/hi";
        System.out.println(url);
        return restTemplate.getForObject(url, String.class);
    }
}
