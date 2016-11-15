package com.zqp2sh.designpattern.状态模式.version1;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月11日 13:59
 */

public class MainTest {
    public static void main(String[] args) {
        Work work = new Work();
        work.setHour(9);
        work.writeProgram();
        work.setHour(10);
        work.writeProgram();
        work.setHour(12);
        work.writeProgram();
        work.setHour(13);
        work.writeProgram();
        work.setHour(14);
        work.writeProgram();
        work.setHour(17);
        work.writeProgram();

        work.setFinished(false);
        //work.setFinished(true);
        work.writeProgram();
        work.setHour(19);
        work.writeProgram();
        work.setHour(22);
        work.writeProgram();

    }
}
