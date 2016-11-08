package com.zqp2sh.designpattern.简单工厂模式.version1;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月08日 20:20
 */

public class MainTest {
    public static void main(String[] args) {
        try {
            System.out.println(Operation.computer(1, 2, "+"));
            System.out.println(Operation.computer(1, 2, "-"));
            System.out.println(Operation.computer(1, 2, "*"));
            System.out.println(Operation.computer(1, 2, "/"));
            System.out.println(Operation.computer(1, 0, "/"));
            System.out.println(Operation.computer(1, 0, "@"));
        } catch (Exception e) {
            System.out.println("被除数不能为0");
            System.out.println(e.getMessage());

        }
    }
}
