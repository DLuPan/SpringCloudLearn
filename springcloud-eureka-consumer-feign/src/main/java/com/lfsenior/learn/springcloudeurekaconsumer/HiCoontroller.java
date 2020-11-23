package com.lfsenior.learn.springcloudeurekaconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
    private HiClient hiClient;

    @GetMapping("/hi")
    public String hi() {
        return hiClient.hi();
    }
}
