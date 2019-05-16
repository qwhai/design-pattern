package design.pattern.command;

/**
 * @Author: Q-WHai
 * @Date: Created in 10:49 2019/05/14
 */
public abstract class Command {
    protected Barkbecuer receiver;

    // 确定命令执行者
    public Command(Barkbecuer receiver) {
        this.receiver = receiver;
    }

    // 执行命令
    public abstract void execute();

    // 撤消
    public abstract void undo();

    // 恢复
    public abstract void redo();
}
