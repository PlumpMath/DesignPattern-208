package com.zqp2sh.designpattern.建造者模式.version2;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月10日 14:57
 *
 * 用来指挥建造的过程
 */

class Director {

    void construct(Builder builder) {
        builder.buildPartA();
        builder.buildPartB();
    }

}
