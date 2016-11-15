package com.zqp2sh.designpattern.状态模式.version2;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月11日 14:38
 */

public class Context {

    private State mState; // 可读写的状态属性,用于读取当前状态和设置新状态

    public Context(State state) {
        mState = state; // 定义Context的初始状态
    }

    public State getState() {
        return mState;
    }

    public void setState(State state) {
        mState = state;
        System.out.println("当前状态: " + state.toString());
    }

    // 对请求做处理,并设置下一状态
    public void request() {
        mState.handle(this);
    }

}
