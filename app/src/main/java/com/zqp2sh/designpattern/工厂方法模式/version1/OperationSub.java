package com.zqp2sh.designpattern.工厂方法模式.version1;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月08日 21:02
 */

class OperationSub extends Operation {

    @Override
    double computer() {
        return mNum1 - mNum2;
    }
}
