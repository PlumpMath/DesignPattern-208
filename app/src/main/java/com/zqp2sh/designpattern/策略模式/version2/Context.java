package com.zqp2sh.designpattern.策略模式.version2;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月09日 14:22
 *
 * 用一个Concrete来配置,维护一个对Strategy对象的引用
 */

// 上下文
public class Context {
    Strategy mStrategy;

    // 初始化时,传入具体的策略对象
    public Context(Strategy strategy) {
        mStrategy = strategy;
    }

    // 上下文接口,根据具体的策略对象,调用其算法的方法
    public void contextInterface() {
        mStrategy.algorithmInterface();
    }
}
