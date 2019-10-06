package com.tj.pattern.prototype.deepClone;

import com.tj.User;

import java.util.ArrayList;

/**
 * 2019/10/6
 * author:ljh
 */
public class DeepCloneTest {

    public static void main(String[] args) {
        //ArrayList.clone属于浅克隆,对于引用类型克隆对象发生变化,原对象也会发生变化
        ArrayList<Object> list = new ArrayList<Object>();
        User u = new User();
        u.setName("张三");
        u.setAge(18);
        u.setSex("男");
        list.add(u);
        list.add("123");
        list.add(111);

        ArrayList<Object> list1 = (ArrayList<Object>)list.clone();
        ((User)list1.get(0)).setAge(19);
        String a = (String)list1.get(1);
        a = "222";
        list1.set(1, "333");
        int b = (int)list1.get(2);
        b = 5;
        list1.set(2, 555);

        System.out.println(((User)list.get(0)).getAge());
        System.out.println(((User)list1.get(0)).getAge());

        System.out.println(list.get(1));
        System.out.println(list1.get(1));

        System.out.println(list.get(2));
        System.out.println(list1.get(2));


        QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();
        QiTianDaSheng qiTianDaSheng1 = (QiTianDaSheng) qiTianDaSheng.clone();
        System.out.println("比较深克隆: " + (qiTianDaSheng.jinGuBang == qiTianDaSheng1.jinGuBang));

    }
}
