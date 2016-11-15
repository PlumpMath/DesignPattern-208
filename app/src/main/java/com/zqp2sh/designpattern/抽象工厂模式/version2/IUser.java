package com.zqp2sh.designpattern.抽象工厂模式.version2;


/**
 * 作者 @sh2zqp
 * 时间 @2016年11月10日 16:10
 */

public interface IUser {
    void insertUser(User user);
    User getUser(int id);
}
