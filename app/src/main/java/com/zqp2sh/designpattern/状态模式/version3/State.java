package com.zqp2sh.designpattern.状态模式.version3;


/**
 * 作者 @sh2zqp
 * 时间 @2016年11月11日 16:10
 *
 * 抽象状态类,定义一个抽象方法"写程序"
 */

// 抽象状态
public abstract class State {
    public abstract void writeProgram(Work work);
}
