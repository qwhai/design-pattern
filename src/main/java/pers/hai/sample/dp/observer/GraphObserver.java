package pers.hai.sample.dp.observer;

import pers.hai.sample.dp.observer.framework.NumberGenerator;
import pers.hai.sample.dp.observer.framework.Observer;

/**
 * Last Modify: 2019-05-24
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
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
