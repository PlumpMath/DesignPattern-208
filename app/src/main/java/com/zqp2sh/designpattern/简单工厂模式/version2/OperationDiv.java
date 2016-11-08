package com.zqp2sh.designpattern.简单工厂模式.version2;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月08日 21:02
 */

public class OperationDiv extends Operation {

    @Override
    double computer() {
        if (mNum2 == 0) {
            System.out.println("除数不能为0");
        }
        return mNum1 / mNum2;
    }
}
