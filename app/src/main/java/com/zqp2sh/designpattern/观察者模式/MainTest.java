package com.zqp2sh.designpattern.观察者模式;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月08日 14:22
 */

public class MainTest {
    public static void main(String[] args) {

        Observable observable1 = new ObservableSecretary("秘书");
        Observable observable2 = new ObservableBoss("老板");

        Observer observer1 = new ObserverStock("A",observable1);
        Observer observer2 = new ObserverStock("B",observable1);
        Observer observer3 = new ObserverStock("C",observable1);
        Observer observer4 = new ObserverMovie("D",observable2);
        Observer observer5 = new ObserverMovie("E",observable2);
        Observer observer6 = new ObserverMovie("F",observable2);

        observable1.addObserver(observer1);
        observable1.addObserver(observer2);
        observable1.addObserver(observer3);
        observable2.addObserver(observer4);
        observable2.addObserver(observer5);
        observable2.addObserver(observer6);

        observable1.removeObserver(observer2);

        observable1.notifyObservers();
        observable2.notifyObservers();

    }
}
