package com.gp20200322.interpreter;

import org.apache.commons.lang.StringUtils;

import java.util.Stack;

/**
 * 2020/3/22
 * author:ljh
 */
public class Calculator {
    private Stack<INumInterpreter> numInterpreters = new Stack<INumInterpreter>();
    private Stack<IOperator> operators = new Stack<IOperator>();

    public Calculator(String expression) {
        parse(expression);
    }

    private void parse(String expression) {
        String[] elements = StringUtils.split(expression, " ");

        for(String element : elements) {
            if(OperatorUtil.isOperator(element)) {
                IOperator operator = OperatorUtil.getOperator(element);
                if(operator == null) {
                    throw new UnsupportedOperationException("您输入的公式包含非法字符!");
                }
                if(!operators.isEmpty()) {
                    if(OperatorUtil.isPop(operators.peek(), operator)) {
                        getBetweenValue();
                    }
                }
                operators.push(operator);
            } else {
                numInterpreters.push(new NumInterpreter(Double.valueOf(element)));
            }
        }
    }

    private void getBetweenValue() {
        IOperator operator = operators.pop();
        INumInterpreter right = numInterpreters.pop();
        INumInterpreter left = numInterpreters.pop();
        numInterpreters.push(new NumInterpreter(operator.calculate(left, right)));
    }

    public double getFinalValue() {

        Stack<INumInterpreter> finalNumStack = new Stack<INumInterpreter>();
        Stack<IOperator> finalOperatorStack = new Stack<IOperator>();

        for(int i = numInterpreters.size(); i > 0; i--) {
            INumInterpreter numInterpreter = numInterpreters.pop();
            finalNumStack.push(numInterpreter);
        }

        for(int i = operators.size(); i > 0; i--) {
            IOperator operator = operators.pop();
            finalOperatorStack.push(operator);
        }

        while(!finalOperatorStack.isEmpty()) {
            IOperator operator = finalOperatorStack.pop();
            INumInterpreter left = finalNumStack.pop();
            INumInterpreter right = finalNumStack.pop();
            finalNumStack.push(new NumInterpreter(operator.calculate(left, right)));
        }
        return finalNumStack.pop().interpret();
    }
}
