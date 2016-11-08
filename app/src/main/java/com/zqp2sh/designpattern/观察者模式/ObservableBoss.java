package com.zqp2sh.designpattern.观察者模式;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月08日 14:58
 */

class ObservableBoss extends Observable {

    ObservableBoss(String name) {
        super(name);
    }

    @Override
    public String sendMsg() {
        return "老板偷偷地来了...";
    }
}
