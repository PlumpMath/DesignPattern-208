package com.zqp2sh.designpattern.单例模式;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月14日 10:32
 *
 * 双重判空加锁式
 *
 * 双重判空的必要性
 * 对于sSingleton不为null的情况,我们可以直接返回实例即可。
 * 对于sSingleton为null同时有2个线程同时调用了getInstance()方法时,它们都可以
 * 通过第一重的判空,然后由加锁的原因,这2个线程只有一个可以进入,另外一个在排队等候
 * 必须要等待前一个出来后,其才可以进去,而此时进行的第二重的判空,就会阻止其进行第二
 * 次的实例化,因为前一个线程已经进行了实例化
 */

class Singleton4 {

    private static Singleton4 sSingleton = null;

    private Singleton4() {
    }

    public static Singleton4 getInstance() {
        // 先判断实例是否存在,不存在在加锁处理,可以提升性能
        if (sSingleton == null) {
            synchronized (Singleton4.class) {
                if (sSingleton == null) {
                    sSingleton = new Singleton4();
                }
            }
        }
        return sSingleton;
    }
}
