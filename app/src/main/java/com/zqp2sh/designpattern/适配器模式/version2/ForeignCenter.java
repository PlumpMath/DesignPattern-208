package com.zqp2sh.designpattern.适配器模式.version2;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月13日 15:18
 */

public class ForeignCenter {

    private String mName;

    public ForeignCenter(String name) {
        mName = name;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public void attackByZh() {
        System.out.println(mName + ": 外籍中锋进攻");
    }

    public void defenseByZh() {
        System.out.println(mName + ": 外籍中锋防守");
    }

}
