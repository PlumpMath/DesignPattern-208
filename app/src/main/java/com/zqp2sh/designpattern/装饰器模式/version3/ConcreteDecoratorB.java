package com.zqp2sh.designpattern.装饰器模式.version3;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月09日 19:09
 */

public class ConcreteDecoratorB extends Decorator {

    @Override
    public void operation() {
        super.operation();
        addBehavior();
        System.out.println("具体装饰类对象B的操作");
    }

    private void addBehavior() {

    }
}
