package com.zqp2sh.designpattern.组合模式.version1;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月13日 18:26
 *
 * 组合中对象声明接口
 * 在适当的情况下,实现所有类共有接口的默认行为。声明一个接口用于
 * 访问和管理Component的子部件
 */

public abstract class Component {

    protected String mName;

    public Component(String name) {
        mName = name;
    }

    public abstract void add(Component component);
    public abstract void remove(Component component);
    public abstract void display(int depth);
}
