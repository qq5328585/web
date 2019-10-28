package com.tj.pattern.proxyPattern.staticProxy;


import com.tj.pattern.proxyPattern.Person;

/**
 * 2019/10/26
 * author:ljh
 */
public class Father {
    private Person person;

    public Father(Person person) {
        this.person = person;
    }

    public void findLove() {
        System.out.println("开始物色对象");
        this.person.findLove();
        System.out.println("找到对象了");
    }

}
