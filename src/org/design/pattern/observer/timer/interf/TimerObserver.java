package org.design.pattern.observer.timer.interf;

/**
 * 主题(被观察者)对象
 *
 * Created by Naga on 2015/11/24.
 * Blog : http://blog.csdn.net/lemon_tree12138
 * GitHub : https://github.com/William-Hai
 */
public interface TimerObserver {

    /**
     * 主题对象只做一件事情，就是更新当前时间
     *
     * @param stamp
     */
    public void update(long stamp);
}
