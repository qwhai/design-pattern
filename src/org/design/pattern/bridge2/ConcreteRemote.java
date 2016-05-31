package org.design.pattern.bridge2;

public class ConcreteRemote extends RemoteControl {

    private int currentStation = 0;
    private final int MAX_STATION = 25;
    
    public ConcreteRemote(TV _tv) {
        super(_tv);
    }
    
    @Override
    public void on() {
        tv.on();
    }

    @Override
    public void off() {
        tv.off();
    }
    
    public void setChannel(int channel) {
        currentStation = channel;
        super.setChannel(currentStation);
    }
    
    public void nextChannel() {
        currentStation = (MAX_STATION + currentStation + 1) % MAX_STATION;
        super.setChannel(currentStation);
    }

    public void previousChannel() {
        currentStation = (MAX_STATION + currentStation - 1) % MAX_STATION;
        super.setChannel(currentStation);
    }
}
