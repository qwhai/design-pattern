package org.design.pattern.factory2.prod;

import org.design.pattern.factory2.interf.Weapon;

public class Fighter implements Weapon {

    @Override
    public void shoot() {
        System.out.println("我是一架战斗机，在原地等着我的炮弹吧。");
    }

}
