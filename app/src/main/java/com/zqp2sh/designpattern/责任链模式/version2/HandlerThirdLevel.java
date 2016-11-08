package com.zqp2sh.designpattern.责任链模式.version2;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月08日 17:44
 */

public class HandlerThirdLevel extends Handler {

    @Override
    void handleRequest(int request) {
        if (request > 100 && request <= 1000) {
            System.out.println("HandlerThirdLevel处理");
        } else if (successor != null) {
            successor.handleRequest(request); // 转到更高一级
        } else {
            System.out.println("无法处理");
        }
    }
}
