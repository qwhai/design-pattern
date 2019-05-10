package design.pattern.command2;

import java.util.Iterator;
import java.util.Stack;

/**
 * @Description TODO
 * @Author: Q-WHai
 * @Date: Created in 18:18 2019/04/12
 */
public class MacroCommand implements ICommand {

    private Stack commands = new Stack();

    @Override
    public void execute() {
        Iterator iterator = commands.iterator();
        while (iterator.hasNext()) {
            ((ICommand) iterator.next()).execute();
        }
    }

    public void append(ICommand cmd) {
        if (cmd != this) {
            commands.push(cmd);
        }
    }

    public void undo() {
        if (commands.empty()) return;
        commands.pop();
    }

    public void clear() {
        commands.clear();
    }
}
