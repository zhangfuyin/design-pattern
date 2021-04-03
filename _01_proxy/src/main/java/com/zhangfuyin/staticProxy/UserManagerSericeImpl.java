package com.zhangfuyin.staticProxy;

/**
 * 工人实现类
 */
public class UserManagerSericeImpl implements UserManagerService {


    @Override
    public String addUser() {
        System.out.println("================添加用户成功===============");
        return "添加用户成功";
    }
}
