package design.pattern.state;

import org.apache.log4j.Logger;

/**
 * @Description TODO
 * @Author: Q-WHai
 * @Date: Created in 16:41 2019/04/10
 */
abstract class State {

    protected Logger logger = Logger.getLogger(State.class);
    protected Lift context;

    void setContext(Lift context) {
        this.context = context;
    }

    /**
     * 开门
     */
    abstract void open();

    /**
     * 关门
     */
    abstract void close();

    /**
     * 启动
     */
    abstract void run();

    /**
     * 停止
     */
    abstract void stop();
}
