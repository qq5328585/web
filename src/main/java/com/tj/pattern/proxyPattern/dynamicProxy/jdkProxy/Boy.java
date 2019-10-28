package com.tj.pattern.proxyPattern.dynamicProxy.jdkProxy;

/**
 * 2019/10/28
 * author:ljh
 */
public class Boy implements BoyInterface {
    @Override
    public void findJob() {
        System.out.println("找工作");
    }
}
