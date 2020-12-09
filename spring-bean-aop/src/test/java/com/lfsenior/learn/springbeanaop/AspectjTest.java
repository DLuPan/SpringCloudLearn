package com.lfsenior.learn.springbeanaop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ProjectName: fzuche
 * @Package: com.lfsenior.learn.springbeanaop
 * @ClassName: AspectjTest
 * @Author: Dinglp
 * @Description:
 * @Date: 2020/11/25 9:34
 * @Version: 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@EnableAspectJAutoProxy
@SpringBootTest(classes = {SpringBeanAopApplication.class})
public class AspectjTest {
    @Autowired
    private UserService userService;

    @Test
    public void test(){
        userService.add();
    }

}
