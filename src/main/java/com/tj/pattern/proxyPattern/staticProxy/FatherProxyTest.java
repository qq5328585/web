package com.tj.pattern.proxyPattern.staticProxy;

/**
 * 2019/10/26
 * author:ljh
 */
public class FatherProxyTest {
    public static void main(String[] args) {
        Father father = new Father(new Son());
        father.findLove();
    }
}
