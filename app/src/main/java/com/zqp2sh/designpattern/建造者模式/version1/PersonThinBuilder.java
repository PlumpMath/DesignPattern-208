package com.zqp2sh.designpattern.建造者模式.version1;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月10日 14:25
 *
 * 不同类型的具体建造实现过程
 */

class PersonThinBuilder extends PersonBuilder {

    @Override
    void buildHead() {
        System.out.println("Thin" + ": 画头");
    }

    @Override
    void buildBody() {
        System.out.println("Thin" + ": 画身体");
    }

    @Override
    void buildArmLeft() {
        System.out.println("Thin" + ": 画左手");
    }

    @Override
    void buildArmRight() {
        System.out.println("Thin" + ": 画右手");
    }

    @Override
    void buildLegLeft() {
        System.out.println("Thin" + ": 画左腿");
    }

    @Override
    void buildLegRight() {
        System.out.println("Thin" + ": 画右腿");
    }
}
