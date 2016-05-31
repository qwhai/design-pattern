package org.design.pattern.factory2.factorys;

import org.design.pattern.factory2.interf.DotAHero;
import org.design.pattern.factory2.interf.Food;
import org.design.pattern.factory2.interf.Vehicle;
import org.design.pattern.factory2.interf.Weapon;

// 抽象工厂类
public abstract class AbstractFactory {

    public abstract Food createApple();
    public abstract Food createBanana();
    public abstract Food createMango();

    public abstract DotAHero createMedusa();
    public abstract DotAHero createNaga();
    public abstract DotAHero createZeus();
    
    public abstract Vehicle createBus();
    public abstract Vehicle createCar();
    
    public abstract Weapon createFighter();
    public abstract Weapon createPistol();
}
