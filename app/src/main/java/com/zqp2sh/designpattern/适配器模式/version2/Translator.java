package com.zqp2sh.designpattern.适配器模式.version2;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月13日 15:20
 *
 * 适配中介
 */

public class Translator extends Player {

    private ForeignCenter mForeignCenter;

    public Translator(String name) {
        super(name);
        mForeignCenter = new ForeignCenter(name);
    }

    @Override
    public void attack() {
        mForeignCenter.attackByZh();
    }

    @Override
    public void defense() {
        mForeignCenter.defenseByZh();
    }
}
