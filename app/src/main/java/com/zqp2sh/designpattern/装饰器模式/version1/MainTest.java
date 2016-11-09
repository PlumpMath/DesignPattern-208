package com.zqp2sh.designpattern.装饰器模式.version1;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月09日 18:36
 */

public class MainTest {
    public static void main(String[] args) {
        Person person = new Person("sh2zqp");

        System.out.println("第一种装扮: ");
        person.wearBigTrouser();
        person.wearLeatherShoes();
        person.wearSuit();
        person.show();

        System.out.println("第二种装扮: ");
        person.wearBigTrouser();
        person.wearTie();
        person.wearSuit();
        person.show();

    }
}
