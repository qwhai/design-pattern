package pers.hai.sample.dp.observer.framework;

/**
 * Last Modify: 2019-05-24
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public interface NumberGenerator {

    void generate();

    void registerChangedObserver(Observer observer);
    void registerCycleObserver(Observer observer, int t);
    void publish();

    String getName();
    int getNumber();
}
