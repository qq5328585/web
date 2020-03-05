package com.gp20200226.factory;

import com.gp20200226.GyPay;
import com.gp20200226.produce.IPay;

/**
 * 2020/2/26
 * author:ljh
 */
public class KjPayFactory extends AbstarctFactory {
    public IPay createKjPay() {
        super.init();
        return new GyPay();
    }
}
