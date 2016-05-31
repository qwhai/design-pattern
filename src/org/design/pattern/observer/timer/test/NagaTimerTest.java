package org.design.pattern.observer.timer.test;

import org.design.pattern.observer.timer.obj.CountDownTimer;
import org.design.pattern.observer.timer.sub.NagaTimer;

import java.util.Timer;
import java.util.TimerTask;

/**
 * 测试类
 *
 * Created by Naga on 2015/11/24.
 * Blog : http://blog.csdn.net/lemon_tree12138
 * GitHub : https://github.com/William-Hai
 */
public class NagaTimerTest {

    NagaTimer nagaTimer = new NagaTimer();

    public static void main(String[] args) {
        NagaTimerTest test = new NagaTimerTest();
        test.startTimerThread();
    }

    private void startTimerThread() {
        CountDownTimer countDownTimerA = new CountDownTimer("计时器A", 6 * 1000);
        CountDownTimer countDownTimerB = new CountDownTimer("计时器B", 5 * 1000);
        CountDownTimer countDownTimerC = new CountDownTimer("计时器C", 10 * 1000);
        nagaTimer.registerObserver(countDownTimerA);
        nagaTimer.registerObserver(countDownTimerB);
        nagaTimer.registerObserver(countDownTimerC);

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                nagaTimer.setMeasurements(System.currentTimeMillis());
            }
        };

        timer.schedule(task, 0, 1000);
    }
}
