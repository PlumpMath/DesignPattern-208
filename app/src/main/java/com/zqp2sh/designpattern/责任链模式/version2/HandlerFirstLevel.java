package com.zqp2sh.designpattern.责任链模式.version2;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月08日 17:44
 */

public class HandlerFirstLevel extends Handler {

    @Override
    void handleRequest(int request) {
        if (request > 0 && request <= 10) {
            System.out.println("HandlerFirstLevel处理");
        } else if (successor != null) {
            successor.handleRequest(request); // 转到更高一级
        }
    }
}
