package com.zqp2sh.designpattern.抽象工厂模式.version3;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月10日 16:09
 */

public class MainTest {
    public static void main(String[] args) {
        User user = new User();
        Department department = new Department();
        Project project = new Project();

        IFactory factory = new AccessFactory();
        IUser iUser = factory.createUser();
        iUser.insertUser(user);
        iUser.getUser(1);
        IDepartment iDepartment = factory.createDepartment();
        iDepartment.insertDepartment(department);
        iDepartment.getDepartment(2);
        IProject iProject = factory.createProject();
        iProject.insertProject(project);
        iProject.getProject(3);
    }
}
