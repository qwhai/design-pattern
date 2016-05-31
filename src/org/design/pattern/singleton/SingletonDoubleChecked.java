package org.design.pattern.singleton;

public class SingletonDoubleChecked {

    private volatile static SingletonDoubleChecked mDoubleChecked = null;
    
    private SingletonDoubleChecked() {
    }
    
    public static SingletonDoubleChecked getInstance() {
        if (mDoubleChecked == null) {
            synchronized (SingletonDoubleChecked.class) {
                if (mDoubleChecked == null) {
                    mDoubleChecked = new SingletonDoubleChecked();
                }
            }
        }
        
        return mDoubleChecked;
    }
    
    public void printLabel() {
        System.out.println("SingletonDoubleChecked Class Label.");
    }
}
