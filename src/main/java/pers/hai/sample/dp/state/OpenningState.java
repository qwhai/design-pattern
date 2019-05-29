package pers.hai.sample.dp.state;

/**
 * TODO
 *
 * Create Time: 2019-04-10 16:44
 * Last Modify: 2019-05-24
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class OpenningState extends State {

    @Override
    public void open() {
        logger.info("电梯正在开门...");
    }

    @Override
    public void close() {
        this.context.switchState(Lift.closingState);
        this.context.close();
    }

    @Override
    public void run() {
        throw new StateLimitException("电梯正在开门，无法运行");
    }

    @Override
    public void stop() {
        throw new StateLimitException("电梯正在开门，无法停止");
    }
}
