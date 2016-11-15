package com.zqp2sh.designpattern.状态模式.version3;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月11日 16:16
 *
 * 下午工作状态类
 */

public class AfternoonState extends State {
    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 17) {
            System.out.println("当前时间:" + work.getHour() + ", 状态不错,继续努力");
        } else {
            // 超过17点,则转入晚间工作状态
            work.setCurrentState(new EveningState());
            work.writeProgram();
        }
    }
}
