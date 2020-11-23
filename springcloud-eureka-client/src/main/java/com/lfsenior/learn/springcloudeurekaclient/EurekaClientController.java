package com.lfsenior.learn.springcloudeurekaclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: fzuche
 * @Package: com.lfsenior.learn.springcloudeurekaclient
 * @ClassName: EurekaClientController
 * @Author: Dinglp
 * @Description:
 * @Date: 2020/11/23 16:01
 * @Version: 1.0
 */
@RestController
public class EurekaClientController {
    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String home(@RequestParam(value = "name", defaultValue = "lfsenior") String name) {
        return "hi " + name + " ,i am from port:" + port;
    }
}
