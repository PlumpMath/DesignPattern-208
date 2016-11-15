package com.zqp2sh.designpattern.状态模式.version3;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月11日 16:16
 *
 * 上午工作状态类
 */

public class ForenoonState extends State {
    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 12) {
            System.out.println("当前时间:" + work.getHour() + ", 上午工作,精神百倍");
        } else {
            // 超过12点,则转入中午工作状态
            work.setCurrentState(new NoonState());
            work.writeProgram();
        }
    }
}
