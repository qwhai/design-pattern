package design.pattern.command;

/**
 * @Author: Q-WHai
 * @Date: Created in 10:52 2019/05/14
 */
public class BakeMuttonCommand extends Command {

    public BakeMuttonCommand(Barkbecuer receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        receiver.bakeMutton();
    }
}
