package com.zqp2sh.designpattern.外观模式.version2;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月08日 19:02
 *
 * 子系统类集合(SubSystemOne,SubSystemTwo,SubSystemThree,SubSystemFour)
 * 实现子系统的相关功能,处理由Facade对象指派的任务,
 * 注意子类中并没有Facade的任何信息,即没有对Facade对象的引用
 */

public class SubSystemOne {
    public void method1() {
        System.out.println("子系统方法1");
    }
}
