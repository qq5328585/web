package com.gp20200226;

import com.gp20200226.produce.IPay;

/**
 * 2020/2/26
 * author:ljh
 */
public class YlPay implements IPay {
    public void pay() {
        System.out.println("这是银联支付");
    }
}
