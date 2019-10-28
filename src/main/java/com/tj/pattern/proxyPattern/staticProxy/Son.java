package com.tj.pattern.proxyPattern.staticProxy;

import com.tj.pattern.proxyPattern.Person;

/**
 * 2019/10/26
 * author:ljh
 */
public class Son implements Person {
    @Override
    public void findLove() {
        System.out.println("肤白貌美大长腿");
    }
}
