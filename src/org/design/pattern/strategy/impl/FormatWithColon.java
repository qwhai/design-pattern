package org.design.pattern.strategy.impl;

import org.design.pattern.strategy.interf.FormatTime;
import org.utils.naga.str.StringUtils;

/**
 * <p>
 * 使用冒号来格式化。比如：10:58:36
 * </p>
 * 2015年12月15日
 * 
 * @author <a href="http://weibo.com/u/5131020927">Q-WHai</a>
 * @see <a href="http://blog.csdn.net/lemon_tree12138">http://blog.csdn.net/
 *      lemon_tree12138</a>
 * @version 0.1
 */
public class FormatWithColon implements FormatTime {

    @Override
    public String format(long millis) {
        int s = (int) (millis / 1000);

        int h = s / (60 * 60);
        s = s % (60 * 60);

        int m = s / 60;
        s = s % 60;

        return StringUtils.formatIntegerString(h, "#00") + ":"
                + StringUtils.formatIntegerString(m, "#00") + ":"
                + StringUtils.formatIntegerString(s, "#00");
    }
}
