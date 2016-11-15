package com.zqp2sh.designpattern.备忘录模式.version2;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月13日 16:01
 *
 * 管理者类: 得到或设置备忘录
 */

public class Caretaker {

    private Memento mMemento;

    public Memento getMemento() {
        return mMemento;
    }

    public void setMemento(Memento memento) {
        mMemento = memento;
    }
}
