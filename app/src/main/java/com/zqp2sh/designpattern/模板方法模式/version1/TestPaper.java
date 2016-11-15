package com.zqp2sh.designpattern.模板方法模式.version1;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月10日 13:02
 *
 * 老师出的一份测试试卷(AbstractClass模板抽象类)
 * 使子类继承这个模板类,所有重复的代码都应该要放到这个父类中,而不是去让子类去重复这个内容
 */

abstract class TestPaper {

    // 模板方法(具体实现的方法),给出了一个顶级逻辑的架构,而逻辑的组成步骤在相应的抽象操作中,
    // 推迟到子类中去实现。当然顶级逻辑中也可能去调用一些具体方法。
    void question1() {
        System.out.println("试题1,答案是:");
        System.out.println("a,b,c,d");
        System.out.println("答案: " + answer1()); // answer1()抽象操作
    }

    void question2() {
        System.out.println("试题2,答案是:");
        System.out.println("a,b,c,d");
        System.out.println("答案: " + answer2());
    }

    void question3() {
        System.out.println("试题3,答案是:");
        System.out.println("a,b,c,d");
        System.out.println("答案: " + answer3());
    }

    // 更详细的层次细节由其子类来实现,因为每个子类对试题的答案并不一样(抽象行为)
    abstract String answer1();
    abstract String answer2();
    abstract String answer3();

}
