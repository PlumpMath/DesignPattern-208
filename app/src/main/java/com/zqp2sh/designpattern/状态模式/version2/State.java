package com.zqp2sh.designpattern.状态模式.version2;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月11日 14:37
 *
 * 抽象状态类, 定义一个接口以封装与Context的一个特定状态的相关的行为
 */

public abstract class State {
    public abstract void handle(Context context);
}
