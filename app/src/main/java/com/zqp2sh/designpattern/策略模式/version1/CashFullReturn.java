package com.zqp2sh.designpattern.策略模式.version1;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月09日 13:28
 */

public class CashFullReturn extends Cash {

    private double mFullNum;
    private double mReturnNum;

    public CashFullReturn(double fullNum, double returnNum) {
        mFullNum = fullNum;
        mReturnNum = returnNum;
    }

    @Override
    double chargedMoney(double money) {
        if (money >= mFullNum) {
            return money - mReturnNum * ((int)money / (int)mFullNum);
        } else {
            return money;
        }
    }
}
