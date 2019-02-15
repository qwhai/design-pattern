package factory2.factorys;

import factory2.interf.DotAHero;
import factory2.interf.Food;
import factory2.interf.Vehicle;
import factory2.interf.Weapon;
import factory2.prod.Apple;
import factory2.prod.Banana;
import factory2.prod.Bus;
import factory2.prod.Car;
import factory2.prod.Fighter;
import factory2.prod.Mango;
import factory2.prod.Medusa;
import factory2.prod.Naga;
import factory2.prod.Pistol;
import factory2.prod.Zeus;

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
