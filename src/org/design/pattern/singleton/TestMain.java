package org.design.pattern.singleton;

public class TestMain {

    public static void main(String[] args) {
        SingletonClass singletonClass = SingletonClass.getInstance();
        singletonClass.printLabel();
        
        SingletonDoubleChecked doubleChecked = SingletonDoubleChecked.getInstance();
        doubleChecked.printLabel();
    }
}
