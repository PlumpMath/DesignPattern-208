package com.zqp2sh.designpattern.策略模式.version3;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月09日 16:30
 */

public class CashContext {

    private Cash mCash;

    public CashContext(String type) {
        switch (type) {
            case "normal":
                mCash = new CashNormal();
                break;
            case "0.8":
                mCash = new CashDaZhe(0.8);
                break;
            case "+300-100":
                mCash = new CashFullReturn(300,100);
                break;
            case "0.5":
                mCash = new CashDaZhe(0.5);
                break;
        }
    }

    public double getResult(double money) {
        return mCash.chargedMoney(money);
    }
}
