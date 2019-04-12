package design.pattern;

import design.pattern.state.Lift;
import design.pattern.state.StoppingState;
import org.junit.Test;

/**
 * @Description TODO
 * @Author: Q-WHai
 * @Date: Created in 16:40 2019/04/10
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
