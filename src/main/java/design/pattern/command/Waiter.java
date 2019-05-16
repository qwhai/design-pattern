package design.pattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Q-WHai
 * @Date: Created in 10:53 2019/05/14
 */
public class Waiter {
    private List<Command> commands = new ArrayList<>();

    // 添加订单命令
    public void addCommand(Command command) {
        this.commands.add(command);
    }

    public void update() {
        for (Command cmd : commands) {
            cmd.execute();
        }
    }
}
