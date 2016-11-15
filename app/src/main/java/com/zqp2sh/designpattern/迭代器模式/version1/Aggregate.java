package com.zqp2sh.designpattern.迭代器模式.version1;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月13日 20:36
 *
 * 聚集抽象类
 */

abstract class Aggregate {
    public abstract Iterator createIterator(); // 创建迭代器
}
