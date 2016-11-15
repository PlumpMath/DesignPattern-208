package com.zqp2sh.designpattern.抽象工厂模式.version1;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月10日 16:03
 */

public class SqlserverUser {
    public void insertUser(User user) {
        System.out.println("在SQL Server中给User表增加了一条记录");
    }
    public User getUser(int id) {
        System.out.println("在SQL Server中根据Id得到User表的一条记录");
        return null;
    }
}
