package design.pattern.command;

import design.pattern.command.cmd.Command;

import java.util.Iterator;
import java.util.Stack;

/**
 * @Description 指令序列
 * @Author Q-WHai
 * @Date 2019/4/13 15:37
 */
public class MacroCommand implements Command {
    private Stack<Command> commands = new Stack<>();

    @Override
    public void execute() {
        // TODO
        Iterator iterator = commands.iterator();
        while (iterator.hasNext()) {
            ((Command) iterator.next()).execute();
        }
    }

    public void append(Command cmd) {
        if (this != cmd) {
            commands.add(cmd);
        }
    }

    public void undo() {
        // TODO
    }

    public void clear() {
        commands.clear();
    }
}
