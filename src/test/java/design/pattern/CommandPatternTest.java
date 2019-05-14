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
        // TODO
        Barkbecuer barkbecuer = new Barkbecuer();
        Command cmd1 = new BakeMuttonCommand(barkbecuer);
        Command cmd2 = new BakeChickenWingCommand(barkbecuer);

        Waiter waiter = new Waiter();
        waiter.setOrder(cmd1);
        waiter.setOrder(cmd2);

        waiter.notifyy();
    }
}
