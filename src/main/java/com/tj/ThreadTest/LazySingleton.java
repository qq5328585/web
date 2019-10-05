package com.tj.ThreadTest;

/**
 * 2019/10/4
 * author:ljh
 */
public class LazySingleton {
    private LazySingleton() {}

    private static LazySingleton lazySingleton = null;

    public static LazySingleton getInstance() {
        if(lazySingleton == null) {
            synchronized (LazySingleton.class) {
                if(lazySingleton == null) {
                    lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }
}
