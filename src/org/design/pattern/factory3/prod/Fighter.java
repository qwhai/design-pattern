package org.design.pattern.factory3.prod;

import org.design.pattern.factory3.interf.Flyable;

public class Fighter implements Flyable {

    @Override
    public void fly(int height) {
        System.out.println("我是一架战斗机，我目前的飞行高度为：" + height + "千米。");
    }

}
