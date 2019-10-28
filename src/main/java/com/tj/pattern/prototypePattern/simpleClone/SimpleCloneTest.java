package com.tj.pattern.prototypePattern.simpleClone;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 2019/10/5
 * author:ljh
 */
public class SimpleCloneTest {
    public static void main(String[] args) {
        SimpleClone simpleClone = new SimpleClone();
        simpleClone.setAge(18);
        simpleClone.setName("张三");
        simpleClone.setDate(new Date());
        List<String> hobbyList = new ArrayList<String>();
        hobbyList.add("排球");
        hobbyList.add("篮球");
        simpleClone.setHobbyList(hobbyList);
        System.out.println(simpleClone);

        Client client = new Client(simpleClone);
        SimpleClone simpleClone1 = (SimpleClone)client.startClone();
        System.out.println(simpleClone1);
        simpleClone1.getHobbyList().add("足球");

        System.out.println("原对象中引用类型地址: " + simpleClone.getHobbyList());
        System.out.println("克隆对象中引用类型地址: " + simpleClone1.getHobbyList());
        System.out.println("克隆对象中引用类型地址: " + simpleClone.getHobbyList());
        System.out.println("原对象与克隆对象中引用类型地址比较: " + (simpleClone.getHobbyList() == simpleClone1.getHobbyList()));
    }
}
