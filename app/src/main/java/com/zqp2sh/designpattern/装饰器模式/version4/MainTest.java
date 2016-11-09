package com.zqp2sh.designpattern.装饰器模式.version4;

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
        finery1.decorate(person);
        finery2.decorate(finery1);
        finery3.decorate(finery2);
        finery3.show();

        System.out.println("第二种装扮: ");
        Finery finery4 = new Suit();
        Finery finery5 = new TShirts();
        Finery finery6 = new LeatherShoes();
        finery4.decorate(person);
        finery5.decorate(finery4);
        finery6.decorate(finery5);
        finery6.show();

    }
}
