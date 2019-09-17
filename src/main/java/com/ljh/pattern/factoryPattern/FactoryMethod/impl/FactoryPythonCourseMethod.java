package com.ljh.pattern.factoryPattern.FactoryMethod.impl;

import com.ljh.pattern.factoryPattern.FactoryMethod.IFactoryCourseMethod;
import com.ljh.pattern.factoryPattern.ICourse;
import com.ljh.pattern.factoryPattern.PythonCourse;

/**
 * 2019/9/13
 * author:ljh
 */
public class FactoryPythonCourseMethod implements IFactoryCourseMethod {
    @Override
    public ICourse getCourse() {
        return new PythonCourse();
    }
}
