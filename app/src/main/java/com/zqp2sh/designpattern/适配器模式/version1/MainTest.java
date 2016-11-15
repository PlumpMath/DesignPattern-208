package com.zqp2sh.designpattern.适配器模式.version1;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月13日 14:11
 */

public class MainTest {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();
    }
}
