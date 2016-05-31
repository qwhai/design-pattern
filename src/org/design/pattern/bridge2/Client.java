package org.design.pattern.bridge2;

public class Client {

    public static void main(String[] args) {
        TV tv = new Sony();
        ConcreteRemote remote = new ConcreteRemote(tv);
        remote.on();
        remote.setChannel(7);
        remote.nextChannel();
        remote.off();
    }
}
