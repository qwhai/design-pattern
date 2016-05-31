package org.design.pattern.strategy.poke;

import org.design.pattern.strategy.interf.FormatTime;

/**
 * <p>
 * 盛放策略的容器
 * </p>
 * 2015年12月15日
 * 
 * @author <a href="http://weibo.com/u/5131020927">Q-WHai</a>
 * @see <a href="http://blog.csdn.net/lemon_tree12138">http://blog.csdn.net/lemon_tree12138</a>
 * @version 0.1
 */
public class StrategyContains {

    private FormatTime formatTime;
    
    public StrategyContains(FormatTime _formatTime) {
        this.formatTime = _formatTime;
    }
    
    public String format(long millis) {
        return formatTime.format(millis);
    }
}
