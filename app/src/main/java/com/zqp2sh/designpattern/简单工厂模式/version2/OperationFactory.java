package com.zqp2sh.designpattern.简单工厂模式.version2;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月08日 21:09
 */

public class OperationFactory {
    public static Operation createOperation(String flag) {
        Operation operation = null;
        switch (flag) {
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
                operation = new OperationMul();
                break;
            case "/":
                operation = new OperationDiv();
                break;
        }
        return operation;
    }
}
