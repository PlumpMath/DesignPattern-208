package com.zqp2sh.designpattern.责任链模式.version3;

/**
 * 作者 @sh2zqp
 * 时间 @2016年1108日 18:11
 */

public class MainTest {
    public static void main(String[] args) {

        Manager jingli = new JingLi("经理");
        Manager zongjian = new Zongjian("总监");
        Manager zongjingli = new ZongJingLi("总经理");

        jingli.setSuccessor(zongjian);
        zongjian.setSuccessor(zongjingli);

        Request mRequest1 = new Request();
        mRequest1.setRequestType("加薪");
        mRequest1.setRequestContent("sh2zqp请求加薪");
        mRequest1.setNumber(500);
        jingli.handleRequest(mRequest1);

        Request mRequest2 = new Request();
        mRequest2.setRequestType("加薪");
        mRequest2.setRequestContent("sh2zqp请求加薪");
        mRequest2.setNumber(1000);
        jingli.handleRequest(mRequest2);

        Request mRequest3 = new Request();
        mRequest3.setRequestType("请假");
        mRequest3.setRequestContent("sh2zqp请假");
        mRequest3.setNumber(2);
        jingli.handleRequest(mRequest3);

        Request mRequest4 = new Request();
        mRequest4.setRequestType("请假");
        mRequest4.setRequestContent("sh2zqp请假");
        mRequest4.setNumber(4);
        jingli.handleRequest(mRequest4);

        Request mRequest5 = new Request();
        mRequest5.setRequestType("请假");
        mRequest5.setRequestContent("sh2zqp请假");
        mRequest5.setNumber(12);
        jingli.handleRequest(mRequest5);
    }
}
