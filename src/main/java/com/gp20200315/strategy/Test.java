package com.gp20200315.strategy;

import com.gp20200315.strategy.payType.PayStrategy;

/**
 * 2020/3/15
 * author:ljh
 */
public class Test {
    public static void main(String[] args) {
        Order order = new Order("1", "287312789479812", 400);
        System.out.println(order.pay(PayStrategy.jdPay));
    }
}
