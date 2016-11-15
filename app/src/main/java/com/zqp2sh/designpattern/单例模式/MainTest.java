package com.zqp2sh.designpattern.单例模式;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月14日 10:34
 */

public class MainTest {
    public static void main(String[] args) {

        Singleton1 singleton1 = Singleton1.getInstance();
        Singleton1 singleton2 = Singleton1.getInstance();
        Singleton1 singleton3 = Singleton1.getInstance();

        System.out.println(singleton1 == singleton2);
        System.out.println(singleton2 == singleton3);
        System.out.println(singleton3 == singleton1);

        System.out.println(singleton1);
        System.out.println(singleton2);
        System.out.println(singleton3);
    }
}
