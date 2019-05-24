package pers.hai.sample.dp.state;

import org.apache.log4j.Logger;

/**
 * TODO
 *
 * Create Time: 2019-04-10 16:41
 * Last Modify: 2019-05-24
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
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
