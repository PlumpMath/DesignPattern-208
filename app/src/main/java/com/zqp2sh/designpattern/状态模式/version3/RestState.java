package com.zqp2sh.designpattern.状态模式.version3;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月11日 16:16
 *
 * 下班休息状态类
 */

public class RestState extends State {
    @Override
    public void writeProgram(Work work) {
        System.out.println("当前时间:" + work.getHour() + ", 工作完成,下班回家");
    }
}
