package com.zqp2sh.designpattern.代理模式.version2;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月10日 10:04
 *
 * 代理类: 保存一个引用使得代理可以访问实体,并提供一个与Subject的接口相同的接口,
 * 这样代理就可以用来代替实体
 */

class Proxy extends Subject {

    private RealSubject mRealSubject;

    Proxy() {
        mRealSubject = new RealSubject();
    }

    @Override
  public void request() {
        if (mRealSubject == null) {
            mRealSubject = new RealSubject();
        }
        System.out.println("由Proxy进行: ");
        mRealSubject.request();
    }
}
