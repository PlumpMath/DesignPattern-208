package com.zqp2sh.designpattern.外观模式.version2;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月08日 19:01
 *
 * 外观类,知道哪些子系统类负责处理请求,将客户的请求代理给适当的子系统对象
 * 它需要了解所有的子系统的方法和属性,进行适当的组合,以备外界调用
 */

public class Facade {

    private SubSystemOne one;
    private SubSystemTwo two;
    private SubSystemThree three;
    private SubSystemFour four;

    public Facade() {
        one = new SubSystemOne();
        two = new SubSystemTwo();
        three = new SubSystemThree();
        four = new SubSystemFour();
    }

    public void methodA() {
        System.out.println("外观类MethodA()");
        one.method1();
        two.method2();
        four.method4();
    }

    public void methodB() {
        System.out.println("外观类MethodB()");
        two.method2();
        three.method3();
        four.method4();
    }

}
