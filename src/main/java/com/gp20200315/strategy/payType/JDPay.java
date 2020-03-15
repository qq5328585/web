package com.gp20200315.strategy.payType;

/**
 * 2020/3/15
 * author:ljh
 */
public class JDPay extends Payment {
    @Override
    public String getName() {
        return "京东白条";
    }

    @Override
    protected double getBalance(String uid) {
        return 1000;
    }
}
