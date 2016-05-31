package org.design.pattern.singleton;

public class SingletonClass {

    private static SingletonClass mSingletonClass = null;
    
    private SingletonClass() {
    }
    
    public static synchronized SingletonClass getInstance() {
        if (mSingletonClass == null) {
            mSingletonClass = new SingletonClass();
        }
        
        return mSingletonClass;
    }
    
    public void printLabel() {
        System.out.println("Singleton Class Label.");
    }
}
