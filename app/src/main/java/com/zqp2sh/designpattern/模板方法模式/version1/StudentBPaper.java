package com.zqp2sh.designpattern.模板方法模式.version1;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月10日 13:06
 *
 * B同学作答后的试卷
 */

class StudentBPaper extends TestPaper {

    @Override
    String answer1() {
        return "c";
    }

    @Override
    String answer2() {
        return "b";
    }

    @Override
    String answer3() {
        return "a";
    }
}
