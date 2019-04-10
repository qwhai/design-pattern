package design.pattern.state;

/**
 * @Description TODO
 * @Author: Q-WHai
 * @Date: Created in 16:46 2019/04/10
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
