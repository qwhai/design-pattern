package org.design.pattern.proxy.reflect;

/**
 * <p>
 * 学生接口
 * </p>
 * 2015年12月17日
 * 
 * @author <a href="http://weibo.com/u/5131020927">Q-WHai</a>
 * @see <a href="http://blog.csdn.net/lemon_tree12138">http://blog.csdn.net/lemon_tree12138</a>
 * @version 0.1
 */
public interface Student {

    /**
     * 学生都需要考试
     * 
     * @return
     *      分数
     */
    public void examinate();
    
    /**
     * 考完试就要宣布成绩了
     */
    public void announce();
    
}
