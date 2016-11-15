package com.zqp2sh.designpattern.抽象工厂模式.version3;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月10日 16:11
 */

public class AccessUser implements IUser {
    @Override
    public void insertUser(User user) {
        System.out.println("在Access中给User表增加了一条记录");
    }

    @Override
    public User getUser(int id) {
        System.out.println("在Access中根据Id得到User表的一条记录");
        return null;
    }
}
