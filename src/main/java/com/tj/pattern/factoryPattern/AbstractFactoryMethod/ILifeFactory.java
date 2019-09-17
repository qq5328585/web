package com.tj.pattern.factoryPattern.AbstractFactoryMethod;

import com.tj.pattern.factoryPattern.ICourse;
import com.tj.pattern.factoryPattern.IWork;

/**
 * 2019/9/17
 * author:ljh
 */
public interface ILifeFactory {
    ICourse getCourse();
    IWork getWork();
}
