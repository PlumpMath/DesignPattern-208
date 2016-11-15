package com.zqp2sh.designpattern.适配器模式.version1;

/**
 * 作者 sh2zqp
 * 时间 @2016年11月13日 14:28
 */

public class Adapter extends Target {

    private Adaptee mAdaptee;

    public Adapter() {
        mAdaptee = new Adaptee();
    }

    @Override
    public void request() {
        mAdaptee.specificRequest();
    }
}
