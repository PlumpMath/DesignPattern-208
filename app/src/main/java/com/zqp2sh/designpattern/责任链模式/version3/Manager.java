package com.zqp2sh.designpattern.责任链模式.version3;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月08日 17:39
 */

// 管理者
abstract class Manager {
    protected String mName;
    protected Manager superior; // 管理者的上级

    public Manager(String name) {
        mName = name;
    }

    // 设置管理者的上级
    void setSuccessor(Manager superior) {
        this.superior = superior;
    }

    // 申请请求
    abstract public void handleRequest(Request request);
}
