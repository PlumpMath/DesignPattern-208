package com.zqp2sh.designpattern.观察者模式;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月08日 14:29
 */
class ObserverStock extends Observer {


    ObserverStock(String name, Observable observable) {
        super(name, observable);
    }

    @Override
    public void update() {
        System.out.println(mName + "正在炒股票时收到了来自(" +
                mObservable.getName() + ")的消息: " + mObservable.sendMsg());
    }
}
