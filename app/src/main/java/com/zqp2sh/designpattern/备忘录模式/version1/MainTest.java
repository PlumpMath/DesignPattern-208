package com.zqp2sh.designpattern.备忘录模式.version1;

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

        // 保存进度(通过"游戏角色"新实例保存进度)
        GameRole backUp = new GameRole();
        backUp.setVit(gameRole.getVit());
        backUp.setAtk(gameRole.getAtk());
        backUp.setDef(gameRole.getDef());

        // 大战之后,耗损严重
        gameRole.fight();
        gameRole.stateDisplay();

        // 恢复以前的状态
        gameRole.setVit(backUp.getVit());
        gameRole.setAtk(backUp.getAtk());
        gameRole.setDef(backUp.getDef());

        gameRole.stateDisplay();
    }
}
