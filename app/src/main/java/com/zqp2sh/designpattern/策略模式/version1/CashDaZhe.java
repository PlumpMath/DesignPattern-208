package com.zqp2sh.designpattern.策略模式.version1;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月09日 13:28
 */

public class CashDaZhe extends Cash {

    private double mDaZheRate;

    public CashDaZhe(double daZheRate) {
        mDaZheRate = daZheRate;
    }

    @Override
    double chargedMoney(double money) {
        return money * mDaZheRate;
    }
}
