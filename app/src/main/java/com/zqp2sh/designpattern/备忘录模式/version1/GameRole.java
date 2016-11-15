package com.zqp2sh.designpattern.备忘录模式.version1;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月13日 15:42
 */

public class GameRole {

    // 生命力
    private int vit;
    // 攻击力
    private int atk;
    // 防御力
    private int def;

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    // 状态显示
    public void stateDisplay() {
        System.out.println("角色当前的状态:");
        System.out.println("生命力: " + this.vit);
        System.out.println("攻击力: " + this.vit);
        System.out.println("防御力: " + this.vit);
    }

    public void getInitState() {
        // 数据通常来自于本机的磁盘或远程的数据库
        this.vit = 100;
        this.atk = 100;
        this.def = 100;
    }

    public void fight() {
        // 与boss大战后游戏数据耗损到为0
        this.vit = 0;
        this.atk = 0;
        this.def = 0;
    }

}
