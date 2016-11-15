package com.zqp2sh.designpattern.状态模式.version2;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月11日 14:38
 */

public class ConcreteStateB extends State {
    @Override
    public void handle(Context context) {
        context.setState(new ConcreteStateA()); // 设置ConcreteStateB的下一状态是ConcreteStateA
    }
}
