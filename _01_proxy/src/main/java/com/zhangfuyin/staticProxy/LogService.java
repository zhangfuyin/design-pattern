package com.zhangfuyin.staticProxy;


/**
 * 静态代理的特点：再程序未编译之前 代理对象就硬绑定目标对象
 */
public class LogService implements UserManagerService {


    private UserManagerService userManagerService;

    public LogService(UserManagerService userManagerService) {
        this.userManagerService = userManagerService;
    }

    /**
     * 再添加用户之前进行日志打印
     * @return
     */
    @Override
    public String addUser() {

        System.out.println("================日志打印=============");

        return userManagerService.addUser();

    }
}
