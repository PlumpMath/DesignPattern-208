package com.zqp2sh.designpattern.抽象工厂模式.version1;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月10日 15:51
 */

public class MainTest {
    public static void main(String[] args) {
        User user = new User();
        SqlserverUser sqlserverUser = new SqlserverUser();
        sqlserverUser.insertUser(user);
        sqlserverUser.getUser(1);
    }
}
