package com.zqp2sh.designpattern.装饰器模式.version4;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月09日 18:49
 *
 * Decorator装饰类
 */

public class Finery extends Person {

    protected Person component;

    // 打扮
    public void decorate(Person component) {
        this.component = component;
    }

    @Override
    public void show() {
        if (component != null) {
            component.show();
        }
    }
}
