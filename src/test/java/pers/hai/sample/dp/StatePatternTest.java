package pers.hai.sample.dp;

import pers.hai.sample.dp.state.Lift;
import pers.hai.sample.dp.state.StoppingState;
import org.junit.Test;

/**
 * TODO
 *
 * Create Time: 2019-04-10 16:40
 * Last Modify: 2019-05-24
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class StatePatternTest {

    // 正常情况下的测试
    @Test
    public void test1() {
        Lift context = new Lift(new StoppingState());
        context.open();
        context.close();
        context.run();
        context.stop();
        context.open();
        context.close();
    }

    // 异常情况下的测试
    @Test
    public void test2() {
        Lift context = new Lift(new StoppingState());
        context.close();
        context.open();
        context.close();
        context.run();
        context.open();
        context.stop();
        context.open();
        context.close();
    }
}
