package com.zqp2sh.designpattern.代理模式.version2;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月10日 09:59
 *
 * 定义了RealSubject和Proxy的共用接口,这样就在任何使用RealSubject的地方都可以使用Proxy
 */

abstract class Subject {
    public abstract void request();
}
