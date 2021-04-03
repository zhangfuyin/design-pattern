package com.zhangfuyin.dynamic.cglib;

public class MyTest {

    public  static void main(String agrs[]){

        UserManagerService userManagerService = new UserManagerService();

       CglibProxyFactory<UserManagerService> factory = new CglibProxyFactory();
        UserManagerService proxy =  factory.getProxyInstance(userManagerService);
        proxy.addUser();


    }
}