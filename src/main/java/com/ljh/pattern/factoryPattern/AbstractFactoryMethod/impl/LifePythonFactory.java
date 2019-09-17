package com.ljh.pattern.factoryPattern.AbstractFactoryMethod.impl;

import com.ljh.pattern.factoryPattern.AbstractFactoryMethod.ILifeFactory;
import com.ljh.pattern.factoryPattern.ICourse;
import com.ljh.pattern.factoryPattern.IWork;
import com.ljh.pattern.factoryPattern.PythonCourse;
import com.ljh.pattern.factoryPattern.PythonWork;

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
