package com.zqp2sh.designpattern.责任链模式.version3;

/**
 * 作者 @sh2zqp
 * 时间 @206年11月08日 18:07
 */

public class Zongjian extends Manager {

    public Zongjian(String name) {
        super(name);
    }

    @Override
    public void handleRequest(Request request) {
        if (request.getRequestType().equals("请假") && request.getNumber() <= 5) {
            System.out.println(request.getNumber() + "天假期被"+ mName +"批准");
        } else {
            if (superior != null)
                superior.handleRequest(request);
        }
    }
}
