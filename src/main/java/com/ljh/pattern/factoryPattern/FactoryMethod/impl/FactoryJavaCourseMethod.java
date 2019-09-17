package com.ljh.pattern.factoryPattern.FactoryMethod.impl;

import com.ljh.pattern.factoryPattern.FactoryMethod.IFactoryCourseMethod;
import com.ljh.pattern.factoryPattern.ICourse;
import com.ljh.pattern.factoryPattern.JavaCourse;

/**
 * 2019/9/13
 * author:ljh
 */
public class FactoryJavaCourseMethod implements IFactoryCourseMethod {
    @Override
    public ICourse getCourse() {
        return new JavaCourse();
    }
}
