package com.zqp2sh.designpattern.装饰器模式.version1;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月09日 18:36
 */

public class Person {

    private String mName;

    public Person(String name) {
        mName = name;
    }

    public void wearTShirt() {
        System.out.println("大T恤");
    }

    public void wearBigTrouser() {
        System.out.println("垮裤");
    }

    public void wearSneakers() {
        System.out.println("破球鞋");
    }

    public void wearSuit() {
        System.out.println("西装");
    }

    public void wearTie() {
        System.out.println("领带");
    }

    public void wearLeatherShoes() {
        System.out.println("皮鞋");
    }

}
