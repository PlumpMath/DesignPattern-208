package com.zqp2sh.designpattern.迭代器模式.version1;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月13日 20:33
 *
 * 迭代器抽象类: 统一接口
 */

public abstract class Iterator {

    public abstract Object first();
    public abstract Object next();
    public abstract boolean isDone();
    public abstract Object currentItem();

}
