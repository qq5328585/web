package com.gp20200322.interpreter;

/**
 * 2020/3/22
 * author:ljh
 */
public interface IOperator {
    double calculate(INumInterpreter left, INumInterpreter right);

    int getLevel();
}
