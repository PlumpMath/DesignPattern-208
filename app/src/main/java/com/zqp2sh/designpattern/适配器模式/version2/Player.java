package com.zqp2sh.designpattern.适配器模式.version2;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月13日 15:11
 *
 * 球员抽象类
 */

public abstract class Player {

    protected String mName;

    public Player(String name) {
        mName = name;
    }

    public abstract void attack();

    public abstract void defense();
}
