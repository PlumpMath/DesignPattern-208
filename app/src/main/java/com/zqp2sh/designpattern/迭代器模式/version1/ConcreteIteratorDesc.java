package com.zqp2sh.designpattern.迭代器模式.version1;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月13日 20:38
 *
 * 反向遍历 迭代器Iterator
 */

public class ConcreteIteratorDesc extends Iterator {

    private ConcreteAggregate mAggregate; // 定义一个具体的聚集对象
    private int current = 0;

    public ConcreteIteratorDesc(ConcreteAggregate aggregate) {
        mAggregate = aggregate; // 初始化时将具体的聚集对象传入
        current = mAggregate.getCount() - 1;  // 从后向前遍历
    }

    // 得到聚集的第一个对象
    @Override
    public Object first() {
        return mAggregate.getItem(mAggregate.getCount() - 1);
    }

    // 得到聚集的下一个对象
    @Override
    public Object next() {
        Object o = null;
        current--;
        if (current >= 0) {
            o = mAggregate.getItem(current);
        }
        return o;
    }

    // 判断当前是否遍历到结尾,到结尾时返回true
    @Override
    public boolean isDone() {
        return current < 0;
    }

    // 返回当前的聚集对象
    @Override
    public Object currentItem() {
        return mAggregate.getItem(current);
    }
}
