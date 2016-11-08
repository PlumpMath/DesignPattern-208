package com.zqp2sh.designpattern.外观模式.version1;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月08日 18:52
 */

public class Fund {

    Stock1 mStock1;
    Stock2 mStock2;
    Stock3 mStock3;
    NationDebt1 mNationDebt1;
    Realty1 mRealty1;

    public Fund() {
        mStock1 = new Stock1();
        mStock2 = new Stock2();
        mStock3 = new Stock3();
        mNationDebt1 = new NationDebt1();
        mRealty1 = new Realty1();
    }

    public void buyFund() {
        mStock1.buy();
        mStock2.buy();
        mStock3.buy();
        mNationDebt1.buy();
        mRealty1.buy();
    }

    public void sellFund() {
        mStock1.sell();
        mStock2.sell();
        mStock3.sell();
        mNationDebt1.sell();
        mRealty1.sell();
    }

}
