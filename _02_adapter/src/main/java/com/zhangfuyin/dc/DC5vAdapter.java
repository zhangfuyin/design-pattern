package com.zhangfuyin.dc;

import com.zhangfuyin.ac.AC;

/**
 * 输出5伏的适配器
 */
public interface DC5vAdapter {

    /**
     * 输入的电压是否与适配器匹配
     * @param ac
     * @return
     */
    boolean support(AC ac);

    /**
     * 输入的电压变换为 5V 后输出
     * @param ac
     * @return
     */
    int outputDC5v(AC ac);
}
