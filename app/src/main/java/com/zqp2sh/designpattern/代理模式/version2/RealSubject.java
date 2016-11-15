package com.zqp2sh.designpattern.代理模式.version2;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月10日 10:02
 *
 * 真实请求类: 定义了Proxy所代表的真实实体
 */

class RealSubject extends Subject {

    @Override
    public void request() {
        System.out.println("真实的请求");
    }
}
