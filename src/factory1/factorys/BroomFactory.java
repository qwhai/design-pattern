package factory1.factorys;

import factory1.interf.Moveable;
import factory1.prod.Broom;

// 具体工厂
public class BroomFactory extends VehicleFactory {

    @Override
    public Moveable create() {
        return new Broom();
    }

}
