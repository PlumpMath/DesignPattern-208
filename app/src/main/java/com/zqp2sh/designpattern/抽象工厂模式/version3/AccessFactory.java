package com.zqp2sh.designpattern.抽象工厂模式.version3;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月10日 16:13
 */

public class AccessFactory implements IFactory {
    @Override
    public IUser createUser() {
        return new AccessUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new AccessDepartment();
    }

    @Override
    public IProject createProject() {
        return new AccessProject();
    }
}
