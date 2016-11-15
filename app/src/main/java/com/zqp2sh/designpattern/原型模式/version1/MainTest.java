package com.zqp2sh.designpattern.原型模式.version1;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月10日 12:07
 */

public class MainTest {
    public static void main(String[] args) {
        ConcretePrototype1 p1 = new ConcretePrototype1("I");
        ConcretePrototype1 c1 = (ConcretePrototype1) p1.clone();

        System.out.println(p1.getId());
        System.out.println(c1.getId());
    }
}
