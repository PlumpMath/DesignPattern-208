package com.zqp2sh.designpattern.责任链模式.version3;

/**
 * 作者 @sh2zqp
 * 时间 @206年11月08日 18:07
 */

public class ZongJingLi extends Manager {

    public ZongJingLi(String name) {
        super(name);
    }

    @Override
    public void handleRequest(Request request) {
        if (request.getRequestType().equals("请假")) {
            System.out.println(request.getNumber() + "天假期被"+ mName +"批准");
        } else if (request.getRequestType().equals("加薪") && request.getNumber() <= 500) {
            System.out.println(request.getNumber() + "元加薪被" + mName + "批准");
        } else if (request.getRequestType().equals("加薪") && request.getNumber() > 500) {
            System.out.println(request.getNumber() + "元加薪需要再考虑");
        }
    }
}
