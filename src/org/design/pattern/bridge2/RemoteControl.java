package org.design.pattern.bridge2;

public abstract class RemoteControl {

    protected TV tv = null;
    
    public RemoteControl(TV _tv) {
        this.tv = _tv;
    }
    
    public abstract void on();
    
    public abstract void off();
    
    public void setChannel(int channel) {
        if (tv != null) {
            tv.tuneChannel(channel);
        }
    }
}
