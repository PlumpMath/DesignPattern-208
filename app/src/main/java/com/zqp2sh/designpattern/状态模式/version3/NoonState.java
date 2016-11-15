package com.zqp2sh.designpattern.状态模式.version3;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月11日 16:16
 *
 * 中午工作状态类
 */

public class NoonState extends State {
    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 13) {
            System.out.println("当前时间:" + work.getHour() + ", 饿了午饭,犯困午休");
        } else {
            // 超过13点,则转入下午工作状态
            work.setCurrentState(new AfternoonState());
            work.writeProgram();
        }
    }
}
