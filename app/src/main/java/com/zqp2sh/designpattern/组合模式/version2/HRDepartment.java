package com.zqp2sh.designpattern.组合模式.version2;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月13日 19:59
 */

public class HRDepartment extends Company {

    public HRDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {

    }

    @Override
    public void remove(Company company) {

    }

    @Override
    public void display(int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("-");
        }
        System.out.println(mName);
    }

    @Override
    public void lineOfDuty() {
        System.out.println(mName + ": 员工招聘培训管理");
    }
}
