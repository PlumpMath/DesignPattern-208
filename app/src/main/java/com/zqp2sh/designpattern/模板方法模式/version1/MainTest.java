package com.zqp2sh.designpattern.模板方法模式.version1;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月10日 12:41
 */

public class MainTest {
    public static void main(String[] args) {
        TestPaper studentA = new StudentAPaper();
        System.out.println("----------学生A的试卷----------");
        studentA.question1();
        studentA.question2();
        studentA.question3();

        System.out.println("----------学生B的试卷----------");
        TestPaper studentB = new StudentBPaper();
        studentB.question1();
        studentB.question2();
        studentB.question3();
    }
}
