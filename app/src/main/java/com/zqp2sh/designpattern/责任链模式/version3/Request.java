package com.zqp2sh.designpattern.责任链模式.version3;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月08日 18:05
 */

public class Request {
    // 申请类别
    private String mRequestType;
    // 申请内容
    private String mRequestContent;
    // 申请数量
    private int mNumber;

    public String getRequestType() {
        return mRequestType;
    }

    public void setRequestType(String requestType) {
        mRequestType = requestType;
    }

    public String getRequestContent() {
        return mRequestContent;
    }

    public void setRequestContent(String requestContent) {
        mRequestContent = requestContent;
    }

    public int getNumber() {
        return mNumber;
    }

    public void setNumber(int number) {
        mNumber = number;
    }
}
