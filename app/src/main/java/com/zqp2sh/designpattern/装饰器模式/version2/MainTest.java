package com.zqp2sh.designpattern.装饰器模式.version2;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月09日 18:36
 */

public class MainTest {
    public static void main(String[] args) {
        Person person = new Person("sh2zqp");

        System.out.println("第一种装扮: ");
        Finery finery1 = new BigTrouser();
        Finery finery2 = new Tie();
        Finery finery3 = new Sneakers();
        finery1.show();
        finery2.show();
        finery3.show();
        person.show();

        System.out.println("第二种装扮: ");
        Finery finery4 = new Suit();
        Finery finery5 = new TShirts();
        Finery finery6 = new LeatherShoes();
        finery4.show();
        finery5.show();
        finery6.show();
        person.show();

    }
}
