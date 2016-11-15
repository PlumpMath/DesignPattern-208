package com.zqp2sh.designpattern.备忘录模式.version2;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月13日 15:59
 */

public class MainTest {
    public static void main(String[] args) {

        // Originator初始状态,状态属性为"On"
        Originator o = new Originator();
        o.setState("On");
        o.show();

        Caretaker c = new Caretaker();
        c.setMemento(o.createMemento()); // 保存状态时,由于有了很好的封装,可以隐藏Originator的实现细节

        o.setState("Off"); // 操作变更状态
        o.show();

        o.setMemento(c.getMemento());  // 通过备忘录恢复初始的状态
        o.show();
    }
}
