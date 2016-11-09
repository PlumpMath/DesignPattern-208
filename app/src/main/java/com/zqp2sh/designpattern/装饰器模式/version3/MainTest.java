package com.zqp2sh.designpattern.装饰器模式.version3;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月09日 19:12
 */

public class MainTest {
    public static void main(String[] args) {
        ConcreteComponent concreteComponent = new ConcreteComponent();
        ConcreteDecoratorA decoratorA = new ConcreteDecoratorA();
        ConcreteDecoratorB decoratorB = new ConcreteDecoratorB();

        decoratorA.setComponent(concreteComponent);
        decoratorB.setComponent(decoratorA);
        decoratorB.operation();
    }
}
