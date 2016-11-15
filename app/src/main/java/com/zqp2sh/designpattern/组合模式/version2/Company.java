package com.zqp2sh.designpattern.组合模式.version2;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月13日 19:52
 */

public abstract class Company {

    protected String mName;

    public Company(String name) {
        mName = name;
    }

    public abstract void add(Company company);      // 增加
    public abstract void remove(Company company);   // 移除
    public abstract void display(int depth);        // 显示
    public abstract void lineOfDuty();              // 履行职责,新增此方法,不同的部门需要履行不同的职责

}
