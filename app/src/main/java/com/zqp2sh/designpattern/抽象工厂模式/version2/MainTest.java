package com.zqp2sh.designpattern.抽象工厂模式.version2;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月10日 16:09
 */

public class MainTest {
    public static void main(String[] args) {
        User user = new User();

        IFactory factory = new AccessFactory();
        // IFactory factory = new SqlserverFactory();
        IUser iUser = factory.createUser();
        iUser.insertUser(user);
        iUser.getUser(1);

    }
}
