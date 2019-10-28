package com.tj.pattern.proxyPattern.dynamicProxy.privateproxy;

import com.tj.pattern.proxyPattern.Person;

/**
 * 2019/10/28
 * author:ljh
 */
public class SuccessPeople implements Person {
    @Override
    public void findLove() {
        System.out.println("我是成功人士");
        System.out.println("我的要求是:肤白貌美大长腿");
        System.out.println("我的额外要求是:研究生学历");
    }
}
