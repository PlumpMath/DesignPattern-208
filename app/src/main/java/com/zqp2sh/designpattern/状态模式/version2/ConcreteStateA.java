package com.zqp2sh.designpattern.状态模式.version2;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月11日 14:38
 *
 * 具体状态,每一个子类实现一个与Context的一个状态相关的行为
 */

public class ConcreteStateA extends State {
    @Override
    public void handle(Context context) {
        context.setState(new ConcreteStateB()); // 设置ConcreteStateA的下一状态是ConcreteStateB
    }
}
