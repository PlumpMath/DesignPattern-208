package com.zqp2sh.designpattern.工厂方法模式.version1;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月10日 11:09
 */

public class FactoryMul implements IFactory {
    @Override
    public Operation createOperation() {
        return new OperationMul();
    }
}
