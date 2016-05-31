package org.design.pattern.factory3.test;

import org.design.pattern.factory3.factorys.AbstractFactory;
import org.design.pattern.factory3.factorys.Factory1;
import org.design.pattern.factory3.interf.Flyable;
import org.design.pattern.factory3.interf.Moveable;
import org.design.pattern.factory3.interf.Writeable;

public class FactoryTest {

    public static void main(String[] args) {
        AbstractFactory factory = new Factory1();
        Flyable flyable = factory.createFlyable();
        flyable.fly(1589);
        
        Moveable moveable = factory.createMoveable();
        moveable.run(87.6);
        
        Writeable writeable = factory.createWriteable();
        writeable.write("Hello World.");
    }
}
