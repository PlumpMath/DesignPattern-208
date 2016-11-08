package com.zqp2sh.designpattern.责任链模式.version1;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月08日 17:12
 */

public class MainTest {
    public static void main(String[] args) {

        Manager manager1 = new Manager("A");
        Manager manager2 = new Manager("B");
        Manager manager3 = new Manager("C");

        Request request1 = new Request();
        request1.setRequestType("加薪");
        request1.setRequestContent("sh2zqp请求加薪");
        request1.setNumber(500);
        manager1.getRequestResult("经理",request1);
        manager2.getRequestResult("总监",request1);
        manager3.getRequestResult("总经理",request1);

        Request request2 = new Request();
        request2.setRequestType("请假");
        request2.setRequestContent("sh2zqp请假");
        request2.setNumber(3);
        manager1.getRequestResult("经理",request2);
        manager2.getRequestResult("总监",request2);
        manager3.getRequestResult("总经理",request2);

    }
}
