package com.zqp2sh.designpattern.备忘录模式.version2;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月13日 15:59
 *
 * 发起人类
 */

public class Originator {

    // 需要保存的属性,可能有多个
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    /**
     * 创建备忘录,将当前需要保存的信息导入并实例化出一个备忘录对象
     * @return
     */
    public Memento createMemento() {
        return new Memento(state);
    }

    /**
     * 恢复备忘录,将Memento导入并将相关数据恢复
     * @param memento
     */
    public void setMemento(Memento memento) {
        state = memento.getState();
    }

    // 显示数据
    public void show() {
        System.out.println("State = " + state);
    }

}
