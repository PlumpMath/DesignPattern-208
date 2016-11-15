package com.zqp2sh.designpattern.抽象工厂模式.version3;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月11日 09:53
 */

public class AccessProject implements IProject {
    @Override
    public void insertProject(Project project) {
        System.out.println("在Access中给Project表增加了一条记录");
    }

    @Override
    public Project getProject(int id) {
        System.out.println("在Access中根据Id得到Project表的一条记录");
        return null;
    }
}
