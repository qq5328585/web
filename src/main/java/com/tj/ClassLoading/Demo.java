package com.tj.ClassLoading;

/**
 * 2019/10/3
 * author:ljh
 */
public class Demo {
    public Demo() {
        System.out.println("Demo");
    }

    class Super {
        int flag = 1;

        Super() {
            test();
        }

        void test() {
            System.out.println("Super.test() flag=" + flag);
        }
    }

    class Sub extends Super {
//        int flag = 10;

        Sub(int i) {
            flag = i;
            System.out.println("Sub.Sub()flag=" + flag);
        }

        @Override
        void test() {
            System.out.println("Sub.test()flag=" + flag);
        }
    }

    public static void main(String[] args) {
        new Demo().new Sub(5);
    }

}
