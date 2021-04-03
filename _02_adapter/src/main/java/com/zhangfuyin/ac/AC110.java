package com.zhangfuyin.ac;

/**
 * 100伏交流电
 */
public class AC110 implements AC{

    private final int voltage = 110;


    public int outputAC() {
        return voltage;
    }
}

