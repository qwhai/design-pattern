package org.design.pattern.strategy.client;

import org.design.pattern.strategy.impl.FormatWithColon;
import org.design.pattern.strategy.poke.StrategyContains;

/**
 * <p>
 * 策略模式测试类
 * </p>
 * 2015年12月15日
 * 
 * @author <a href="http://weibo.com/u/5131020927">Q-WHai</a>
 * @see <a href="http://blog.csdn.net/lemon_tree12138">http://blog.csdn.net/lemon_tree12138</a>
 * @version 0.1
 */
public class FormatTimeClient {

    public static void main(String[] args) {
        StrategyContains strategy = new StrategyContains(new FormatWithColon());
        System.out.println(strategy.format(155796986));
    }
}
