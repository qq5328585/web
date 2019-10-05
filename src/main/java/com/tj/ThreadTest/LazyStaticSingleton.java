package com.tj.ThreadTest;

/**
 * 2019/10/4
 * author:ljh
 */
public class LazyStaticSingleton {

    private LazyStaticSingleton() {
        if(InitLazyStaticSingleton.lazyStaticSingleton != null) {
            System.out.println("不允许实例化");
        }
    }

    private static class InitLazyStaticSingleton {
        private static final LazyStaticSingleton lazyStaticSingleton = new LazyStaticSingleton();
    }

    public LazyStaticSingleton getInstance() {
        return InitLazyStaticSingleton.lazyStaticSingleton;
    }
}
