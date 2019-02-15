package factory2.prod;

import factory2.interf.Food;

public class Banana implements Food {

    @Override
    public void eat() {
        System.out.println("我是香蕉，我被吃了.");
    }

}
