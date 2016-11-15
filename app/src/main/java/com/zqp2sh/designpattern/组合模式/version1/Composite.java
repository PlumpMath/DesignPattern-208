package com.zqp2sh.designpattern.组合模式.version1;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月13日 18:30
 *
 * 分支类
 *
 * 定义有枝节点行为,用来存储子部件,在Component接口中实现与子部件有关的操作,
 * 比如add和remove节点
 */

public class Composite extends Component {

    // 一个子对象集合用来存储其下属的枝节点和叶节点
    private List<Component> children = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        children.add(component);
    }

    @Override
    public void remove(Component component) {
        if (children.contains(component))
            children.remove(component);
    }

    /**
     * 显示其枝节点名称,并对其下属进行逐层遍历,直至所有的叶节点为止
     * @param depth
     */
    @Override
    public void display(int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("-");
        }
        System.out.println(mName);
        for (Component c : children) {
            c.display(depth + 2);
        }
    }
}
