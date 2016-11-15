package com.zqp2sh.designpattern.工厂方法模式.version1;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月08日 20:59
 */

abstract class Operation {

    double mNum1;
    double mNum2;

    public double getNum1() {
        return mNum1;
    }

    public void setNum1(double num1) {
        mNum1 = num1;
    }

    public double getNum2() {
        return mNum2;
    }

    public void setNum2(double num2) {
        mNum2 = num2;
    }

    abstract double computer();

}
