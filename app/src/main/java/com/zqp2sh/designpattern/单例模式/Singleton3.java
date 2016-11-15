package com.zqp2sh.designpattern.单例模式;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月14日 10:32
 *
 * 多线程加锁式
 * 每次调用getInstance()时都要进行加锁,性能会受到影响
 */

class Singleton3 {

    private static Singleton3 sSingleton = null;

    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        synchronized (Singleton3.class) {
            if (sSingleton == null) {
                sSingleton = new Singleton3();
            }
        }
        return sSingleton;
    }
}
