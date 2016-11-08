package com.zqp2sh.designpattern.观察者模式;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月0日 14:19
 *
 * 可观察的对象,被观察者,Subject,通知者
 */

abstract class Observable {
    // 观察者列表
    private List<Observer> mObservers = new ArrayList<>();
    private String mName;

    Observable(String name) {
        mName = name;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    abstract String sendMsg();

    // 增加观察者
    void addObserver(Observer observer) {
        if (observer == null) {
            throw new NullPointerException("observer == null");
        }
        // 加入同步代码块
        synchronized (this) {
            if (!mObservers.contains(observer)) {
                mObservers.add(observer);
            }
        }
    }

    // 删除观察者
    void removeObserver(Observer observer) {
        if (mObservers.contains(observer)) {
            mObservers.remove(observer);
        }
    }

    // 清空观察者
    void clearObservers() {
        mObservers.clear();
    }

    // 发出通知
    void notifyObservers() {
        for (Observer o :
                mObservers) {
            o.update();
        }
    }

}
