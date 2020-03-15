package com.gp20200315.strategy.payType;

/**
 * 2020/3/15
 * author:ljh
 */
public class AliPay extends Payment {
    @Override
    public String getName() {
        return "支付宝";
    }

    @Override
    protected double getBalance(String uid) {
        return 200;
    }
}
