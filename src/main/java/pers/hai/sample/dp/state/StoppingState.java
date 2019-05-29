package pers.hai.sample.dp.state;

/**
 * TODO
 *
 * Create Time: 2019-04-10 16:46
 * Last Modify: 2019-05-24
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class StoppingState extends State {

    @Override
    public void open() {
        this.context.switchState(Lift.openningState);
        this.context.open();
    }

    @Override
    public void close() {
        throw new StateLimitException("电梯已停止，无法关闭");
    }

    @Override
    public void run() {
        this.context.switchState(Lift.runningState);
        this.context.run();
    }

    @Override
    public void stop() {
        logger.info("电梯已停止运行");
    }
}
