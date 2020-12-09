package com.lfsenior.learn.springbeaninit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: fzuche
 * @Package: com.lfsenior.learn.springbeaninit
 * @ClassName: Demo1
 * @Author: Dinglp
 * @Description:
 * @Date: 2020/11/24 16:06
 * @Version: 1.0
 */
@Component
public class Demo1 {
    @Autowired
    private Demo2 demo2;
    public String demo1(){
        System.out.println("当前Demo1："+demo2.demo2());
        return "方法demo1()";
    }
}
