package org.design.pattern.factory1.test;

import org.design.pattern.factory1.factorys.PlaneFactory;
import org.design.pattern.factory1.factorys.VehicleFactory;
import org.design.pattern.factory1.interf.Moveable;
import org.design.pattern.factory1.prod.Broom;
import org.design.pattern.factory1.simple.SimpleFactory;

public class FactoryTest {

    public static void main(String[] args) {
        // 简单工厂模式测试
        SimpleFactory simpleFactory = new SimpleFactory();
        Broom broom = (Broom) simpleFactory.create(Broom.class);
        broom.run();
        
        // 工厂方法测试
        VehicleFactory factory = new PlaneFactory();
        Moveable moveable = factory.create();
        moveable.run();
    }
}
