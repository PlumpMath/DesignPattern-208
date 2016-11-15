package com.zqp2sh.designpattern.迭代器模式.version1;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月13日 20:38
 *
 * 正向遍历 迭代器Iterator
 */

public class ConcreteIterator extends Iterator {

    private ConcreteAggregate mAggregate; // 定义一个具体的聚集对象
    private int current = 0;

    public ConcreteIterator(ConcreteAggregate aggregate) {
        mAggregate = aggregate; // 初始化时将具体的聚集对象传入
    }

    // 得到聚集的第一个对象
    @Override
    public Object first() {
        return mAggregate.getItem(0);
    }

    // 得到聚集的下一个对象
    @Override
    public Object next() {
        Object o = null;
        current++;
        if (current < mAggregate.getCount()) {
            o = mAggregate.getItem(current);
        }
        return o;
    }

    // 判断当前是否遍历到结尾,到结尾时返回true
    @Override
    public boolean isDone() {
        return current >= mAggregate.getCount();
    }

    // 返回当前的聚集对象
    @Override
    public Object currentItem() {
        return mAggregate.getItem(current);
    }
}
