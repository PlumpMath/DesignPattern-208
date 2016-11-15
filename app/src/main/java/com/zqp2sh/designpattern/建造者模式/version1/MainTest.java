package com.zqp2sh.designpattern.建造者模式.version1;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月10日 14:07
 */

public class MainTest {
    public static void main(String[] args) {

        PersonBuilder builder1 = new PersonThinBuilder();
        PersonBuilder builder2 = new PersonFatBuilder();

        PersonDirector director1 = new PersonDirector(builder1);
        director1.createPerson();

        PersonDirector director2 = new PersonDirector(builder2);
        director2.createPerson();

    }
}
