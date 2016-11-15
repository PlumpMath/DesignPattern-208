package com.zqp2sh.designpattern.原型模式.version1;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月10日 12:34
 */

public class ConcretePrototype1 extends Prototype {
    public ConcretePrototype1(String id) {
        super(id);
    }

    @Override
    public Prototype clone() {
        return this;
    }
}
