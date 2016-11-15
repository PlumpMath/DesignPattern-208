package com.zqp2sh.designpattern.代理模式.version1;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月09日 19:56
 *
 * 追求者
 */

class Pursuit implements IGiveGift {

    private SchoolGirl mm;

    Pursuit(SchoolGirl mm) {
        this.mm = mm;
    }

    @Override
    public void giveDolls() {
        System.out.println(mm.getName() + ", 送你的洋娃娃");
    }

    @Override
    public void giveFlowers() {
        System.out.println(mm.getName() + ", 送你的鲜花");
    }

    @Override
    public void giveChocolate() {
        System.out.println(mm.getName() + ", 送你的巧克力");
    }

}
