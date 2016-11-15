package com.zqp2sh.designpattern.单例模式;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月14日 10:32
 *
 * 饿汉式
 */

class Singleton1 {

    private static Singleton1 sSingleton = new Singleton1();

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        return sSingleton;
    }
}
