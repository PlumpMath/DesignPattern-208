package com.zqp2sh.designpattern.原型模式.version1;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月10日 12:32
 *
 * 原型类
 */

abstract class Prototype {
    private String id;

    public Prototype(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public abstract Prototype clone();
}
