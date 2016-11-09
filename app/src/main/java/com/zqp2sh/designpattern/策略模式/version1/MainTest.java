package com.zqp2sh.designpattern.策略模式.version1;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月09日 13:19
 */

public class MainTest {
    public static void main(String[] args) {

        double money = 600.7;

        Cash normal = CashFactory.createCashWay("normal");
        Cash bazhe = CashFactory.createCashWay("0.8");
        Cash wuzhe = CashFactory.createCashWay("0.5");
        Cash manfan = CashFactory.createCashWay("+300-100");

        System.out.println(normal.chargedMoney(money));
        System.out.println(bazhe.chargedMoney(money));
        System.out.println(wuzhe.chargedMoney(money));
        System.out.println(manfan.chargedMoney(money));

    }
}
