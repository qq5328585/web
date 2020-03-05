package com.gp20200226.factory;

import com.gp20200226.WxPay;
import com.gp20200226.YlPay;
import com.gp20200226.ZfbPay;
import com.gp20200226.produce.IPay;

/**
 * 2020/2/26
 * author:ljh
 */
public class GnPayFactory extends AbstarctFactory {
    protected IPay createZfbPay() {
        super.init();
        return new ZfbPay();
    }

    protected IPay createWxPay() {
        super.init();
        return new WxPay();
    }

    protected IPay createYlPay() {
        super.init();
        return new YlPay();
    }
}
