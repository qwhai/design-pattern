package design.pattern.command;

import design.pattern.command.cmd.Command;

/**
 * 可附加命令
 *
 * Create Time: 2019-05-20 15:03
 * Last Modify: 2019-05-20
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public interface CommandAttachable {
    void attachUndo(Command command);
    void attachRedo(Command command);
}
