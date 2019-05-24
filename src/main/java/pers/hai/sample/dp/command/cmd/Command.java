package pers.hai.sample.dp.command.cmd;

/**
 * TODO
 * <p>
 * Create Time: 2019-05-20 10:28
 * Last Modify: 2019-05-20
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public interface Command {
    void calculate();
    void undo();
    void redo();
}
