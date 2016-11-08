package com.zqp2sh.designpattern.观察者模式;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月08日 14:21
 *
 * 观察者,订阅者Subscriber
 */

abstract class Observer {

    String mName;
    Observable mObservable;

    Observer(String name, Observable observable) {
        mName = name;
        mObservable = observable;
    }

    abstract void update();
}
