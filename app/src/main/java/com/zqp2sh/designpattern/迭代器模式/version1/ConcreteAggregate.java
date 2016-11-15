package com.zqp2sh.designpattern.迭代器模式.version1;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月13日 20:39
 *
 * 具体聚集类
 */

class ConcreteAggregate extends Aggregate {

    // 声明一个链表用于存放聚集对象
    private List<Object> items = new ArrayList<>();

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    /**
     * 返回聚集总个数
     */
    int getCount() {
        return items.size();
    }

    /**
     * 得到index处的对象
     */
    Object getItem(int index) {
        return items.get(index);
    }

    /**
     * 在index处插入对象
     */
    void setItem(int index, Object o) {
        items.add(index, o);
    }

}
