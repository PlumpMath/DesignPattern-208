package com.zqp2sh.designpattern.抽象工厂模式.version3;


/**
 * 作者 @sh2zqp
 * 时间 @2016年11月10日 16:10
 */

interface IProject {
    void insertProject(Project project);
    Project getProject(int id);
}
