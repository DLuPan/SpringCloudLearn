package com.lfsenior.learn.springcloudeurekaconsumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ProjectName: fzuche
 * @Package: com.lfsenior.learn.springcloudeurekaconsumer
 * @ClassName: HiClient
 * @Author: Dinglp
 * @Description:
 * @Date: 2020/11/23 17:14
 * @Version: 1.0
 */

/**
 * 创建一个Feign的客户端接口定义。使用@FeignClient注解来指定这个接口所要调用的服务名称，
 * 接口中定义的各个函数使用Spring MVC的注解就可以来绑定服务提供方的REST接口，比如下面就
 * 是绑定eureka-client服务的/hi接口的例子：
 */
@FeignClient("eureka-client")
public interface HiClient {
    @GetMapping("/hi")
    String hi();
}
