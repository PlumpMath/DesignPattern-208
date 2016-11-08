package com.zqp2sh.designpattern.外观模式.version2;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月08日 19:14
 */

public class MainTest {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.methodA();
        facade.methodB();
    }
}
