package com.tj.pattern.singletonPattern.lazyPattern.staticLazyPattern.seriableSingleton;

import java.io.Serializable;

/**
 * 2019/9/28
 * author:ljh
 */
public class SeriableSingleton implements Serializable {
    private static final SeriableSingleton s = new SeriableSingleton();

    private SeriableSingleton() {}

    public static SeriableSingleton getInstance() {
        return s;
    }

    private Object readResolve() {
        return s;
    }
}
