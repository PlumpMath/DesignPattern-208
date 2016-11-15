package com.zqp2sh.designpattern.建造者模式.version1;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月10日 14:25
 *
 * 不同类型的具体建造实现过程
 */

class PersonFatBuilder extends PersonBuilder {

    @Override
    void buildHead() {
        System.out.println("Fat" + ": 画头");
    }

    @Override
    void buildBody() {
        System.out.println("Fat" + ": 画身体");
    }

    @Override
    void buildArmLeft() {
        System.out.println("Fat" + ": 画左手");
    }

    @Override
    void buildArmRight() {
        System.out.println("Fat" + ": 画右手");
    }

    @Override
    void buildLegLeft() {
        System.out.println("Fat" + ": 画左腿");
    }

    @Override
    void buildLegRight() {
        System.out.println("Fat" + ": 画右腿");
    }
}
