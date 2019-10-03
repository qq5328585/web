package com.tj.pattern.singletonPattern.hungryPattern;

/**
 * 2019/9/21
 * author:ljh
 */
public class HungrySingletonFactoryTest {
    public static void main(String[] args) {
        HungrySingletonFactory h1 = HungrySingletonFactory.getInstance();
        System.out.println(h1);
        HungrySingletonFactory h2 = HungrySingletonFactory.getInstance();
        System.out.println(h2);
    }
}
