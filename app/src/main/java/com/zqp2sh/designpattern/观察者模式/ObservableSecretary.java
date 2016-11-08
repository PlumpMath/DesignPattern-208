package com.zqp2sh.designpattern.观察者模式;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月08日 14:28
 */
class ObservableSecretary extends Observable {

    ObservableSecretary(String name) {
        super(name);
    }

    @Override
    public String sendMsg() {
        return "老板来了, 请认真工作!";
    }

}
