package com.tj.ClassLoading;

/**
 * 2019/10/3
 * author:ljh
 */
public class Base {
    String baseName = "base";

    public Base() {
        callName();
    }

    public void callName() {
        System.out.println(baseName);
    }

    static class Sub extends Base {
//        private String baseName = "sub";

        @Override
        public void callName() {
            System.out.println(baseName);
        }
    }

    public static void main(String[] args) {
        Base b = new Sub();
        System.out.println(((Sub)b).baseName);
        Sub s = new Sub();
        System.out.println(s.baseName);
    }
}
