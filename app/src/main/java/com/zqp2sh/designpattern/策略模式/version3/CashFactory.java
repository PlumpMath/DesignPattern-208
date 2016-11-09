package com.zqp2sh.designpattern.策略模式.version3;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月09日 13:34
 */

public class CashFactory {

    public static Cash createCashWay(String type) {
        Cash cash = null;
        switch (type) {
            case "normal":
                cash = new CashNormal();
                break;
            case "0.8":
                cash = new CashDaZhe(0.8);
                break;
            case "+300-100":
                cash = new CashFullReturn(300,100);
                break;
            case "0.5":
                cash = new CashDaZhe(0.5);
                break;
        }
        return cash;
    }
}
