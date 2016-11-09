package com.zqp2sh.designpattern.策略模式.version3;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月09日 13:28
 */

public class CashNormal extends Cash {
    @Override
    double chargedMoney(double money) {
        return money;
    }
}
