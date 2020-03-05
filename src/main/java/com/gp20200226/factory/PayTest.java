package com.gp20200226.factory;

import com.gp20200226.factory.AbstarctFactory;
import com.gp20200226.factory.GnPayFactory;

/**
 * 2020/2/26
 * author:ljh
 */
public class PayTest {
    public static void main(String[] args) {
        GnPayFactory gnFactory = new GnPayFactory();
        gnFactory.createZfbPay().pay();
        gnFactory.createWxPay().pay();
        gnFactory.createYlPay().pay();

        KjPayFactory kjPayFactory = new KjPayFactory();
        kjPayFactory.createKjPay().pay();
    }
}
