package com.ljh.pattern.factoryPattern.AbstractFactoryMethod;

import com.ljh.pattern.factoryPattern.ICourse;
import com.ljh.pattern.factoryPattern.IWork;

/**
 * 2019/9/17
 * author:ljh
 */
public interface ILifeFactory {
    ICourse getCourse();
    IWork getWork();
}
