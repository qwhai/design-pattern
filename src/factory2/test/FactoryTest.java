package factory2.test;

import factory2.factorys.AbstractFactory;
import factory2.factorys.DefaultFactory;
import factory2.interf.DotAHero;
import factory2.interf.Food;
import factory2.interf.Vehicle;
import factory2.interf.Weapon;

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
