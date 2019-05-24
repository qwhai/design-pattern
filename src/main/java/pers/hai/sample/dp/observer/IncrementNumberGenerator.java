package pers.hai.sample.dp.observer;

import pers.hai.sample.dp.observer.framework.NumberGenerator;
import pers.hai.sample.dp.observer.framework.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Last Modify: 2019-05-24
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class IncrementNumberGenerator implements NumberGenerator {

    private int number = 0;
    private int cycle = 4;
    private List<Observer> observers = new ArrayList<>();
    private List<Observer> cycleObservers = new ArrayList<>();

    @Override
    public void registerChangedObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void generate() {
        number += 3;
    }

    @Override
    public void publish() {
        changed();
        cycle();
    }

    @Override
    public void registerCycleObserver(Observer observer, int t) {
        cycleObservers.add(observer);
        cycle = t;
    }

    private void changed() {
        for (Observer o : observers) {
            o.update(this);

        }
    }

    private void cycle() {
        if (0 != (number % cycle)) return;

        for (Observer o : cycleObservers) {
            o.update(this);
        }
    }

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public String getName() {
        return "Increment Number Generator";
    }
}
