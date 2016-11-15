package com.zqp2sh.designpattern.工厂方法模式.version1;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月10日 11:12
 */

public class MainTest {
    public static void main(String[] args) {
        IFactory addFactory = new FactoryAdd();
        Operation add = addFactory.createOperation();
        add.mNum1 = 10;
        add.mNum2 = 20;
        System.out.println(add.computer());
    }
}
