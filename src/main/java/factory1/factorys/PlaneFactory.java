package factory1.factorys;

import factory1.interf.Moveable;
import factory1.prod.Plane;

// 具体工厂
public class PlaneFactory extends VehicleFactory {

    @Override
    public Moveable create() {
        return new Plane();
    }

}
