package com.zhangfuyin.dc;

import com.zhangfuyin.ac.AC;

public class JapanAdapter implements DC5vAdapter {


    private final int voltage = 110;

    public boolean support(AC ac) {
        if(voltage == ac.outputAC()){
            return  true;
        }
        return false;
    }

    public int outputDC5v(AC ac) {
        System.out.println("日本适配器 输出5V直流电");
        return 5;
    }
}
