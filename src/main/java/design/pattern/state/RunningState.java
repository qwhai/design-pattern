package design.pattern.state;

/**
 * @Description TODO
 * @Author: Q-WHai
 * @Date: Created in 16:46 2019/04/10
 */
public class RunningState extends State {

    @Override
    public void open() {
        throw new StateLimitException("电梯正在运行，无法进行开门操作");
    }

    @Override
    public void close() {
        throw new StateLimitException("电梯正在运行，无法进行关门操作");
    }

    @Override
    public void run() {
        logger.info("电梯正在运行中...");
    }

    @Override
    public void stop() {
        this.context.switchState(Lift.stoppingState);
        this.context.stop();
    }
}
