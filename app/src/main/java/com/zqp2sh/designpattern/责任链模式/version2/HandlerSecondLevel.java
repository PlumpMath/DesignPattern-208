package com.zqp2sh.designpattern.责任链模式.version2;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月08日 17:44
 */

public class HandlerSecondLevel extends Handler {

    @Override
    void handleRequest(int request) {
        if (request > 10 && request <= 100) {
            System.out.println("HandlerSecondLevel处理");
        } else if (successor != null) {
            successor.handleRequest(request); // 转到更高一级
        }
    }
}
