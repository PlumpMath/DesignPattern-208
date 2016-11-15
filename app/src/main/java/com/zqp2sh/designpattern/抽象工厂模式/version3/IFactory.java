package com.zqp2sh.designpattern.抽象工厂模式.version3;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月10日 16:13
 */

public interface IFactory {
    IUser createUser();
    IDepartment createDepartment();
    IProject createProject();
}
