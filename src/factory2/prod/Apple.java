package factory2.prod;

import factory2.interf.Food;

public class Apple implements Food {

    @Override
    public void eat() {
        System.out.println("我是苹果，我被吃了.");
    }

}
