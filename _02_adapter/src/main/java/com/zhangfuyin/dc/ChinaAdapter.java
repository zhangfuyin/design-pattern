package com.zhangfuyin.dc;

import com.zhangfuyin.ac.AC;


/**
 * 中国适配器 将220伏交流电转成5伏的直流电
 */
public class ChinaAdapter implements DC5vAdapter {


    public static final int voltage = 220;


    public boolean support(AC ac) {
        if(voltage == ac.outputAC()){
            return true;
        }
        return false;
    }

    public int outputDC5v(AC ac) {
        System.out.println("中国适配器 输出5V直流电");
        return 5;
    }
}
