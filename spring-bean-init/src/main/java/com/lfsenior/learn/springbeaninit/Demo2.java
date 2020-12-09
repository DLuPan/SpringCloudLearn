package com.lfsenior.learn.springbeaninit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: fzuche
 * @Package: com.lfsenior.learn.springbeaninit
 * @ClassName: Demo2
 * @Author: Dinglp
 * @Description:
 * @Date: 2020/11/24 16:06
 * @Version: 1.0
 */
@Component
public class Demo2 {
    @Autowired
    private Demo1 demo1;

    public String demo2(){
        System.out.println("当前Demo2："+demo1.demo1());
        return "方法demo2()";
    }
}
