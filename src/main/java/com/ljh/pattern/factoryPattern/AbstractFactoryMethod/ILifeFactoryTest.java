package com.ljh.pattern.factoryPattern.AbstractFactoryMethod;

import com.ljh.pattern.factoryPattern.AbstractFactoryMethod.impl.LifeJavaFactory;
import com.ljh.pattern.factoryPattern.AbstractFactoryMethod.impl.LifePythonFactory;
import com.ljh.pattern.factoryPattern.ICourse;
import com.ljh.pattern.factoryPattern.IWork;

/**
 * 2019/9/17
 * author:ljh
 */
public class ILifeFactoryTest {
    public static void main(String[] args) {
        ILifeFactory javaLifeFactory = new LifeJavaFactory();
        ICourse javaCourse = javaLifeFactory.getCourse();
        IWork javaWork = javaLifeFactory.getWork();
        javaCourse.read();
        javaWork.work();
        ILifeFactory pythonLifeFactory = new LifePythonFactory();
        ICourse pythonCoures = pythonLifeFactory.getCourse();
        IWork pythonWork = pythonLifeFactory.getWork();
        pythonCoures.read();
        pythonWork.work();
    }
}
