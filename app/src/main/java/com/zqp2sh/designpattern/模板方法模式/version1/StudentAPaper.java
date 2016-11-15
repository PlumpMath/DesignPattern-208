package com.zqp2sh.designpattern.模板方法模式.version1;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月10日 13:06
 *
 * A同学作答后的试卷(ConcreteClass)
 * 实现父类所定义的抽象方法
 */

class StudentAPaper extends TestPaper {

    @Override
    String answer1() {
        return "a";
    }

    @Override
    String answer2() {
        return "b";
    }

    @Override
    String answer3() {
        return "c";
    }
}
