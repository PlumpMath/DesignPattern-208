package com.zqp2sh.designpattern.代理模式.version1;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月09日 20:02
 *
 * 代理追求者
 */

class Proxy implements IGiveGift {

    private Pursuit mPursuit;
    Proxy(SchoolGirl mm) {
        mPursuit = new Pursuit(mm);
    }

    @Override
    public void giveDolls() {
        mPursuit.giveFlowers();
    }

    @Override
    public void giveFlowers() {
        mPursuit.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        mPursuit.giveChocolate();
    }
}
