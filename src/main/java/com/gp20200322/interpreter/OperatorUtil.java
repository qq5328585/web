package com.gp20200322.interpreter;

public class OperatorUtil {

    public static boolean isOperator(String element) {
        return (element.equals("+") || element.equals("-") || element.equals("*")|| element.equals("/"));
    }

    public static IOperator getOperator(String element) {
        if (element.equals("+")) {
            return new AddOperator();
        } else if (element.equals("-")) {
            return new SubOperator();
        } else if (element.equals("*")) {
            return new MulOperator();
        } else if (element.equals("/")) {
            return new DivOperator();
        }
        return null;
    }

    public static boolean isPop(IOperator o1, IOperator o2) {
        return o1.getLevel() - o2.getLevel() >= 0;
    }
}