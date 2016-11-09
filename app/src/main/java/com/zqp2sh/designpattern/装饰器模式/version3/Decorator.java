package com.zqp2sh.designpattern.装饰器模式.version3;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月09日 19:07
 */

public abstract class Decorator extends Component {

    protected Component mComponent;

    public void setComponent(Component component) {
        mComponent = component;
    }

    @Override
    public void operation() {
        if (mComponent != null) {
            mComponent.operation();
        }
    }
}
