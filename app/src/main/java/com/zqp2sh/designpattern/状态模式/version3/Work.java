package com.zqp2sh.designpattern.状态模式.version3;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月11日 16:14
 */

public class Work {

    private State current;
    private double mHour;
    private boolean isFinished;

    public Work() {
        current = new ForenoonState();
    }

    public double getHour() {
        return mHour;
    }

    public void setHour(double hour) {
        mHour = hour;
    }

    public boolean isFinished() {
        return isFinished;
    }

    public void setFinished(boolean finished) {
        isFinished = finished;
    }

    public void setCurrentState(State current) {
        this.current = current;
    }

    public void writeProgram() {
        current.writeProgram(this);
    }

}
