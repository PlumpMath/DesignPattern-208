package com.zqp2sh.designpattern.建造者模式.version1;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月10日 14:22
 *
 * 抽象的建造过程
 */

abstract class PersonBuilder {

    abstract void buildHead();
    abstract void buildBody();
    abstract void buildArmLeft();
    abstract void buildArmRight();
    abstract void buildLegLeft();
    abstract void buildLegRight();
}
