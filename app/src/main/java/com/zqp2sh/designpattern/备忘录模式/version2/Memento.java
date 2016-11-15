package com.zqp2sh.designpattern.备忘录模式.version2;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月13日 16:00
 *
 * 备忘录类
 */

public class Memento {

    private String state;

    /**
     * 构造方法,将相关数据导入
     * @param state
     */
    public Memento(String state) {
        this.state = state;
    }

    /**
     * 需要保存的数据属性,可以是多个
     * @return
     */
    public String getState() {
        return state;
    }

}
