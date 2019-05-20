package design.pattern.command;

import design.pattern.command.cmd.Command;

import java.util.Stack;

/**
 * 手机计算器对象（用于当作ComputeCore的代理）
 *
 * Create Time: 2019-05-20 10:32
 * Last Modify: 2019-05-20
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class MobileCalculator implements Computable, CommandAttachable {

    private ComputeCore core = new ComputeCore();
    private ComputeResult result = new ComputeResult();

    // 历史命令，用于命令撤消
    private Stack<Command> undoCmdStack = new Stack<>();
    // 撤消历史命令，用于命令还原
    private Stack<Command> redoCmdStack = new Stack<>();

    @Override
    public void add(double x) {
        result.setResult(core.add(result.getResult(), x));
    }

    @Override
    public void sub(double x) {
        result.setResult(core.sub(result.getResult(), x));
    }

    @Override
    public void mul(double x) {
        result.setResult(core.mul(result.getResult(), x));
    }

    @Override
    public void div(double x) {
        result.setResult(core.div(result.getResult(), x));
    }

    @Override
    public void attachUndo(Command command) {
        undoCmdStack.add(command);
    }

    @Override
    public void attachRedo(Command command) {
        redoCmdStack.add(command);
    }

    @Override
    public void undo() {
        Command cmd = undoCmdStack.pop();
        cmd.undo();
    }

    @Override
    public void redo() {
        Command cmd = redoCmdStack.pop();
        cmd.redo();
    }

    public double getResult() {
        return result.getResult();
    }
}
