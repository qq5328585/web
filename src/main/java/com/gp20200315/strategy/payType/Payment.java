package com.gp20200315.strategy.payType;

import com.gp20200315.strategy.MsgResult;

/**
 * 2020/3/15
 * author:ljh
 */
public abstract class Payment {
    public abstract String getName();

    public MsgResult pay(String uid, double amount) {
        if(getBalance(uid) < amount) {
            return new MsgResult("500", "支付失败", "余额不足");
        }
        return new MsgResult("200", "支付成功", "支付金额" + amount);
    }

    protected abstract double getBalance(String uid);
}
