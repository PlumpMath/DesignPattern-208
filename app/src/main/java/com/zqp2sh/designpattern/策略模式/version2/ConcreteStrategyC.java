package com.zqp2sh.designpattern.策略模式.version2;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月09日 14:17
 * 
 * 封装了具体的算法或行为,继承于Strategy
 */

// 具体算法C
class ConcreteStrategyC extends Strategy {
    // 算法C的实现方法
    @Override
    public void algorithmInterface() {
        System.out.println("算法C实现");
    }
}
