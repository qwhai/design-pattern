package org.design.pattern.observer.timer.obj;

import org.design.pattern.observer.timer.interf.TimerDisplayable;
import org.design.pattern.observer.timer.interf.TimerObserver;

/**
 * 观察者：具体计时器
 *
 * Created by Naga on 2015/11/24.
 * Blog : http://blog.csdn.net/lemon_tree12138
 * GitHub : https://github.com/William-Hai
 */
public class CountDownTimer implements TimerObserver, TimerDisplayable {

    private String mName;
    private long mStartStamp;
    private long mCountdownStamp;
    private long mCurrentStamp = 0L;

    public CountDownTimer(String name, long countdown) {
        this.mStartStamp = System.currentTimeMillis();
        this.mName = name;
        this.mCountdownStamp = countdown;
    }

    @Override
    public void display() {
        if (mCurrentStamp - mStartStamp <= mCountdownStamp) {
            System.out.println(getName() + "还剩" + ((mCountdownStamp - (mCurrentStamp - mStartStamp)) / 1000) + "s");
        }
    }

    @Override
    public void update(long stamp) {
        mCurrentStamp = stamp;
        display();
    }

    public boolean isDone() {
        if (mCurrentStamp - mStartStamp >= mCountdownStamp) {
            return true;
        }

        return false;
    }

    public String getName() {
        return mName;
    }
}
