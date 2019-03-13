package design.pattern.observer.framework;

public interface NumberGenerator {

    void generate();

    void registerChangedObserver(Observer observer);
    void registerCycleObserver(Observer observer, int t);
    void publish();

    String getName();
    int getNumber();
}
