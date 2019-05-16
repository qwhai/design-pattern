package design.pattern.command;

/**
 * @Author: Q-WHai
 * @Date: Created in 10:53 2019/05/14
 */
public class BakeChickenWingCommand extends Command {

    public BakeChickenWingCommand(Barkbecuer receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        receiver.bakeChickenWing();
    }

    @Override
    public void undo() {
        // TOOD
    }

    @Override
    public void redo() {
        // TOOD
    }
}
