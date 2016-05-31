package org.design.pattern.observer.timer.interf;

/**
 * 计时器的主题接口
 *
 * Created by Naga on 2015/11/24.
 * Blog : http://blog.csdn.net/lemon_tree12138
 * GitHub : https://github.com/William-Hai
 */
public interface TimerSubject {

    /**
     * 为新的观察者实现注册服务
     *
     * @param o
     *          观察者
     */
    public void registerObserver(TimerObserver o);

    /**
     * 移除某一个观察者对象
     *
     * @param o
     *          观察者
     */
    public void removeObserver(TimerObserver o);

    /**
     * 更新通知所有的观察者主题状态已经改变
     */
    public void notifyObservers();
}
