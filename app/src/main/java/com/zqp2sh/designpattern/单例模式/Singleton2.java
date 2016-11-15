package com.zqp2sh.designpattern.单例模式;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月14日 10:32
 *
 * 懒汉式
 */

class Singleton2 {

    private static Singleton2 sSingleton = null;

    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        if (sSingleton == null) {
            sSingleton = new Singleton2();
        }
        return sSingleton;
    }
}
