package com.zqp2sh.designpattern.建造者模式.version1;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月10日 14:30
 */

class PersonDirector {

    private PersonBuilder mPersonBuilder;

    PersonDirector(PersonBuilder personBuilder) {
        mPersonBuilder = personBuilder;
    }

    void createPerson() {
        mPersonBuilder.buildHead();
        mPersonBuilder.buildBody();
        mPersonBuilder.buildArmLeft();
        mPersonBuilder.buildArmRight();
        mPersonBuilder.buildLegLeft();
        mPersonBuilder.buildLegRight();
    }
}
