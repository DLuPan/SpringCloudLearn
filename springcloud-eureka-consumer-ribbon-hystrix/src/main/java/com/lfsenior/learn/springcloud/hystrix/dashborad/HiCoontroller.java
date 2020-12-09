package com.lfsenior.learn.springcloud.hystrix.dashborad;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
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
    private ConsumerService consumerService;

    @GetMapping("/hi")
    public String hi() {
        return consumerService.hi();
    }

    @Component
    class ConsumerService {
        @Autowired
        RestTemplate restTemplate;


        @HystrixCommand(fallbackMethod = "fallback")
        public String hi() {
            return restTemplate.getForObject("http://eureka-client/hi", String.class);
        }

        public String fallback() {
            return "fallback";
        }
    }
}
