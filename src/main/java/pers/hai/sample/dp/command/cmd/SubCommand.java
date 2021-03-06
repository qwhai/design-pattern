package pers.hai.sample.dp.command.cmd;

import pers.hai.sample.dp.command.CommandAttachable;
import pers.hai.sample.dp.command.Computable;

/**
 * 减法
 *
 * Create Time: 2019-05-20 14:51
 * Last Modify: 2019-05-20
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class SubCommand implements Command {

    private double x;
    private Computable computable;

    public SubCommand(double x, Computable computable) {
        this.x = x;
        this.computable = computable;
    }

    @Override
    public void calculate() {
        computable.sub(x);
        if (computable instanceof CommandAttachable) {
            ((CommandAttachable) computable).attachUndo(this);
        }
    }

    @Override
    public void undo() {
        computable.add(x);
        if (computable instanceof CommandAttachable) {
            ((CommandAttachable) computable).attachRedo(this);
        }
    }

    @Override
    public void redo() {
        calculate();
    }
}
