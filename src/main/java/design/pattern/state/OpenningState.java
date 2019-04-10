package design.pattern.state;

/**
 * @Description TODO
 * @Author: Q-WHai
 * @Date: Created in 16:44 2019/04/10
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
