package com.tj.pattern.singletonPattern.lazyPattern;

/**
 * 2019/9/21
 * author:ljh
 */
public class LazySingletonFactory {
    private static LazySingletonFactory lazySingletonFactory = null;

    private LazySingletonFactory() {}

    public static LazySingletonFactory getInstance() {
        if(lazySingletonFactory == null) {
            synchronized (LazySingletonFactory.class) {
                if(lazySingletonFactory == null) {
                    lazySingletonFactory = new LazySingletonFactory();
                }
            }
        }
        return lazySingletonFactory;
    }
}
