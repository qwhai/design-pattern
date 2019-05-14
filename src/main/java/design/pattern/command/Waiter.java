package design.pattern.command;

/**
 * @Author: Q-WHai
 * @Date: Created in 10:53 2019/05/14
 */
public class Waiter {
    private Command command;

    // 设置订单
    public void setOrder(Command command) {
        this.command = command;
    }

    public void notifyy() {
        command.execute();
    }
}
