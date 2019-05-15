package design.pattern;

import design.pattern.command.*;
import org.junit.Test;

/**
 * @Description TODO
 * @Author: Q-WHai
 * @Date: Created in 18:05 2019/04/12
 */
public class CommandPatternTest {

    @Test
    public void test1() {
        Barkbecuer barkbecuer = new Barkbecuer();
        Command cmd1 = new BakeMuttonCommand(barkbecuer);
        Command cmd2 = new BakeChickenWingCommand(barkbecuer);

        Waiter waiter = new Waiter();
        waiter.addCommand(cmd1);
        waiter.addCommand(cmd2);

        waiter.update();
    }

    @Test
    public void test2() {
        Barkbecuer barkbecuer = new Barkbecuer();
        Command cmd1 = new BakeMuttonCommand(barkbecuer);
        Command cmd2 = new BakeChickenWingCommand(barkbecuer);
        Command cmd3 = new BakeChickenWingCommand(barkbecuer);

        Waiter waiter = new Waiter();
        waiter.addCommand(cmd1);
        waiter.addCommand(cmd2);
        waiter.addCommand(cmd3);

        waiter.undoCommand(cmd2);

        waiter.update();
    }
}
