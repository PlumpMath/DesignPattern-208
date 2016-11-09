package com.zqp2sh.designpattern.策略模式.version3;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月09日 13:19
 */

public class MainTest {
    public static void main(String[] args) {

        CashContext context = new CashContext("normal");
        double money = 600.7;
        System.out.println(context.getResult(money));

    }
}
