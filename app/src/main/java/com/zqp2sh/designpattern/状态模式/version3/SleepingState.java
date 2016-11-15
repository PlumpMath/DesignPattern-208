package com.zqp2sh.designpattern.状态模式.version3;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月11日 16:16
 *
 * 睡眠状态类
 */

public class SleepingState extends State {
    @Override
    public void writeProgram(Work work) {
        System.out.println("当前时间:" + work.getHour() + ", 太晚了,睡着了");
    }
}
