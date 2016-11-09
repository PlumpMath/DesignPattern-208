package com.zqp2sh.designpattern.装饰器模式.version3;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月09日 19:06
 */

public class ConcreteComponent extends Component {
    @Override
    public void operation() {
        System.out.println("具体对象的操作");
    }
}
