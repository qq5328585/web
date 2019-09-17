package com.tj.pattern.factoryPattern.AbstractFactoryMethod.impl;

import com.tj.pattern.factoryPattern.AbstractFactoryMethod.ILifeFactory;
import com.tj.pattern.factoryPattern.ICourse;
import com.tj.pattern.factoryPattern.IWork;
import com.tj.pattern.factoryPattern.PythonCourse;
import com.tj.pattern.factoryPattern.PythonWork;

/**
 * 2019/9/17
 * author:ljh
 */
public class LifePythonFactory implements ILifeFactory {
    @Override
    public ICourse getCourse() {
        return new PythonCourse();
    }

    @Override
    public IWork getWork() {
        return new PythonWork();
    }
}
