package org.design.pattern.factory2.factorys;

import org.design.pattern.factory2.interf.DotAHero;
import org.design.pattern.factory2.interf.Food;
import org.design.pattern.factory2.interf.Vehicle;
import org.design.pattern.factory2.interf.Weapon;
import org.design.pattern.factory2.prod.Apple;
import org.design.pattern.factory2.prod.Banana;
import org.design.pattern.factory2.prod.Bus;
import org.design.pattern.factory2.prod.Car;
import org.design.pattern.factory2.prod.Fighter;
import org.design.pattern.factory2.prod.Mango;
import org.design.pattern.factory2.prod.Medusa;
import org.design.pattern.factory2.prod.Naga;
import org.design.pattern.factory2.prod.Pistol;
import org.design.pattern.factory2.prod.Zeus;

public class DefaultFactory extends AbstractFactory {

    @Override
    public Food createApple() {
        return new Apple();
    }
    
    @Override
    public Food createBanana() {
        return new Banana();
    }

    @Override
    public Food createMango() {
        return new Mango();
    }

    
    @Override
    public DotAHero createMedusa() {
        return new Medusa();
    }

    @Override
    public DotAHero createNaga() {
        return new Naga();
    }

    @Override
    public DotAHero createZeus() {
        return new Zeus();
    }

    @Override
    public Vehicle createBus() {
        return new Bus();
    }
    
    @Override
    public Vehicle createCar() {
        return new Car();
    }

    @Override
    public Weapon createFighter() {
        return new Fighter();
    }
    
    @Override
    public Weapon createPistol() {
        return new Pistol();
    }

}
