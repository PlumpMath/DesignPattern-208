package com.zqp2sh.designpattern.责任链模式.version2;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月08日 17:50
 */

public class MainTest {
    public static void main(String[] args) {

        Handler handler1 = new HandlerFirstLevel();
        Handler handler2 = new HandlerSecondLevel();
        Handler handler3 = new HandlerThirdLevel();

        handler1.setSuccessor(handler2);
        handler2.setSuccessor(handler3);
        handler3.setSuccessor(null);

        int[] requests = {2,23,11,5,200,10000};
        for (int request :
                requests) {
            handler1.handleRequest(request);
        }

    }
}
