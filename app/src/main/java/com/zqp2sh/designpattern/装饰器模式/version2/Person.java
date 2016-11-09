package com.zqp2sh.designpattern.装饰器模式.version2;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月09日 18:36
 */

public class Person {

    private String mName;

    public Person(String name) {
        mName = name;
    }

    public void show() {
        System.out.println("装扮的" + mName);
    }

}
