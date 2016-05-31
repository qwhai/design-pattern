package org.design.pattern.state.client;

import org.design.pattern.state.context.Context;
import org.design.pattern.state.state.ClosingState;

/**
 * <p>
 * 模拟电梯的动作
 * </p>
 * 2015年12月28日
 * 
 * @author <a href="http://weibo.com/u/5131020927">Q-WHai</a>
 * @see <a href="http://blog.csdn.net/lemon_tree12138">http://blog.csdn.net/lemon_tree12138</a>
 * @version 0.1
 */
public class StateClient {

    public static void main(String[] args) {
        Context context = new Context();
        context.setLiftState(new ClosingState());
        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
