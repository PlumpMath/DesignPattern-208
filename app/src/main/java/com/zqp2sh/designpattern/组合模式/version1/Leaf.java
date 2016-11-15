package com.zqp2sh.designpattern.组合模式.version1;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月13日 18:27
 *
 * 叶子类
 *
 * 在组合中表示叶节点对象。叶节点没有子节点
 * 由于叶子没有再增加分支和树叶,所以add和remove方法的实现并无意义
 * 但这样做却可以消除叶节点和枝节点对象在抽象层次的区别,使它们具有完全一致的接口
 */

public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        System.out.println("不能在一个叶子上add");
    }

    @Override
    public void remove(Component component) {
        System.out.println("不能在一个叶子上remove");
    }

    /**
     * 叶节点的具体方法,显示其名称与层次级别
     * @param depth
     */
    @Override
    public void display(int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("-");
        }
        System.out.println(mName);
    }
}
