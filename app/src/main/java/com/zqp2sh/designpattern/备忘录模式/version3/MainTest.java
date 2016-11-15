package com.zqp2sh.designpattern.备忘录模式.version3;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月13日 15:37
 */

public class MainTest {
    public static void main(String[] args) {

        // 与boss战斗前
        GameRole gameRole = new GameRole();
        gameRole.getInitState();
        gameRole.stateDisplay();

        // 保存进度
        RoleStateCaretaker caretaker = new RoleStateCaretaker();
        caretaker.setRoleStateMemento(gameRole.saveState());

        // 大战之后,耗损严重
        gameRole.fight();
        gameRole.stateDisplay();

        // 恢复以前的状态
        gameRole.recoveryState(caretaker.getRoleStateMemento());
        gameRole.stateDisplay();
    }
}
