package com.zqp2sh.designpattern.责任链模式.version2;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月08日 17:39
 */

abstract class Handler {

    protected Handler successor;

    void setSuccessor(Handler successor) {
        this.successor = successor; // 设置继任者
    }

    abstract void handleRequest(int request);
}
