package org.design.pattern.strategy.interf;

/**
 * <p>
 * 格式化时间接口
 * </p>
 * <p>
 * 所有策略的公用接口
 * </p>
 * 2015年12月15日
 * 
 * @author <a href="http://weibo.com/u/5131020927">Q-WHai</a>
 * @see <a href="http://blog.csdn.net/lemon_tree12138">http://blog.csdn.net/lemon_tree12138</a>
 * @version 0.1
 */
public interface FormatTime {

    public String format(long millis);
}
