package pers.hai.sample.dp.state;

/**
 * TODO
 *
 * Create Time: 2019-04-10 16:45
 * Last Modify: 2019-05-24
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class ClosingState extends State {

    @Override
    public void open() {
        this.context.switchState(Lift.openningState);
        this.context.open();
    }

    @Override
    public void close() {
        logger.info("电梯正在关门，请稍等");
    }

    @Override
    public void run() {
        this.context.switchState(Lift.runningState);
        this.context.run();
    }

    @Override
    public void stop() {
        throw new StateLimitException("电梯正在关门，无法停止");
    }
}
