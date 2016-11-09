package com.zqp2sh.designpattern.装饰器模式.version3;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月09日 19:09
 */

public class ConcreteDecoratorA extends Decorator {

    private String mAddState;

    @Override
    public void operation() {
        super.operation();
        mAddState = "new state";
        System.out.println("具体装饰类对象A的操作");
    }
}
