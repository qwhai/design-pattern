package org.design.pattern.factory2.prod;

import org.design.pattern.factory2.interf.DotAHero;

public class Medusa implements DotAHero {

    @Override
    public void choose() {
        System.out.println("你选择了英雄" + getClass().getSimpleName());
    }

}
