package com.zqp2sh.designpattern.抽象工厂模式.version3;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月10日 16:11
 */

public class SqlserverDepartment implements IDepartment {
    @Override
    public void insertDepartment(Department department) {
        System.out.println("在SQL Server中给Department表增加了一条记录");
    }

    @Override
    public Department getDepartment(int id) {
        System.out.println("在SQL Server中根据Id得到Department表的一条记录");
        return null;
    }
}
