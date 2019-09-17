package com.tj.pattern.factoryPattern.AbstractFactoryMethod.impl;

import com.tj.pattern.factoryPattern.AbstractFactoryMethod.ILifeFactory;
import com.tj.pattern.factoryPattern.ICourse;
import com.tj.pattern.factoryPattern.IWork;
import com.tj.pattern.factoryPattern.JavaCourse;
import com.tj.pattern.factoryPattern.JavaWork;

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
