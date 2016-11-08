package com.zqp2sh.designpattern.外观模式.version1;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月08日 18:48
 */

public class MainTest {
    public static void main(String[] args) {

//        // 股民自己炒股
//        Stock1 stock1 = new Stock1();
//        Stock2 stock2 = new Stock2();
//        Stock3 stock3 = new Stock3();
//        NationDebt1 nationDebt1 = new NationDebt1();
//        Realty1 realty1 = new Realty1();
//
//        stock1.buy();
//        stock2.buy();
//        stock3.buy();
//        nationDebt1.buy();
//        realty1.buy();
//
//        stock1.sell();
//        stock2.sell();
//        stock3.sell();
//        nationDebt1.sell();
//        realty1.sell();

        // 投资基金
        Fund fund = new Fund();
        fund.buyFund(); // 基金买进
        fund.sellFund();// 基金卖出

    }
}
