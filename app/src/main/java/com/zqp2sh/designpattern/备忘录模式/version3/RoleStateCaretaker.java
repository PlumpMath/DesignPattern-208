package com.zqp2sh.designpattern.备忘录模式.version3;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月13日 16:29
 */

public class RoleStateCaretaker {

    private RoleStateMemento mRoleStateMemento;

    public RoleStateMemento getRoleStateMemento() {
        return mRoleStateMemento;
    }

    public void setRoleStateMemento(RoleStateMemento roleStateMemento) {
        mRoleStateMemento = roleStateMemento;
    }
}
