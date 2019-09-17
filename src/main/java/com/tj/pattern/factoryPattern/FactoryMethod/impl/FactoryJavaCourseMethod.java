package com.tj.pattern.factoryPattern.FactoryMethod.impl;

import com.tj.pattern.factoryPattern.FactoryMethod.IFactoryCourseMethod;
import com.tj.pattern.factoryPattern.ICourse;
import com.tj.pattern.factoryPattern.JavaCourse;

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
