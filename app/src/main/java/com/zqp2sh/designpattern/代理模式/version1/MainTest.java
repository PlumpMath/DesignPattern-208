package com.zqp2sh.designpattern.代理模式.version1;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月09日 19:55
 */

public class MainTest {
    public static void main(String[] args) {
        SchoolGirl mm = new SchoolGirl();
        mm.setName("cjn");

        Proxy proxy = new Proxy(mm);
        proxy.giveChocolate();
        proxy.giveDolls();
        proxy.giveFlowers();
    }
}
