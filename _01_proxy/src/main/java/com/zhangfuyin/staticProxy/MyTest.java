package com.zhangfuyin.staticProxy;

public class MyTest {

    public  static void main(String agrs[]){

        UserManagerService userManagerService = new UserManagerSericeImpl();

        LogService userMangerProxyService = new LogService(userManagerService );


        userMangerProxyService.addUser();


    }
}
