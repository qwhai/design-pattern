package factory2.prod;

import factory2.interf.Vehicle;

public class Bus implements Vehicle {

    @Override
    public void drive() {
        System.out.println("我是公共汽车，我马上就可以到站了.");
    }

}
