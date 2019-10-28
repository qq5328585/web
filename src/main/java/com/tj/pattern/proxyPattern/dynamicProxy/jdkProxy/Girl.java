package com.tj.pattern.proxyPattern.dynamicProxy.jdkProxy;

import com.tj.pattern.proxyPattern.Person;

/**
 * 2019/10/27
 * author:ljh
 */
public class Girl implements Person {
    @Override
    public void findLove() {
        System.out.println("高富帅");
        System.out.println("身高180cm");
        System.out.println("家里资产千万");
    }
}
