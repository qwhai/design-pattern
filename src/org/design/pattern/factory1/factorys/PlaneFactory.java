package org.design.pattern.factory1.factorys;

import org.design.pattern.factory1.interf.Moveable;
import org.design.pattern.factory1.prod.Plane;

// 具体工厂
public class PlaneFactory extends VehicleFactory {

    @Override
    public Moveable create() {
        return new Plane();
    }

}
