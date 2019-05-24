package pers.hai.sample.dp.observer;

import pers.hai.sample.dp.observer.framework.NumberGenerator;
import pers.hai.sample.dp.observer.framework.Observer;

/**
 * Last Modify: 2019-05-24
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class CycleObserver implements Observer {

    @Override
    public void update(NumberGenerator generator) {
        System.out.println(String.format("Cycle Observer 接收到 %s 发布的更新：%d", generator.getName(), generator.getNumber()));
    }
}
