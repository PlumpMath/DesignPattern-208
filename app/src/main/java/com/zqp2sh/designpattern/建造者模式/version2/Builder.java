package com.zqp2sh.designpattern.建造者模式.version2;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月10日 14:51
 *
 * Builder类: 抽象建造者类,确定产品由两个部件PartA和PartB组成
 * 并声明一个得到产品建造后结果的方法 build()
 */

abstract class Builder {

    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract Product build();

}
