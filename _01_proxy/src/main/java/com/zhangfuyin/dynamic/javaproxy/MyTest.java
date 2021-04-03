package com.zhangfuyin.dynamic.javaproxy;

public class MyTest {

    public  static void main(String agrs[]){

        LogService logService = new LogService();
        UserManagerService userManagerService = (UserManagerService)logService.getInstance(new UserManagerSericeImpl());
        userManagerService.addUser();

    }
}