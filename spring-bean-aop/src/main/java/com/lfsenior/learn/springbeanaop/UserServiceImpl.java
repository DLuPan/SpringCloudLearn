package com.lfsenior.learn.springbeanaop;

import org.springframework.stereotype.Service;

/**
 * @ProjectName: fzuche
 * @Package: com.lfsenior.learn.springbeanaop
 * @ClassName: UserServerImpl
 * @Author: Dinglp
 * @Description: 實現
 * @Date: 2020/11/25 9:27
 * @Version: 1.0
 */
@Service
public class UserServiceImpl implements UserService{
    @Override
    public void add() {
        System.out.println("添加方法");
    }

    @Override
    public void delete() {
        System.out.println("删除方法");
    }
}
