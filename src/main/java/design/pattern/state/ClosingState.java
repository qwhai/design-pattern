package design.pattern.state;

/**
 * @Description TODO
 * @Author: Q-WHai
 * @Date: Created in 16:45 2019/04/10
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
