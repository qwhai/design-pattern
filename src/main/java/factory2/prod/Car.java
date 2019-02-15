package factory2.prod;

import factory2.interf.Vehicle;

public class Car implements Vehicle {

    @Override
    public void drive() {
        System.out.println("我是一辆小汽车，行驶在大马路上.");
    }

}
