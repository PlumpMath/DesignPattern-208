package com.zqp2sh.designpattern.责任链模式.version1;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月08日 17:15
 */

public class Manager {
    private String mName;

    public Manager(String name) {
        mName = name;
    }

    // 得到申请结果
    public void getRequestResult(String managerLevel, Request request) {
        if (managerLevel.equals("经理")) {
            if (request.getRequestType().equals("请假") && request.getNumber() <= 2) {
                System.out.println(request.getNumber() + "假期被批准");
            } else {
                System.out.println("经理无权处理");
            }
        } else if (managerLevel.equals("总监")) {
            if (request.getRequestType().equals("请假") && request.getNumber() <= 5) {
                System.out.println(request.getNumber() + "假期被批准");
            } else {
                System.out.println("总监无权处理");
            }
        } else if (managerLevel.equals("总经理")) {
            if (request.getRequestType().equals("请假")) {
                System.out.println(request.getNumber() + "假期被批准");
            } else if (request.getRequestType().equals("加薪") && request.getNumber() <= 500) {
                System.out.println(request.getNumber() + "加薪被批准");
            } else if (request.getRequestType().equals("加薪") && request.getNumber() > 500) {
                System.out.println(request.getNumber() + "加薪需要再考虑");
            }
        }
    }

}
