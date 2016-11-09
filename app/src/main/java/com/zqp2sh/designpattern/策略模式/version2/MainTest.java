package com.zqp2sh.designpattern.策略模式.version2;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月09日 14:05
 */

public class MainTest {
    public static void main(String[] args) {

        Context context;

        // 实例化不同的具体的策略

        context = new Context(new ConcreteStrategyA());
        context.contextInterface();

        context = new Context(new ConcreteStrategyB());
        context.contextInterface();

        context = new Context(new ConcreteStrategyC());
        context.contextInterface();
    }
}
