package com.zhangfuyin.dynamic.javaproxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 *
 */
public class LogService implements InvocationHandler {


    private Object targetObject;

    // 根据目标对象获取一个代理对象
    public Object getInstance(Object targetObject){
        this.targetObject = targetObject;
       return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(),
               targetObject.getClass().getInterfaces(),
               this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("================打印日志完成=============");
        return method.invoke(targetObject,args);
    }
}
