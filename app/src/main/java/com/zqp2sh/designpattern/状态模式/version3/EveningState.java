package com.zqp2sh.designpattern.状态模式.version3;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月11日 16:16
 *
 * 晚间工作状态类
 */

public class EveningState extends State {
    @Override
    public void writeProgram(Work work) {
        if (work.isFinished()) {
            // 如果完成任务,则转入下班状态
            work.setCurrentState(new RestState());
            work.writeProgram();
        } else {
            if (work.getHour() < 21) {
                System.out.println("当前时间:" + work.getHour() + ", 工作继续,加班熬夜");
            } else {
                // 超过21点,则转入睡眠工作状态
                work.setCurrentState(new SleepingState());
                work.writeProgram();
            }
        }
    }
}
