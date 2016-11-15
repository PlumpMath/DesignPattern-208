package com.zqp2sh.designpattern.建造者模式.version2;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月10日 14:53
 *
 * 具体建造者类
 * 实现了Builder接口,建造具体的两个部件是partX和partY
 */

class ConcreteBuilder2 extends Builder {

    private Product mProduct = new Product();

    @Override
    public void buildPartA() {
        mProduct.add("partX");
    }

    @Override
    public void buildPartB() {
        mProduct.add("partY");
    }

    @Override
    public Product build() {
        return mProduct;
    }
}
