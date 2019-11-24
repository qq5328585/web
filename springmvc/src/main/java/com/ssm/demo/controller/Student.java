package com.ssm.demo.controller;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @Author:yyz on 2019/11/20
 * @Description:
 */
public class Student implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    private String name;
    private int age;

    //无参构造方法
    public Student() {
        System.out.println("第一步：实例化类");
    }

    /** 设置对象属性
     * @param name the name to set
     */
    public void setName(String name) {
        System.out.println("第二步：设置属性setName()..");
        this.name = name;
    }

    public void setAge(int age) {
        System.out.println("第二步：设置属性setAge..");
        this.age = age;
    }

    //调用BeanNameAware的setBeanName()
    //传递Bean的ID。
    @Override
    public void setBeanName(String name) {
        System.out.println("第三步：调用BeanNameAware的setBeanName(),设置bean的名称也就是spring容器中的名称，也就是id值:"+name);
    }
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("第四步：设置属性setBeanFactory.."+beanFactory.getBean("student").toString());
    }
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("第四步：了解工厂信息ApplicationContext："+applicationContext.getBean("student").toString());
    }

//    @Override
//    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
//        System.out.println("第五步：初始化前执行postProcessBeforeInitialization方法："+beanName);
//        return bean;
//    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("第六步：属性设置后执行的方法");
    }
    //Bean的初始化方法
    public void initStudent() {
        System.out.println("第七步：执行自己配置的初始化方法");
    }

//    @Override
//    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
//        System.out.println("第八步：初始化后执行postProcessAfterInitialization方法："+beanName);
//        return bean;
//    }

    //Bean的使用
    public void play() {
        System.out.println("第九步：Student这个Bean：使用");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("第十步：执行spring的销毁方法");
    }
    //Bean的销毁方法
    public void destroyStudent() {
        System.out.println("第十一步：执行自己配置的销毁方法");
    }

    /* 重写toString
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Student [name = " + name + ",age = "+age+"]";
    }

}
