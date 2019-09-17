package com.ljh.pattern.factoryPattern.AbstractFactoryMethod.impl;

import com.ljh.pattern.factoryPattern.AbstractFactoryMethod.ILifeFactory;
import com.ljh.pattern.factoryPattern.ICourse;
import com.ljh.pattern.factoryPattern.IWork;
import com.ljh.pattern.factoryPattern.JavaCourse;
import com.ljh.pattern.factoryPattern.JavaWork;

/**
 * 2019/9/17
 * author:ljh
 */
public class LifeJavaFactory implements ILifeFactory {
    @Override
    public ICourse getCourse() {
        return new JavaCourse();
    }

    @Override
    public IWork getWork() {
        return new JavaWork();
    }
}
