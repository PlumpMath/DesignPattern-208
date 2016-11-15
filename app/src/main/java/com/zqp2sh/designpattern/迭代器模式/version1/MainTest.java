package com.zqp2sh.designpattern.迭代器模式.version1;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月13日 20:20
 */

public class MainTest {
    public static void main(String[] args) {

        ConcreteAggregate a = new ConcreteAggregate(); // 公交车,即聚集对象

        // 新上来的乘客,即对象数组
        a.setItem(0,"大鸟");
        a.setItem(1,"小菜");
        a.setItem(2,"行李");
        a.setItem(3,"老外");
        a.setItem(4,"小偷");
        a.setItem(5,"员工");

        //Iterator iterator = new ConcreteIterator(a); // 售票员,先看好了上车的是那些人,即声明了迭代器对象
        //Iterator iterator = a.createIterator(); // 售票员,先看好了上车的是那些人,即声明了迭代器对象
        Iterator iterator = new ConcreteIteratorDesc(a); // 售票员,先看好了上车的是那些人,即声明了迭代器对象

        Object first = iterator.first();
        System.out.println(first);

        // 从第一个乘客开始
        while (!iterator.isDone()) {
            System.out.println(iterator.currentItem() + "请买票!");
            iterator.next();
        }


    }
}
