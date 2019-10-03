package com.tj.pattern.singletonPattern.hungryPattern;

/**
 * 2019/9/21
 * author:ljh
 */
public class HungrySingletonFactory {
    private static final HungrySingletonFactory hungrySingletonFactory;

    static {
        hungrySingletonFactory = new HungrySingletonFactory();
    }

    private HungrySingletonFactory() {}

    public static HungrySingletonFactory getInstance() {
        return hungrySingletonFactory;
    }
}
