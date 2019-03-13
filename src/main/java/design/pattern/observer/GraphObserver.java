package design.pattern.observer;

import design.pattern.observer.framework.NumberGenerator;
import design.pattern.observer.framework.Observer;

public class GraphObserver implements Observer {

    @Override
    public void update(NumberGenerator generator) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < generator.getNumber(); i++) {
            sb.append("*");
        }
        System.out.println(String.format("Graph Observer 接收到 %s 发布的更新：%s", generator.getName(), sb.toString()));
    }
}
