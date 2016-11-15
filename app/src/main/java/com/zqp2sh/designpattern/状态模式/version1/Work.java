package com.zqp2sh.designpattern.状态模式.version1;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月11日 13:59
 */

public class Work {

    private int mHour;
    private boolean isFinished;

    public int getHour() {
        return mHour;
    }

    public void setHour(int hour) {
        mHour = hour;
    }

    public boolean isFinished() {
        return isFinished;
    }

    public void setFinished(boolean finished) {
        isFinished = finished;
    }

    public void writeProgram() {
        if (mHour < 12) {
            System.out.println("当前时间:" + mHour + ", 上午工作,精神百倍");
        } else if (mHour < 13) {
            System.out.println("当前时间:" + mHour + ", 饿了午饭,犯困午休");
        } else if (mHour < 17) {
            System.out.println("当前时间:" + mHour + ", 状态不错,继续努力");
        } else {
            if (isFinished) {
                System.out.println("当前时间:" + mHour + ", 工作完成,下班回家");
            } else {
                if (mHour < 21) {
                    System.out.println("当前时间:" + mHour + ", 工作继续,加班熬夜");
                } else {
                    System.out.println("当前时间:" + mHour + ", 太晚了,睡着了");
                }
            }
        }
    }

}
