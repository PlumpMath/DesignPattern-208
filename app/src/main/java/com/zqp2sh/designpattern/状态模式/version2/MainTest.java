package com.zqp2sh.designpattern.状态模式.version2;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月11日 14:37
 */

public class MainTest {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStateA());

        context.request();
        context.request();
        context.request();
        context.request();
    }
}
