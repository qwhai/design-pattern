package design.pattern.observer;

import design.pattern.observer.framework.NumberGenerator;
import design.pattern.observer.framework.Observer;

public class DigitObserver implements Observer {

    @Override
    public void update(NumberGenerator generator) {
        System.out.println(String.format("Digit Observer 接收到 %s 发布的更新：%d", generator.getName(), generator.getNumber()));
    }
}
