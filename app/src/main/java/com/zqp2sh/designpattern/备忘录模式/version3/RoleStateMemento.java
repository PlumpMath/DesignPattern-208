package com.zqp2sh.designpattern.备忘录模式.version3;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月13日 16:27
 */

public class RoleStateMemento {

    private int vit;
    private int atk;
    private int def;

    public RoleStateMemento(int vit, int atk, int def) {
        this.vit = vit;
        this.atk = atk;
        this.def = def;
    }

    public int getVit() {
        return vit;
    }

    public int getAtk() {
        return atk;
    }

    public int getDef() {
        return def;
    }
}
