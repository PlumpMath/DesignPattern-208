package com.zqp2sh.designpattern.适配器模式.version2;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月13日 14:11
 */

public class MainTest {
    public static void main(String[] args) {
        Player b = new Forwords("A");
        b.attack();
        Player m = new Guards("B");
        m.attack();
        Player y = new Translator("C");
        y.attack();
        y.defense();
    }
}
