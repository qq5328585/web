package com.gp20200315.strategy.payType;

import java.util.HashMap;
import java.util.Map;

/**
 * 2020/3/15
 * author:ljh
 */
public class PayStrategy {
    public static final String aliPay = "ALI_PAY";
    public static final String jdPay = "JD_PAY";
    public static final String defaultPay = aliPay;

    private static Map<String, Payment> paymentMap = new HashMap<String, Payment>();

    static {
        paymentMap.put(aliPay, new AliPay());
        paymentMap.put(jdPay, new JDPay());
    }

    public static Payment getPayment(String payKey) {
        if(!paymentMap.containsKey(payKey)) {
            return paymentMap.get(defaultPay);
        }
        return paymentMap.get(payKey);
    }
}
