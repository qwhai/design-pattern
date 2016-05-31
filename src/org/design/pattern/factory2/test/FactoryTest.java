package org.design.pattern.factory2.test;

import org.design.pattern.factory2.factorys.AbstractFactory;
import org.design.pattern.factory2.factorys.DefaultFactory;
import org.design.pattern.factory2.interf.DotAHero;
import org.design.pattern.factory2.interf.Food;
import org.design.pattern.factory2.interf.Vehicle;
import org.design.pattern.factory2.interf.Weapon;

public class FactoryTest {

    public static void main(String[] args) {
        AbstractFactory factory = new DefaultFactory();
        
        Food food = factory.createApple();
        food.eat();
        
        Vehicle vehicle = factory.createBus();
        vehicle.drive();
        
        Weapon weapon = factory.createFighter();
        weapon.shoot();
        
        DotAHero hero = factory.createMedusa();
        hero.choose();
    }
}
