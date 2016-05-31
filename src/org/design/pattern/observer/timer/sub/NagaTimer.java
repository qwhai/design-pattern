package org.design.pattern.observer.timer.sub;

import org.design.pattern.observer.timer.interf.TimerObserver;
import org.design.pattern.observer.timer.interf.TimerSubject;
import org.design.pattern.observer.timer.obj.CountDownTimer;

import java.util.ArrayList;
import java.util.List;

/**
 * 计时器的主题对象
 *
 * Created by Naga on 2015/11/24.
 * Blog : http://blog.csdn.net/lemon_tree12138
 * GitHub : https://github.com/William-Hai
 */
public class NagaTimer implements TimerSubject {

    private long mCurrentStamp = 0L;

    private List<TimerObserver> mObservers = null;

    public NagaTimer() {
        if (mObservers == null) {
            mObservers = new ArrayList<>();
        }
    }

    @Override
    public void registerObserver(TimerObserver o) {
        if (mObservers != null) {
            mObservers.add(o);
        }
    }

    @Override
    public void removeObserver(TimerObserver o) {
        if (mObservers == null) {
            return;
        }

        mObservers.remove(o);
    }

    /**
     * 更新通知所有的观察者
     */
    @Override
    public void notifyObservers() {
        if (mObservers == null || mObservers.size() == 0) {
            return;
        }

        for (int i = 0; i < mObservers.size(); i++) {
            CountDownTimer countDownTimer = (CountDownTimer)mObservers.get(i);
            if (countDownTimer.isDone()) {
                removeObserver(mObservers.get(i));
            } else {
                countDownTimer.update(mCurrentStamp);
            }
        }
    }

    private void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(long currentStamp) {
        mCurrentStamp = currentStamp;
        measurementsChanged();
    }
}
