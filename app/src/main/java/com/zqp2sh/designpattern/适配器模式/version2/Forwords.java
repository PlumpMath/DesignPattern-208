package com.zqp2sh.designpattern.适配器模式.version2;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月13日 15:12
 *
 * 前锋球员
 */

public class Forwords extends Player {

    public Forwords(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(mName + ": 前锋球员进攻");
    }

    @Override
    public void defense() {
        System.out.println(mName + ": 前锋球员防守");
    }
}
