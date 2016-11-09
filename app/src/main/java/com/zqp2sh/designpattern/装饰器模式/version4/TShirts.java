package com.zqp2sh.designpattern.装饰器模式.version4;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月09日 18:49
 *
 * 具体装饰类
 */

public class TShirts extends Finery {
    @Override
    public void show() {
        System.out.println("大T恤");
        super.show();
    }
}
