package com.zqp2sh.designpattern.建造者模式.version2;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月10日 14:07
 */

public class MainTest {
    public static void main(String[] args) {

        Director director = new Director();

        Builder builder1 = new ConcreteBuilder1();
        director.construct(builder1);
        Product product1 = builder1.build();
        product1.show();

        Builder builder2 = new ConcreteBuilder2();
        director.construct(builder2);
        Product product2 = builder2.build();
        product2.show();

    }
}
