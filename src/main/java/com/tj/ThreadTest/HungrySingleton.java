package com.tj.ThreadTest;

import java.io.Serializable;

/**
 * 2019/10/4
 * author:ljh
 */
public class HungrySingleton implements Serializable {
    private HungrySingleton() {
        if(hungrySingleton1 != null) {
            throw new RuntimeException("不允许实例化");
        }
    }

//    private HungrySingleton hungrySingleton = new HungrySingleton();

    private static final HungrySingleton hungrySingleton1;
    static {
        hungrySingleton1 = new HungrySingleton();
    }

    public static HungrySingleton getInstance() {
        return hungrySingleton1;
    }

    private Object readResolve() {
        return hungrySingleton1;
    }

    private static class InHungrySingleton {
        private static final HungrySingleton hungrySingleton2 = new HungrySingleton();
    }

    public static final HungrySingleton getInstance2() {
        return InHungrySingleton.hungrySingleton2;
    }
}
