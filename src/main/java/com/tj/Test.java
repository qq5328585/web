package com.tj;

import com.tj.staticClass.ProtectedClass;

/**
 * 2019/8/31
 * author:ljh
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("你好啊");
        System.out.println("你好啊");
        User u1 = new User();
        User u2 = new User();
        System.out.println(u1);
        System.out.println(u2);
        System.out.println(u1.getUser(u2));
        //不同包下protected无法使用
//        ProtectedClass pc = new ProtectedClass();
//        pc.test();

        int i = 0;
        System.out.println(i);
        System.out.println(--i + i + ++i);
        System.out.println(i);

        User.test();
    }
}
