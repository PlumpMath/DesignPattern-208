package com.zqp2sh.designpattern.建造者模式.version2;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月10日 14:48
 *
 * 产品类,由多个部件组成
 */

class Product {

    private List<String> parts = new ArrayList<>();

    // 添加产品部件
    public void add(String part) {
        parts.add(part);
    }

    // 列举产品所有的部件
    public void show() {
        System.out.println("产品开始创建......");
        for (String part : parts) {
            System.out.println(part);
        }
        System.out.println("产品结束创建......");
    }

}
