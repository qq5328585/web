package com.tj.ThreadTest;

/**
 * 2019/10/4
 * author:ljh
 */
public class ThreadLocalSingleton {

    private ThreadLocalSingleton() {}

    private static final ThreadLocal<ThreadLocalSingleton> tls = new ThreadLocal<ThreadLocalSingleton>() {
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    public static ThreadLocalSingleton getInstance() {
        return tls.get();
    }

}
