package com.zqp2sh.designpattern.简单工厂模式.version2;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月08日 21:02
 */

public class OperationAdd extends Operation {

    @Override
    double computer() {
        return mNum1 + mNum2;
    }
}
