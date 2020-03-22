package com.gp20200322.interpreter;

/**
 * 2020/3/22
 * author:ljh
 */
public class AddOperator implements IOperator {
    @Override
    public double calculate(INumInterpreter left, INumInterpreter right) {
        return left.interpret() + right.interpret();
    }

    @Override
    public int getLevel() {
        return 1;
    }
}
