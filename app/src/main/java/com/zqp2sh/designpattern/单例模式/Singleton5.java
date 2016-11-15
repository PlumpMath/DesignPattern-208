package com.zqp2sh.designpattern.单例模式;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月14日 10:32
 *
 * 静态类方式
 */

class Singleton5 {

    private static Singleton5 sSingleton = new Singleton5();

    private Singleton5() {
    }

    public static Singleton5 getInstance() {
        return sSingleton;
    }
}
