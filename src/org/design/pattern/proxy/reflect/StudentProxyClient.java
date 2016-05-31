package org.design.pattern.proxy.reflect;

import java.lang.reflect.InvocationTargetException;

public class StudentProxyClient {

    public static void main(String[] args) {
        StudentProxy proxy = new StudentProxy(new Pupil("小明"));
        proxy.examinate();
        proxy.announce();

        try {
            proxy.cheat();
        } catch (ClassNotFoundException | NoSuchMethodException
                | SecurityException | IllegalAccessException
                | IllegalArgumentException | InvocationTargetException e) {
            e.printStackTrace();
        }

        proxy.announce();
    }
}
