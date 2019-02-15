package factory1.test;

import factory1.factorys.PlaneFactory;
import factory1.factorys.VehicleFactory;
import factory1.interf.Moveable;
import factory1.prod.Broom;
import factory1.simple.SimpleFactory;

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
