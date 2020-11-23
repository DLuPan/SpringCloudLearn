package com.lfsenior.learn.springcloudeurekaconsumer;

import org.springframework.beans.factory.annotation.Autowired;
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
    RestTemplate restTemplate;

    @GetMapping("/hi")
    public String hi() {
        // 去掉原来通过LoadBalancerClient选取实例和拼接URL的步骤，直接通过RestTemplate发起请求
        return restTemplate.getForObject("http://eureka-client/hi", String.class);
    }
}
