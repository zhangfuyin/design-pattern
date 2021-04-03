package com.zhangfuyin;

import com.zhangfuyin.ac.AC;
import com.zhangfuyin.ac.AC110;
import com.zhangfuyin.ac.AC220;
import com.zhangfuyin.dc.ChinaAdapter;
import com.zhangfuyin.dc.DC5vAdapter;
import com.zhangfuyin.dc.JapanAdapter;

import java.util.ArrayList;
import java.util.List;

public class Test {

    private List<DC5vAdapter> adapterList  = new ArrayList();

    public Test(){
        adapterList.add(new ChinaAdapter());
        adapterList.add(new JapanAdapter());
    }


    /**
     * 根据交流电找到合适适配器
     * @param ac
     * @return
     */
    public DC5vAdapter getAdapter(AC ac){

        DC5vAdapter dc5vAdapter = null;
        for(DC5vAdapter item : adapterList){
            if(item.support(ac)){
                dc5vAdapter = item;
                break;
            }
        }
        return dc5vAdapter;

    }



    public static void main(String agrs[]){

        // 在中国
        AC220 ac220 = new AC220();

        Test test = new Test();
        test.getAdapter(ac220).outputDC5v(ac220);

        // 在日本
        AC110 ac110 = new AC110();

        test.getAdapter(ac110).outputDC5v(ac110);





    }

}
