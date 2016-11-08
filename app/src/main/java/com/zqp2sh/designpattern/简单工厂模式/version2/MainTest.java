package com.zqp2sh.designpattern.简单工厂模式.version2;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月08日 20:20
 */

public class MainTest {
    public static void main(String[] args) {

        Operation add = OperationFactory.createOperation("+");
        add.mNum1 = 10;
        add.mNum2 = 10;
        System.out.println(add.computer());

        Operation sub = OperationFactory.createOperation("-");
        sub.mNum1 = 1;
        sub.mNum2 = 10;
        System.out.println(sub.computer());

        Operation mul = OperationFactory.createOperation("*");
        mul.mNum1 = 10;
        mul.mNum2 = 10;
        System.out.println(mul.computer());

        Operation div = OperationFactory.createOperation("/");
        div.mNum1 = 10;
        div.mNum2 = 3;
        System.out.println(div.computer());
    }
}
